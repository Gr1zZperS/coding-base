package ood.patterns.creational.abstractFactory;

public class AncientFactory extends IAbstractFactory{

    @Override
    Unit createUnit() {
        return new AncientArcher();
    }

    @Override
    CulturalBuilding createCulturalBuilding() {
        return new AncientMonument();
    }

}
