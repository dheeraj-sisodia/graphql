package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;
import graphql.scalars.ExtendedScalars;

@Configuration
public class DateScalarConfiguration {

    @Bean
    public RuntimeWiringConfigurer runtimeWiringConfigurer() {
        RuntimeWiringConfigurer result = wiringBuilder -> wiringBuilder.scalar(ExtendedScalars.Date).scalar(ExtendedScalars.GraphQLLong);
        return result;
    }

}
