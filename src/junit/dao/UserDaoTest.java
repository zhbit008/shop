package dao;

import com.zhbit.dao.UserDao;
import com.zhbit.domain.User;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UserDaoTest {
    private static UserDao userDao;
    @BeforeClass
    public static  void setUpBeforeClass() throws Exception {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
            userDao = (UserDao) applicationContext.getBean("userDao");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetUsertList() throws Exception {
        List<User> userList = userDao.getUsertList();
        System.out.println(userList.size());
    }
}