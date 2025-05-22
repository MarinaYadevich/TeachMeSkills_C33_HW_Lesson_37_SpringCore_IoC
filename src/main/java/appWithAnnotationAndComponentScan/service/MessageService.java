package appWithAnnotationAndComponentScan.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
    @Value("Marina")
    private String name;

    public void printMessage(){
        System.out.println("To: " + name + "\nHello from Spring! This is a bean created via Annotation and ComponentScan.");
    }
}
