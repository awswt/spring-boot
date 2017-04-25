package org.kingder.mapper;

import org.apache.ibatis.annotations.*;
import org.kingder.domain.UserEntity;
import org.kingder.enums.UserSexEnum;

import java.util.List;

/**
 * @Description
 * @Author jianda.deng
 * @Time 2017/4/19 16:47
 */
public interface UserMapper {
	@Select("SELECT * FROM users")
	@Results({
			@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
			@Result(property = "nickName", column = "nick_name")
	})
	List<UserEntity> getAll();

	@Select("SELECT * FROM users WHERE id = #{id}")
	@Results({
			@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
			@Result(property = "nickName", column = "nick_name")
	})
	UserEntity getOne(Long id);

	@Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
	void insert(UserEntity user);

	@Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
	void update(UserEntity user);

	@Delete("DELETE FROM users WHERE id =#{id}")
	void delete(Long id);


}
