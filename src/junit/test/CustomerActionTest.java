package test;

import com.zhbit.service.AdminService;
import com.zhbit.service.CompanyService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class CustomerActionTest {
    private static AdminService adminService;
    @BeforeClass
    public static  void setUpBeforeClass() throws Exception {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
            adminService = (AdminService) applicationContext.getBean("adminService");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testRegister(){
        if(adminService.registerValidate("11","11","11")){
            System.out.println("dadf");
        }
    }
    @Test
    public void testSave(){
        adminService.save("11","11");
    }
}