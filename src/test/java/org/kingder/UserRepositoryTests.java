package org.kingder;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kingder.entity.User;
import org.kingder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author jianda.deng
 * @Time 2017/4/17 10:46
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void test() throws Exception {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String formattedDate = dateFormat.format(date);

		userRepository.save(new User("aa1", "aa@126.com", "aa", "aa123456",formattedDate));
		userRepository.save(new User("bb2", "bb@126.com", "bb", "bb123456",formattedDate));
		userRepository.save(new User("cc3", "cc@126.com", "cc", "cc123456",formattedDate));

		Assert.assertEquals(3, userRepository.findAll().size());
		Assert.assertEquals("bb123456", userRepository.findByUserName("bb2").getNickName());
		//userRepository.delete(userRepository.findByUserName("aa1"));
	}

	@Test
	public void test2(){
		int page=1,size=2;
		Sort sort = new Sort(Sort.Direction.DESC, "id");
		Pageable pageable = new PageRequest(page, size, sort);
		Page<User> s= userRepository.queryFirst2ByEmail("aa",pageable);
		List<User> u=s.getContent();
		System.out.println(s.getSize());
	}

	@Test
	public void test3(){
		User user =userRepository.findByEmail("bb");
		System.out.println(user.toString());

		int i=userRepository.updateById("dd",22L);
		System.out.println(i);

		userRepository.deleteByUserId(23L);
	}

}