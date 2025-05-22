package appWithAnnotationAndComponentScan;

import appWithAnnotationAndComponentScan.config.AppConfig;
import appWithAnnotationAndComponentScan.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Application which uses Spring through Annotation and ComponentScan.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageService service = context.getBean(MessageService.class);
        service.printMessage();
    }
}
