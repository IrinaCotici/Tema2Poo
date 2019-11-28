package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadFromFile2 {
    public static void main(String[] args)throws Exception {
        // We need to provide file path as the parameter:
        // double backquote is to avoid compiler interpret words
        // like \test as \t (ie. as a escape sequence)

        File file = new File("C:\\Users\\cotic\\IdeaProjects\\Tema2Poo\\proiect-etapa1-league-of-oop\\checker\\checker\\resources\\in\\fightKKD.in");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;

        ArrayList input = new ArrayList();
        while ((st = br.readLine()) != null) {
            input.add(st);
        }
        char[] s;
        String jd;
        jd = input.get(0).toString();
        System.out.println(jd);
        System.out.println(input);
       // int result = Integer.parseInt(jd);
       // System.out.println(result);
        s = input.get(1).toString().toCharArray();
        System.out.println(s[0]);

        GameMap map = new GameMap(input);
        GamePlot plot = new GamePlot(input);
        plot.runTheGame();
    }
}