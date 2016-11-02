package com.sky.services.support;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class LoggingSupportTest {

    @Mock
    private Logger mockLogger;

    @Test
    public void onEntry() {
        final String loggingMessage = "loggingMessage";
        LoggingSupport loggingSupport = new LoggingSupport(mockLogger);
        loggingSupport.onEntry(loggingMessage);
        verify(mockLogger).debug(loggingMessage);
    }

    @Test
    public void smoke() {
        new LoggingSupport();
    }
}
