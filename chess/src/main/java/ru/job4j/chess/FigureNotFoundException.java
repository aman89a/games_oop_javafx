package ru.job4j.chess;

public class FigureNotFoundException extends Exception {
    public FigureNotFoundException(String ch) {
        super(ch);
    }
}
