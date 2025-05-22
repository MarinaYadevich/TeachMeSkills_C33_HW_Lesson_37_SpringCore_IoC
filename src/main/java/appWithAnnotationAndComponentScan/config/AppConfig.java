package appWithAnnotationAndComponentScan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "appWithAnnotationAndComponentScan")
public class AppConfig {
}
