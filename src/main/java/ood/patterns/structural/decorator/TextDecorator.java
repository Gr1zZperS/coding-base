package ood.patterns.structural.decorator;

public class TextDecorator extends IPrintable {

    private final IPrintable printable;

    public TextDecorator(IPrintable printable) {
        this.printable = printable;
    }

    public String print() {
        return printable.print();
    }

}
