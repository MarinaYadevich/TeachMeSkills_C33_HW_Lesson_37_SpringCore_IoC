package applicationWithXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application which uses Spring through XML.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");

        MessageService messageService = context.getBean(MessageService.class);
        messageService.printMessage("Marina");
    }
}
