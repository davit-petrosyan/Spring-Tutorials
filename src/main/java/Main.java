import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import statuses.Status;
import statuses.StatusImpl;

public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext context =  new AnnotationConfigApplicationContext(JavaConfig.class);
        StatusImpl status = context.getBean(StatusImpl.class);
        status.showStatus();
        context.close();
    }
}
