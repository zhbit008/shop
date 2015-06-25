//package junit.test;
//
//import java.util.List;
//
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//
//import com.zhbit.admin.domain.Student;
//import com.zhbit.admin.service.StudentManageService;
//
//public class StudentManageServiceBeanTest {
//
//	private static StudentManageService service;
//
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		try {
//			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//			service = (StudentManageService) applicationContext.getBean("studentManageService");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void testAddNewStudent() {
//		try {
//			service.addNewStudent(new Student("李四",18,SexEnum.BOY));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void testFindAllStudent() {
//		List<Student> students = service.findAllStudent();
//		for (Student student: students){
//			System.out.println(student);
//		}
//	}
//}
