package org.jase.questions;

// Inputting arbitrary messages for the implementation to work with. Loggers needed to be instantiated before anything.
public class App {
    public static void main(String[] args) {
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");
        spacedLogger.log("World");
        spacedLogger.error("World");
    }
}
