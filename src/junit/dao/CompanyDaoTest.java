package dao;

import com.zhbit.dao.CompanyDao;
import com.zhbit.domain.Company;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CompanyDaoTest {
    private static CompanyDao companyDao;
    @BeforeClass
    public static  void setUpBeforeClass() throws Exception {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
            companyDao = (CompanyDao) applicationContext.getBean("companyDao");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetSave() throws Exception {
        Company company=new Company(9,"mufeng","aa","123","ads",11);

        companyDao.save(company);
        System.out.println("aa");
    }
}