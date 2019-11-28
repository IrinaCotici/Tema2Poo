package heroes;

import java.util.ArrayList;

public class Hero {
    protected int HP;
    protected int maxHP;
    protected int XP;
    protected int level;
    protected int id;
    protected boolean isDead;
    protected int firstDamage;
    protected int secondDamage;
    protected int levelFirstDamage;
    protected int levelSecondDamage;
    protected int stoneRounds;
    protected int a;
    protected int b;
    protected String name;
    protected ArrayList <Float> firstDamageModifier;
    protected ArrayList <Float> secondDamageModifier;

    public Hero(int HP, int maxHP, int XP, int level, int id, boolean isDead, int firstDamage, int secondDamage,
                int levelFirstDamage, int levelSecondDamage, int stoneRounds, int a, int b, String name,
                ArrayList<Float> firstDamageModifier, ArrayList<Float> secondDamageModifier) {
        this.HP = HP;
        this.maxHP = HP;
        this.XP = 0;
        this.level = 0;
        this.id = id;
        this.isDead = false;
        this.firstDamage = firstDamage;
        this.secondDamage = secondDamage;
        this.levelFirstDamage = levelFirstDamage;
        this.levelSecondDamage = levelSecondDamage;
        this.stoneRounds = 0;
        this.a = a;
        this.b = b;
        this.name = name;
        this.firstDamageModifier = firstDamageModifier;
        this.secondDamageModifier = secondDamageModifier;
    }

    public int levelUp(Hero hero) {
        int XP_level_up = 250 + hero.level * 50;
        return XP_level_up;
    }

    public void attackWithFirstSkill(Hero opponent) {
        opponent.HP = opponent.HP - Math.round(this.firstDamage * firstDamageModifier.get(opponent.id));
    }

    public void attackWithSecondSkill(Hero opponent) {
        opponent.HP = opponent.HP -  Math.round(this.secondDamage * secondDamageModifier.get(opponent.id));
    }

    public void increaseXP(Hero opponent) {
        this.XP = this.XP + Math.max(0, 200 - (this.level - opponent.level) * 40);
    }

    public void setFirstDamage(int firstDamage) {
        this.firstDamage = firstDamage;
    }

    public int getFirstDamage() {
        return firstDamage;
    }

    public void setSecondDamage(int secondDamage) {
        this.secondDamage = secondDamage;
    }

    public boolean isDead() {
        return isDead;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public ArrayList<Float> getFirstDamageModifier() {
        return firstDamageModifier;
    }

    public ArrayList<Float> getSecondDamageModifier() {
        return secondDamageModifier;
    }

    public int getId() {
        return id;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    @Override
    public String toString() {
        return name + " " + level + " " + XP + " " + HP + " " + a + " " + b + "\n";
    }
}
