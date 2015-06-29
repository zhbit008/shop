package test;

import com.zhbit.domain.Product;
import com.zhbit.service.ProductService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ProductServiceImplTest {
    private static ProductService productService;

    @BeforeClass
    public static  void setUpBeforeClass() throws Exception {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
            productService = (ProductService) applicationContext.getBean("productService");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetAllProduct() throws Exception {
        List<Product> listProduct=productService.getAllProduct();
        for (Product product : listProduct) {
            System.out.println(product.getId());
        }
    }

    @Test
    public void testGetProduct() throws Exception {
        Product product = productService.getProduct("GE00010伊丽莎白餐厅家具");
        System.out.println(product.getImage());
    }
    @Test
    public void testGetSomeProduct() throws Exception{
        List<Product> listProduct=productService.getSomeProduct(1,6);
        for (Product product : listProduct) {
            System.out.println(product.getId());
        }
    }

    @Test
    public void testGetProductByType() throws Exception{
//        productService.getProductByType();
    }
}