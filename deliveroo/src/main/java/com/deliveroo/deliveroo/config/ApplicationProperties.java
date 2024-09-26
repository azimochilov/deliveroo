package com.deliveroo.deliveroo.config;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {
    private final Minio minio = new Minio();
    @Setter
    @Getter
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Minio {
        String applicationName;
        String host;
        String username;
        String password;
    }
}
//@ConfigurationProperties used for binding extarnal properties to java class
//inside of it we got prefix, this is for naming inside the property file property name, to bind with this class
//If there are properties in your application.yml or application.properties file that are not mapped to fields
// in the ApplicationProperties class, so thats why we need ignoreUnknownfields
//@FieldDefaults(level = AccessLevel.PRIVATE) this is loombok anotation, which makes all fields private.

