package ood.patterns.creational.builder.example2;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        LaptopBuilder gamingLaptopBuilder = new GamingLaptopBuilder();
        LaptopBuilder officeLaptopBuilder = new OfficeLaptopBuilder();

        director.setLaptopBuilder(gamingLaptopBuilder);
        Laptop gamingLaptop = director.getLaptop();

        director.setLaptopBuilder(officeLaptopBuilder);
        Laptop officeLaptop = director.getLaptop();

    }

}
