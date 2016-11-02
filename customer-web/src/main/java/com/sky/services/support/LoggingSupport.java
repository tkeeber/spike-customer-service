package com.sky.services.support;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class LoggingSupport implements Support {

    private Logger logger;

    public LoggingSupport(Logger logger) {
        this.logger = logger;
    }

    public LoggingSupport() {
        this(getLogger(LoggingSupport.class));
    }

    public void onEntry(String loggingMessage) {
        logger.debug(loggingMessage);
    }
}
