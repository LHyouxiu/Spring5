import com.kuang.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
//    xml文件确定了父子引用，引用父级或单独引用都可生成
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.search();
    }

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }

    @Test
    public void test03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("annabeans.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.search();
    }
}
