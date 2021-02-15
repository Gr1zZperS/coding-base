package ood.patterns.creational.builder.example2;

public class GamingLaptopBuilder implements LaptopBuilder {

    @Override
    public Laptop build() {

        Laptop laptop = new Laptop();

        laptop.setRam("DDR5");
        laptop.setCpu("IntelCoreI9");
        laptop.setCores(8);

        return laptop;
    }

}
