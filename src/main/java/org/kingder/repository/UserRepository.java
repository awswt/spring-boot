package org.kingder.repository;

import org.kingder.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description
 * @Author jianda.deng
 * @Time 2017/4/17 10:45
 */
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUserName(String userName);
	User findByUserNameOrEmail(String username, String email);
}