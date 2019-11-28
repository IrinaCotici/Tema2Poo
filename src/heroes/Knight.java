package heroes;

import constants.PlayerConstants;
import main.GameMap;

import java.util.ArrayList;

public class Knight extends Hero {

    public Knight(int HP, int maxHP, int XP, int level, int id, boolean isDead, int firstDamage, int secondDamage,
                  int levelFirstDamage, int levelSecondDamage, int stoneRounds, int a, int b, String name,
                  ArrayList<Float> firstDamageModifier, ArrayList<Float> secondDamageModifier) {
        super(HP, maxHP, XP, level, id, isDead, firstDamage, secondDamage, levelFirstDamage, levelSecondDamage,
                stoneRounds, a, b, name, firstDamageModifier, secondDamageModifier);

    }


}
