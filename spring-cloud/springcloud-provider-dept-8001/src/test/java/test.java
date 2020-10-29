import com.ju.service.DeptServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class test {
    @Autowired
    private DeptServiceImpl deptService;

    @Test
    public void getAll() {
        System.out.println(deptService.queryAll());
    }
}
