package com.sample.webapp.groovy;

import java.io.InputStream;
import org.apache.log4j.LogManager;
import org.apache.commons.io.IOUtils;

 class Greeter {
     def getGreeting() throws Exception {
        LogManager.getRootLogger().info("generating greeting.")
        InputStream greetingStr = getClass().getResourceAsStream("/greeting.txt")
        try {
            return IOUtils.toString(greetingStr).trim()
        }
        finally {
            greetingStr.close()
        }
    }
}
