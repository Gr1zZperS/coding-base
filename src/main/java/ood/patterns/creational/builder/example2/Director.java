package ood.patterns.creational.builder.example2;

public class Director {

    private LaptopBuilder laptopBuilder;

    public void setLaptopBuilder(LaptopBuilder laptopBuilder) {
        this.laptopBuilder = laptopBuilder;
    }

    public Laptop getLaptop() {
        return laptopBuilder.build();
    }

}
