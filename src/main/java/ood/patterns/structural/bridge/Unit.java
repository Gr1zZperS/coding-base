package ood.patterns.structural.bridge;

public class Unit {

    private Weapon weapon;

    public void attack(Unit unit) {
        if(weapon != null) {
            int damage = weapon.attack();
        }
    }

}
