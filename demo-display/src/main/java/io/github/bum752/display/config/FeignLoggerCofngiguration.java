package io.github.bum752.display.config;

import feign.Logger;
import feign.Logger.Level;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignLoggerCofngiguration {

	@Bean
	Logger.Level feignLoggerLevel() {
		return Level.FULL;
	}
}
