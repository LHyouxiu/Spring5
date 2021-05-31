import com.kuang.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.search();
    }

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("diy");
        userService.add();
    }

    @Test
    public void test03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("annabeans.xml");
        UserService userService = (UserService) context.getBean("annotationPointcut");
        userService.search();
    }
}
