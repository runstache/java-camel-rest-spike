package com.lswebworld.camelrestspike.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RestRoute extends RouteBuilder {

  @Override
  public void configure() throws Exception {

    restConfiguration().component("spark-rest").port(8090);

    rest("/api")
      .post("/stat").to("direct:message");

    from("direct:message")
      .routeId("restroute")
      .to("bean:MessageProcessor")
      .end();

      

  }

}