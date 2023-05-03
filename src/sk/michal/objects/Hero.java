package sk.michal.objects;

public abstract class Hero {
    private int life;
    private int strength;
    private int speed;

    public Hero(int life, int strength, int speed) {
        this.life = life;
        this.strength = strength;
        this.speed = speed;
    }

    public int getLife() {
        return life;
    }

    public int getStrength() {
        return strength;
    }

    public int getSpeed() {
        return speed;
    }
}
