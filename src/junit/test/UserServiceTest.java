package test;

import com.zhbit.domain.User;
import com.zhbit.service.UserService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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