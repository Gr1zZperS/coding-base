package ood.patterns.creational.builder.example2;

public class OfficeLaptopBuilder implements LaptopBuilder {

    @Override
    public Laptop build() {

        Laptop laptop = new Laptop();

        laptop.setRam("DDR3");
        laptop.setCpu("IntelCoreI3");
        laptop.setCores(2);

        return laptop;
    }

}
