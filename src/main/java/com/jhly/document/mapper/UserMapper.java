package com.jhly.document.mapper;

import com.jhly.document.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Auther:JHLY
 * @Date:2019/10/2
 * @Description:com.jhly.document.mapper
 * @Version:1.0
 */
@Mapper
public interface UserMapper {

    @Select("select count(1) from user where uName = #{uName} and uPassword = #{uPassword}")
    int selectUser(@Param("uName") String uName ,@Param("uPassword") String uPassword);


    @Select("select * from user where uName = #{uName} and uPassword = #{uPassword}")
    User selectTheUser(@Param("uName") String uName ,@Param("uPassword") String uPassword);

    @Insert("insert into user (uName,uPassword,bio) values (#{uName},#{uPassword},#{bio})")
    int insertTheUser(User user);

    @Select("select * from user where uId = #{uId}")
    User selectById(@Param("uId") Integer uId);
}
