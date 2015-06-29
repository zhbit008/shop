package test;

import com.zhbit.domain.Company;
import com.zhbit.service.CompanyService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyServiceTest {
    private static CompanyService companyService;
    @BeforeClass
    public static  void setUpBeforeClass() throws Exception {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
            companyService = (CompanyService) applicationContext.getBean("companyService");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testAddCompany() throws  Exception {
        Company company=new Company(null,"mufeng","aa","123","ads",11);
        companyService.addCompany(company);
    }

}