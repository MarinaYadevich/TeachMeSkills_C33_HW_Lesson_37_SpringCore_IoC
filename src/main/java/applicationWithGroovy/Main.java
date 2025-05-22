package applicationWithGroovy;

import org.springframework.context.support.GenericGroovyApplicationContext;

/**
 * Application which uses Spring through Groovy.
 */
public class Main {
    public static void main(String[] args) {
        GenericGroovyApplicationContext context = new GenericGroovyApplicationContext("application.groovy");
        MessageService service = context.getBean("messageService", MessageService.class);
        service.printMessage();
        context.close();
    }
}
