package org.howtodoitinjava.interfaceSegregation.refactoredCode;

public class AdvancePrinter implements Printable, Scanable, Faxable{


    @Override
    public void fax(String document) {

    }

    @Override
    public void print(String document) {

    }

    @Override
    public void scan(String document) {

    }
}
