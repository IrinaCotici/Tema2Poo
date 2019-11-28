package main;

import constants.PlayerConstants;
import heroes.Hero;
import heroes.HeroManager;
import heroes.Knight;
import heroes.Pyromancer;

import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;
import java.util.LinkedList;

public class GamePlot {
    private int numOfRounds;
    private int numOfHeroes;
    private char[][] moves;
    private LinkedList<Hero> listOfHeroes;

    public GamePlot(ArrayList input) {
        GameMap map = new GameMap(input);
        HeroManager manager = new HeroManager();
        listOfHeroes = new LinkedList<>();
        for (int i = 0; i <= map.getLength(); i++) {
            input.remove(0);
        }
        String numberRounds = input.get(0).toString();
        this.numOfRounds = Integer.parseInt(numberRounds);
        String numberHeroes = input.get(numOfRounds + 1).toString();
        this.numOfHeroes = Integer.parseInt(numberHeroes);
        System.out.println(input);

        for (int i = 0; i < numOfHeroes; i++) {

            String[] coords = input.get(i + 1).toString().split(" ");
            int a = Integer.parseInt(coords[1]);
            int b = Integer.parseInt(coords[2]);

            switch (input.get(i + 1).toString().charAt(0)) {
                case 'R' :
                    /*Hero rogue = new Hero(PlayerConstants.ROGUE_HP, PlayerConstants.ROGUE_HP, 0, 0,
                            PlayerConstants.ROGUE_ID, false, PlayerConstants.ROGUE_FIRST_DAMAGE, )*/
                    break;
                case 'K' :
                    Hero knight = new Knight(PlayerConstants.KNIGHT_HP, PlayerConstants.KNIGHT_HP, 0, 0,
                            PlayerConstants.KNIGHT_ID, false, PlayerConstants.KNIGHT_FIRST_DAMAGE,
                            PlayerConstants.KNIGHT_SECOND_DAMAGE, PlayerConstants.KNIGHT_FIRST_DAMAGE_LEVEL,
                            PlayerConstants.KNIGHT_SECOND_DAMAGE_LEVEL, 0, a, b, "K",
                            manager.completeKnightFirstDamage(), manager.completeKnightSecondDamage());
                    listOfHeroes.addLast(knight);
                    break;
                case 'P' :
                    Hero pyromancer = new Pyromancer(PlayerConstants.PYROMANCER_HP, PlayerConstants.PYROMANCER_HP, 0,
                            0, PlayerConstants.PYROMANCER_ID, false,
                            PlayerConstants.PYROMANCER_FIRST_DAMAGE, PlayerConstants.PYROMANCER_SECOND_DAMAGE,
                            PlayerConstants.PYROMANCER_FIRST_DAMAGE_LEVEL,
                            PlayerConstants.PYROMANCER_SECOND_DAMAGE_LEVEL, 0, a, b, "P",
                            manager.completePyromancerFirstDamage(), manager.completePyromancerSecondDamage());
                    break;
                case 'W' :
                    break;
            }


        }
        for (int i = 0; i <= numOfRounds; i++) {
            input.remove(0);
        }
        char[][] moves = new char[numOfHeroes][numOfRounds];
        for (int i = 0; i < numOfHeroes; i++) {
            for (int j = 0; j < numOfRounds; j++) {
                moves[i][j] = input.get(i + 1).toString().charAt(j);
            }
        }
        System.out.println(listOfHeroes);
    }

    public void runTheGame() {
        for (int i = 0; i < numOfRounds; i++) {
            for (Hero hero : listOfHeroes) {
                for (Hero opponent : listOfHeroes) {
                    System.out.println(listOfHeroes.size());
                    if (listOfHeroes.indexOf(hero) < listOfHeroes.indexOf(opponent) && !hero.isDead() && !opponent.isDead()
                            && (hero.getA() == opponent.getA()) && (hero.getB() == opponent.getB())) {
                        hero.attackWithFirstSkill(opponent);
                        hero.attackWithSecondSkill(opponent);
                        opponent.attackWithFirstSkill(hero);
                        opponent.attackWithSecondSkill(hero);
                    }
                }
            }
        }
        System.out.println(listOfHeroes);
    }
}
