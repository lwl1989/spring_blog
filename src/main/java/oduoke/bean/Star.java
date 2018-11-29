package oduoke.bean;

import java.math.BigInteger;

public class Star {

    private Integer rank;

    private BigInteger sid;

    private Double score;

    private Integer rankType;


    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public BigInteger getSid() {
        return sid;
    }

    public void setSid(BigInteger sid) {
        this.sid = sid;
    }

    public Integer getRankType() {
        return rankType;
    }

    public void setRankType(Integer rankType) {
        this.rankType = rankType;
    }

    @Override
    public String toString() {
        return "Star{" +
                "rank=" + rank +
                ", score=" + score +
                '}';
    }
}
