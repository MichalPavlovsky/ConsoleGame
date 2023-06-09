package sk.michal.objects;

import sk.michal.utils.Utils;

public class Warrior extends Hero{
    private Weapon weapon;

    public Warrior(int life, int strength, int speed) {
        super(life, strength, speed);
        this.weapon= new Axe(200,10);
    }
    public void attack(Hero hero){
        int weaponHit = Utils.calculateHit(weapon.getStrenght(),weapon.getCritical());
        super.attack(hero, weaponHit);
    }
}
