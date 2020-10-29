import Dao.UserDaoImpl;
import Dao.UserDaoMysqlImpl;
import Service.UserService;
import Service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testUserService {

    public static void main(String[] args) {

        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService1 = (UserServiceImpl) context.getBean("userService");
        userService1.getUser();


    }
}
