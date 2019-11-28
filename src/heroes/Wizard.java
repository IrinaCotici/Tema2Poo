package heroes;

import java.util.ArrayList;

public class Wizard extends Hero {
    public Wizard(int HP, int maxHP, int XP, int level, int id, boolean isDead, int firstDamage, int secondDamage,
                  int levelFirstDamage, int levelSecondDamage, int stoneRounds, int a, int b, String name,
                  ArrayList<Float> firstDamageModifier, ArrayList<Float> secondDamageModifier) {
        super(HP, maxHP, XP, level, id, isDead, firstDamage, secondDamage, levelFirstDamage, levelSecondDamage,
                stoneRounds, a, b, name, firstDamageModifier, secondDamageModifier);
    }
}
