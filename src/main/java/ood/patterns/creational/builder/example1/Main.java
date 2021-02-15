package ood.patterns.creational.builder.example1;

public class Main {

    public static void main(String[] args) {

        Person myPerson = new Person.Builder()
                .withName("Tom")
                .withSurname("Bred")
                .withAge(32)
                .withWeight(80)
                .withHeight(180)
                .build();

    }

}
