package com.league.common.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@ConditionalOnProperty(prefix = "league", name = "spring-session-open", havingValue = "true")
public class SpringSessionConfig {

}
