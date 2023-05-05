package sk.michal.objects;

import sk.michal.objects.utils.Utils;



public abstract class Hero {
    private int life;
    private int strength;
    private int critical;
    private boolean isAttackable;
    private int defendCount;

    public Hero(int life, int strength, int critical) {
        this.life = life;
        this.strength = strength;
        this.critical = critical;
        isAttackable=true;
        defendCount=0;
    }

    protected void attack(Hero hero, int weaponHit){
        isAttackable=true;
        if (hero.isAttackable) {
            int hit= Utils.calculateHit(strength, critical) +weaponHit;
            hero.setLife(hero.getLife()-hit);
        }

    }

    public void setLife(int life) {
        this.life = life;
    }

    protected boolean defend(){
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

    public int getCritical() {
        return critical;
    }
}
