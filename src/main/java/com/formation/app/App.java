package com.formation.app;

/**
 * Hello world!
 */
public class App {
    /**
     * Constante.
     */
    private final String message = "Hello World!";

    /**
     * Constructor par défaut.
     */
    public App() {

    }

    /**
     *
     * @param args string[].
     */
    public static void main(final String[] args) {
        System.out.println(new App().getMessage());
    }

    /**
     *
     * @return message
     */
    private String getMessage() {
        return message;
    }
}
