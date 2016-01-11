package com.chbuck.demo.thymeleaf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;

/**
 * Thymeleaf configuration
 *
 * @author Christian Buck (buck18)
 * @version 1.0
 */
@Configuration
public class ThymeleafConfig {

    /**
     * Makes the #temporals object to be used in the thymeleaf templates.
     *
     * With Spring Boot all beans of type org.thymeleaf.dialect.IDialect are
     * injected into Spring Boot’s ThymeleafAutoConfiguration and added to
     * Thymeleaf’s SpringTemplateEngine automatically.
     */
    @Bean
    public Java8TimeDialect java8TimeDialect() {
        return new Java8TimeDialect();
    }
}
