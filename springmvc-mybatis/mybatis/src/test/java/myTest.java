import com.ju.pojo.Books;
import com.ju.service.BookService;
import com.ju.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class myTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = applicationContext.getBean("BookServiceImpl", BookServiceImpl.class);
        List<Books> books = bookServiceImpl.selectAllBook();
        for (Books book : books) {
            System.out.println(book);
        }
    }
}
