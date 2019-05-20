package com.lswebworld.camelrestspike.configuration;

import com.lswebworld.camelrestspike.processors.MessageProcessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean(name = "MessageProcessor")
  public MessageProcessor messageProcessor() {
    return new MessageProcessor();
  }
}
