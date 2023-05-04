package sk.michal.objects;

public abstract class Hero {
    private int life;
    private int strength;
    private int speed;
    private boolean isAttackable;
    private int defendCount;

    public Hero(int life, int strength, int speed) {
        this.life = life;
        this.strength = strength;
        this.speed = speed;
        isAttackable=true;
        defendCount=0;
    }

    public void attack(Hero hero){
        isAttackable=true;
        if (hero.isAttackable) {
            int hit=strength+(speed/100*strength);
            hero.setLife(hero.getLife()-hit);
        }

    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean defend(){
        if (defendCount<=2){
            isAttackable=false;
            defendCount++;
            return true;
        }
        return false;
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
