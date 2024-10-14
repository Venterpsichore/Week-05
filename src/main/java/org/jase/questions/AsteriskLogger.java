package org.jase.questions;

// References interface
public class AsteriskLogger implements Logger {

    // Setting up the constant of 3 asterisks to be reused
    private static final String MESSAGE_ASTERISKS = "***";

    // Marking the methods w/ @Override because they implement interface methods
    @Override
    public void log(String message) {
        System.out.println(MESSAGE_ASTERISKS + message + MESSAGE_ASTERISKS); // Precedes & follows print w/ 3 asterisks
    }

    /* Creates a box of asterisks encircling inputted message and preceding it w/ prescribed "Error: "
    Uses instantiation of a new String outside & .repeat function of .length function to create sequence of asterisks */
    @Override
    public void error(String error) {
        String inside = MESSAGE_ASTERISKS + "ERROR: " + error + MESSAGE_ASTERISKS;
        String outside = "*".repeat(inside.length());
        System.out.println(outside);
        System.out.println(inside);
        System.out.println(outside);
    }
}
