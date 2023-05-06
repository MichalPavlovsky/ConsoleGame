package sk.michal.objects;

import sk.michal.utils.Utils;

public class Hunter extends Hero {
    private Weapon weapon;

    public Hunter(int life, int strenght, int speed, Weapon weapon) {
        super(life, strenght, speed);
        this.weapon = new Bow(100, 50);
    }

    public void attack(Hero hero) {
        int weaponHit = Utils.calculateHit(weapon.getStrenght(), weapon.getCritical());
        super.attack(hero, weaponHit);
    }
}
