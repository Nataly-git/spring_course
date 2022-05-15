package spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("spring_introduction")
@PropertySource("myApp.properties")
public class MyConfig {

    @Bean
//    @Scope("prototype")
    public Pet cat() {
        return new Cat();
    }

    @Bean
    public Person person() {
        return new Person(cat());
    }

}
