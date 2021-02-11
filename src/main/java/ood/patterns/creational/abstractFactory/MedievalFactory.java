package ood.patterns.creational.abstractFactory;

public class MedievalFactory extends IAbstractFactory {

    @Override
    Unit createUnit() {
        return new MedievalCrossbowman();
    }

    @Override
    CulturalBuilding createCulturalBuilding() {
        return new MedievalAmphitheater();
    }

}
