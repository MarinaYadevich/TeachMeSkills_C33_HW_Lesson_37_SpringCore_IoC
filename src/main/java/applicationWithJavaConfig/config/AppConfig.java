package applicationWithJavaConfig.config;

import applicationWithJavaConfig.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MessageService messageService(){
    return new MessageService();
    }
}
