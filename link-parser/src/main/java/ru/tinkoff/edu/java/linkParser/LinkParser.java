package ru.tinkoff.edu.java.linkParser;


public interface LinkParser {
    String[] parse(String link);
    void setNextParser(LinkParser nextParser);
}