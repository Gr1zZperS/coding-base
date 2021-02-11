package ood.patterns.creational.abstractFactory;

public class AncientMonument extends CulturalBuilding {

    @Override
    int getCulturalPoints() {
        System.out.println("Ancient cultural building [Monument] gives 1 cultural point");
        return 1;
    }

}
