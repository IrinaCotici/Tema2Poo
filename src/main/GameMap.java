package main;

import constants.ModifierConstants;
import constants.PlayerConstants;
import heroes.*;

import javax.swing.*;
import java.util.ArrayList;

public class GameMap {
    private char[][] map;
    private int width;
    private int length;

    public GameMap(ArrayList<String> inputMap) {

        String[] nums =  inputMap.get(0).split(" ");
        this.length = Integer.parseInt(nums[0]);
        this.width = Integer.parseInt(nums[1]);

        char[][] map = new char[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                map[i][j] = inputMap.get(i + 1).toString().charAt(j);
            }
        }
    }
    public float interactWith(Knight knight, int damage) {
        float landDamage = 0;
        if (map[knight.getA()][knight.getB()] == 'L') {
           landDamage = damage * ModifierConstants.LAND_MODIFIER;
        }
        return landDamage;
    }

    public float interactWith(Pyromancer pyromancer, int damage) {
        float volcanicDamage = 0;
        if (map[pyromancer.getA()][pyromancer.getB()] == 'V') {
            volcanicDamage = damage * ModifierConstants.VOLCANIC_MODIFIER;
        }
        return volcanicDamage;
    }

    public float interactWith(Rogue rogue, int damage) {
        float woodsDamage = 0;
        if (map[rogue.getA()][rogue.getB()] == 'W') {
            woodsDamage = damage * ModifierConstants.WOODS_MODIFIER;
        }
        return woodsDamage;
    }

    public float interactWith(Wizard wizard, int damage) {
        float desertDamage = 0;
        if (map[wizard.getA()][wizard.getB()] == 'D') {
            desertDamage = damage * ModifierConstants.DESERT_MODIFIER;
        }
        return desertDamage;
    }


    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public char[][] getMap() {
        return map;
    }
}
