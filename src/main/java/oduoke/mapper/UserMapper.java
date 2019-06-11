package oduoke.mapper;

import oduoke.bean.User;
import org.apache.ibatis.annotations.*;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("Select * from users where id = #{id}")
    User findById(@Param("id") Long id);

    @Select("Select * from users where state = #{state}")
    User findByState(@Param("state") String state);

    @Select("SELECT * FROM users")
    @Results({
            @Result(property = "age",  column = "age"),
            @Result(property = "nickName", column = "nick_name")
    })
    List<User> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    @Results({
            @Result(property = "age",  column = "age"),
            @Result(property = "nickName", column = "nick_name")
    })
    User getOne(Long id);

    @Insert("INSERT INTO users(userName,age) VALUES(#{userName}, #{age})")
    void insert(User user);

    @Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    void update(User user);

    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(Long id);

}
