package oduoke.dao;

import oduoke.bean.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    private final SqlSession sqlSession;

    public UserDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public User selectCityById(long id) {
        return this.sqlSession.selectOne("findById", id);
    }
}
