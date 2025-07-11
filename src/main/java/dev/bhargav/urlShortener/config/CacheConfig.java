package dev.bhargav.urlShortener.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Configuration class for creating a cache of short codes and URLs.

@Configuration
public class CacheConfig {

    @Bean
    public Map<String, String> cache() {
        return new ConcurrentHashMap<>();
    }
}
