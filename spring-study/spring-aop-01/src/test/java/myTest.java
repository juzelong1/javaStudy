import com.ju.service.userService;
import com.ju.service.userServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //spring中是动态代理，所以只会代理接口
        userService userService = (userService)context.getBean("userService");
        userService.add();
    }
}
