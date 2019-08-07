package com.dtdhehe.blogs.mapper;

import com.dtdhehe.blogs.entity.User;
import org.apache.ibatis.annotations.*;

/**
 * @author Xie_东
 * @version 1.0
 * @date 2019/8/5 22:20
 * @description
 **/
@Mapper
public interface UserMapper {

    /**
     * 根据用户名查找user
     * @param userName
     * @return
     */
    @Select("select t.* from user t where t.user_name=#{userName}")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "roleList",column = "id",
                    many = @Many(select = "com.dtdhehe.blogs.mapper.RoleMapper.findRoleByUserId"))
    })
    User findByUserName(@Param("userName") String userName);

    /**
     * 保存用户
     * @param user
     * @return
     */
    @Insert("insert into user(id,user_name,password,gender,valid) VALUES(#{id},#{userName},#{password},#{gender},#{valid});")
    Integer save(User user);
}
