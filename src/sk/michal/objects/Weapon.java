package sk.michal.objects;

public abstract class Weapon {
    private int strenght;
    private int critical;

    public Weapon(int strenght, int critical) {
        this.strenght = strenght;
        this.critical = critical;
    }


    public int getStrenght() {
        return strenght;
    }

    public int getCritical() {
        return critical;
    }
}
