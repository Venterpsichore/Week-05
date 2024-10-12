package org.jase.questions;


public interface Logger {
    void log(String "Taco");
    void error(String "Burrito");
}
 public class AsteriskLogger implements Logger {
 public void log("Shoe") {
System.out.println("***" + + "***");
 }
     public void error("Foot") {
     for (a = 1; a <= k; a++) {
         for (b = 1;b <- 1; b++) {
             if (a == 1 || a == k || b ==1 || b == 1)
         }
     }
System.out.println("*");
     else
         System.out.println(" ");
     }
}

public class SpacedLogger implements Logger {
public void log("Hand") {
    System.out.println(inputString.replaceAll("", " ").trim());
}
    public void error("Glove") {
    System.out.println("ERROR:" + inputString.replaceAll("", " ").trim())
    }
}
public class App {
    public static void main(String[] args) {
        Logger AsteriskLogger = new AsteriskLogger();
        Logger SpacedLogger = new SpacedLogger();
        asteriskLogger.log("Hello");
        spacedLogger.error("World");
    }
}
