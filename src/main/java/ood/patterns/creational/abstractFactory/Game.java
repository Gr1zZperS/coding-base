package ood.patterns.creational.abstractFactory;

public class Game {

    private IAbstractFactory factory;

    public Game() {
        factory = new AncientFactory();
    }

    public void simulateUserAction() {

        Unit unit = factory.createUnit();
        unit.attack();

        CulturalBuilding building = factory.createCulturalBuilding();
        building.getCulturalPoints();

    }

    public void SimulateTimePassing() {
        factory = new MedievalFactory();
    }

    public static void main(String[] args) {

        Game game = new Game();
        game.simulateUserAction();
        game.SimulateTimePassing();
        game.simulateUserAction();

    }

}
