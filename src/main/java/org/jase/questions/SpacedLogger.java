package org.jase.questions;

public class SpacedLogger implements Logger {

    // Prints String addSpaces made up of inputted messages undergoing .split w/ delimiter
    @Override
    public void log(String message) {
        System.out.println(addSpaces(message));
    }

    // Precedes addSpaces message w/ "Error: "
    @Override
    public void error(String error) {
        System.out.println("Error: " + addSpaces(error));
    }

    private String addSpaces(String str) {
        return String.join(" ", str.split(""));
    }
}