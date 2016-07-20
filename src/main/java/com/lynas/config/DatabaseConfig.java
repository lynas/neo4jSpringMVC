package com.lynas.config;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by LynAs on 7/20/2016
 */
@Configuration
@EnableNeo4jRepositories(basePackages = "com.lynas.repo")
@EnableTransactionManagement
public class DatabaseConfig extends Neo4jConfiguration{

    @Bean
    public SessionFactory getSessionFactory() {
        return new SessionFactory(getConfiguration(), "com.lynas.model");
    }

    @Bean
    public org.neo4j.ogm.config.Configuration getConfiguration(){
        org.neo4j.ogm.config.Configuration configuration = new org.neo4j.ogm.config.Configuration();
        configuration
                .driverConfiguration()
                .setDriverClassName("org.neo4j.ogm.drivers.http.driver.HttpDriver")
                .setURI("http://neo4j:123456@localhost:7474");

        return configuration;
    }

    @Bean
    @Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Session getSession() throws Exception {
        return super.getSession();
    }




}
