package ood.patterns.structural.decorator;

public class ItalicsTextDecorator extends TextDecorator {

    private final IPrintable printable;

    public ItalicsTextDecorator(IPrintable printable) {
        super(printable);
        this.printable = printable;
    }

    @Override
    public String print() {
            return "<i>" + printable.print() + "</i>";
        }
    }
