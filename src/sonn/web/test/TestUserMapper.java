package sonn.web.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sonn.web.entity.User;
import sonn.web.mapper.UserMapper;

public class TestUserMapper {
	@Test
	public void testFindAll() {
		String conf = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		UserMapper mapper = ac.getBean("userMapper", UserMapper.class);
		List<User> lst = mapper.findAll();
		for (User usr : lst) {
			System.out.println(usr.getUsrname() + ":" + usr.getPasswd());
		}
	}
}
