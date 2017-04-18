package org.kingder;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kingder.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author jianda.deng
 * @Time 2017/4/18 10:39
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestRedis {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	public void test() throws Exception {
		stringRedisTemplate.opsForValue().set("aaa", "111");
		Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
	}

	@Test
	public void testObj() throws Exception {
		User user=new User("aa@126.com", "aa2222", "aa123456", "aa","123");
		ValueOperations<String, User> operations=redisTemplate.opsForValue();
		operations.set("com.neox", user);
		user.setId(587464l);
		operations.set("com.neo.f", user,1, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//redisTemplate.delete("com.neo.f");
		boolean exists=redisTemplate.hasKey("com.neo.f");
		if(exists){
			System.out.println("exists is true");
		}else{
			System.out.println("exists is false");
		}
		// Assert.assertEquals("aa", operations.get("com.neo.f").getUserName());
	}
}
