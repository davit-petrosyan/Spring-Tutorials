import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import statuses.InjectRandomIntAnnotationBeanPostProcessor;
import statuses.Status;
import statuses.StatusImpl;

@Configuration
public class JavaConfig {

    @Bean
    public Status status(){
        StatusImpl status =  new StatusImpl();
        status.setText("Bla bla Bla");
        return status;
    }

    @Bean
    public InjectRandomIntAnnotationBeanPostProcessor injectRandomInt(){
        return new InjectRandomIntAnnotationBeanPostProcessor();
    }
}
  