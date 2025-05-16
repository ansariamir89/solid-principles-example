package org.howtodoitinjava.interfaceSegregation.problemCode;

public class BasicPrinter implements MultifunctionPrinter {

    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scan(String document) {
        throw new UnsupportedOperationException("Unable to scan document: " + document);
    }

    @Override
    public void fax(String document) {
        throw new UnsupportedOperationException("Unable to fax document: " + document);
    }
}
