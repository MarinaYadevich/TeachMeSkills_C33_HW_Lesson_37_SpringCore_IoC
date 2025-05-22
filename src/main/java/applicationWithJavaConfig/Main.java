package applicationWithJavaConfig;

import applicationWithJavaConfig.config.AppConfig;
import applicationWithJavaConfig.service.MessageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Application which uses Spring through JavaConfig.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageService service = context.getBean(MessageService.class);
        service.printMessage();
        context.close();
    }
}
