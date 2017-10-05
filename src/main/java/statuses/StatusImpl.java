package statuses;




import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class StatusImpl implements Status {
    @InjectRandomInt(min=2, max=7)
    private int repeat;

    private String text;

    public void setText(String text){
        this.text = text;
    }

    @PostConstruct
    public void init(){
        System.out.println("Phase 2 : " + repeat);

    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bye Bye baby");
    }

    public StatusImpl(){
        System.out.println("Phase 1 : " + repeat);
    }
    public void showStatus() {
        for (int i = 0; i < repeat ; i++) {
            System.out.println("Status: " + text);

        }
    }
}
