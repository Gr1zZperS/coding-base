package ood.patterns.structural.decorator;

public class Text extends IPrintable {

    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String print() {
        return text;
    }

}
