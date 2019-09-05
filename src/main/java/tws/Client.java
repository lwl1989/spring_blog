/* Copyright (C) 2013 Interactive Brokers LLC. All rights reserved.  This code is subject to the terms
 * and conditions of the IB API Non-Commercial License or the IB API Commercial License, as applicable. */

package tws;


import java.util.ArrayList;


import com.ib.client.Contract;
import com.ib.client.Types;
import com.ib.client.Types.NewsType;
import com.ib.controller.ApiConnection.ILogger;
import com.ib.controller.ApiController;
import com.ib.controller.ApiController.IBulletinHandler;
import com.ib.controller.ApiController.IConnectionHandler;
import com.ib.controller.ApiController.ITimeHandler;
import com.ib.controller.Bar;
import com.ib.controller.Formats;


public class Client implements IConnectionHandler,ApiController.IRealTimeBarHandler {
   // static { NewLookAndFeel.register(); }
    public static Client INSTANCE;

    private final IConnectionConfiguration m_connectionConfiguration;
    private final Logger m_inLogger = new Logger( );
    private final Logger m_outLogger = new Logger( );

    @Override
    public void realtimeBar(Bar bar) {
        System.out.println(bar);
    }

    // getter methods

    private ApiController m_controller;
    public static void main(String[] args) {
        start( new Client( new IConnectionConfiguration.DefaultConnectionConfiguration()) );
    }
    public ILogger getInLogger()            { return m_inLogger; }
    public ILogger getOutLogger()           { return m_outLogger; }
    public static void start( Client Client ) {
        INSTANCE = Client;
        INSTANCE.run();
        Contract c = ContractSamples.Bond();
        System.out.println(c);
        INSTANCE.controller().reqRealTimeBars(c, Types.WhatToShow.TRADES, false, INSTANCE);
    }

    public Client( IConnectionConfiguration connectionConfig ) {
        m_connectionConfiguration = connectionConfig;
    }

    public ApiController controller() {
        if ( m_controller == null ) {
            m_controller = new ApiController( this, getInLogger(), getOutLogger() );
        }
        return m_controller;
    }

    private void run() {
        controller().connect( "127.0.0.1", 7496, 0, m_connectionConfiguration.getDefaultConnectOptions() != null ? "" : null );
    }

    @Override public void connected() {
        show( "connected");

        controller().reqCurrentTime( new ITimeHandler() {
            @Override public void currentTime(long time) {
                show( "Server date/time is " + Formats.fmtDate(time * 1000) );
            }
        });

        controller().reqBulletins( true, new IBulletinHandler() {
            @Override public void bulletin(int msgId, NewsType newsType, String message, String exchange) {
                String str = String.format( "Received bulletin:  type=%s  exchange=%s", newsType, exchange);
                show( str);
                show( message);
            }
        });
    }

    @Override public void disconnected() {
        show( "disconnected");
    }

    @Override public void accountList(ArrayList<String> list) {
        show( "Received account list");
    }

    @Override public void show( final String str) {

    }

    @Override public void error(Exception e) {
        show( e.toString() );
    }

    @Override public void message(int id, int errorCode, String errorMsg) {
        show( id + " " + errorCode + " " + errorMsg);
    }

//    private class ConnectionPanel {
//
//
//        protected void onConnect() {
//            int port = Integer.parseInt("1234");
//            int clientId = Integer.parseInt( "3001" );
//            controller().connect( "3001", port, clientId, m_connectOptionsTF.getText());
//        }
//    }

    private static class Logger implements ILogger {

        Logger( ) {

        }

        @Override public void log(final String str) {
        }
    }

}

