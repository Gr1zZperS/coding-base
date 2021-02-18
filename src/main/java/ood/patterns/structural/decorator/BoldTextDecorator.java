package ood.patterns.structural.decorator;

public class BoldTextDecorator extends TextDecorator {

    private final IPrintable printable;

    public BoldTextDecorator(IPrintable printable) {
        super(printable);
        this.printable = printable;
    }

    @Override
    public String print() {
        return "<b>" + printable.print() + "</b>";
    }

}
