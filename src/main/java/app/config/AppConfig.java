package app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration             //обозначает класс как конфигурационный, который содержит определения бинов
@ComponentScan(basePackages = "app") // используется для указания пакетов, которые должны быть
                                     // отсканированы Spring для поиска и автоматического создания бинов
public class AppConfig {

}
