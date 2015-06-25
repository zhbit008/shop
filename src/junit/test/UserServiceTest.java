package test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.junit.Assert.*;
import com.zhbit.service.*;
import com.zhbit.domain.*;
public class UserServiceTest {
    private static UserService userService;

    @BeforeClass
    public static  void setUpBeforeClass() throws Exception {
        try {
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
            userService = (UserService) applicationContext.getBean("userService");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    @Test
    public void testAddUser() throws Exception {
        User user = new User(null,-1, "12223","123","qwe",false);
        userService.addUser(user);
    }
}