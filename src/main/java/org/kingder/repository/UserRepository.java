package org.kingder.repository;

import org.kingder.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description
 * @Author jianda.deng
 * @Time 2017/4/17 10:45
 */
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUserName(String userName);
	User findByUserNameOrEmail(String username, String email);
	List<User> findAll();
	Page<User> queryFirst2ByEmail(String email,Pageable pageable);

	@Transactional
	@Modifying
	@Query("update User  set userName = ?1 where id = ?2")
	int updateById(String  userName, Long id);

	@Transactional
	@Modifying
	@Query("delete from User where id = ?1")
	void deleteByUserId(Long id);

	@Transactional(timeout = 10)
	@Query("select u from User u where u.email = ?1")
	User findByEmail(String email);
	//List<User> findALL(Pageable pageable);
}