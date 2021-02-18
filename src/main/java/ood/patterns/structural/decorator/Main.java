package ood.patterns.structural.decorator;

public class Main {

    public static void main(String[] args) {

        Text helloText = new Text("Hello!");
        System.out.println(helloText.print());

        TextDecorator boldText = new BoldTextDecorator(helloText);
        System.out.println(boldText.print());

        TextDecorator boldItalicsText = new BoldTextDecorator(new ItalicsTextDecorator(helloText));
        System.out.println(boldItalicsText.print());

    }

}
