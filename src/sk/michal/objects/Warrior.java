package sk.michal.objects;

public class Warrior extends Hero{
    private Weapon weapon;

    public Warrior(int life, int strength, int speed) {
        super(life, strength, speed);
        this.weapon= new Axe(200,10);
    }
}
