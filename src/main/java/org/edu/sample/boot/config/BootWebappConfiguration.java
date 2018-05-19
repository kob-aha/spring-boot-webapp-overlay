package org.edu.sample.boot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.edu.sample.boot.controller"})
public class BootWebappConfiguration {

}
