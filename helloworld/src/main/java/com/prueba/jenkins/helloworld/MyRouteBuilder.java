package com.prueba.jenkins.helloworld;

import org.apache.camel.Message;
import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java8 DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

        from("timer:simple?period=1000")
            .log("Hello World, From Camel To The World.");
    }

}
