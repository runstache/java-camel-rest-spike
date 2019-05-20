package com.lswebworld.camelrestspike.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageProcessor implements Processor {

  private static final Logger LOGGER = LoggerFactory.getLogger(MessageProcessor.class);

  @Override
  public void process(Exchange exchange) throws Exception {
    String body = exchange.getIn().getBody().toString();
    LOGGER.info(body);
    //exchange.getIn().setBody("updated");
  }

}