package ood.patterns.creational.abstractFactory;

public class MedievalAmphitheater extends CulturalBuilding {

    @Override
    int getCulturalPoints() {
        System.out.println("Medieval cultural building [Amphitheater] gives 2 cultural points");
        return 2;
    }

}
