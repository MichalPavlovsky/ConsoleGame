package sk.michal.objects;

public class Hunter extends Hero {
    private Weapon weapon;

    public Hunter(int life, int strenght, int speed, Weapon weapon) {
        super(life, strenght, speed);
        this.weapon = new Bow(100,50);
    }
}
