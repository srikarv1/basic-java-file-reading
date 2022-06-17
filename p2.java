package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("C:\\Users\\MSE\\OneDrive\\Desktop\\PKMN.csv");
        Scanner inputFile = new Scanner(inFile);
        String str;
        String[] tokens;
        while (inputFile.hasNext()) {
            str = inputFile.nextLine();
            tokens = str.split(",");

            String a = tokens[0];
            String b  = tokens[1];
            String c = tokens[2];
            String d = tokens[3];
            String e = tokens[4];
            String f = tokens[5];
            String g = tokens[6];
            String h = tokens[7];
            String i = tokens[8];
            String j = tokens[9];
            String k = tokens[10];
            String l = tokens[11];
            String m = tokens[12];

            Poke pokemon = new Poke(a,b,c,d,e,f,g,h,i,j,k,l,m);
            System.out.println(pokemon + "\n");

        }
    }

    public static class Poke {
        private String id;
        private String name;
        private String t1;
        private String t2;
        private String Total;
        private String HP;
        private String Attack;
        private String Defense;
        private String spa;
        private String spd;
        private String speed;
        private String gen;
        private String leg;

        public Poke(String a, String b, String c, String d, String e, String f, String g,String h, String i, String j, String k, String l, String m) {
             id=a;
             name=b;
             t1=c;
             t2=d;
             Total=e;
             HP=f;
             Attack=g;
             Defense=h;
             spa=i;
             spd=j;
             speed=k;
             gen=l;
             leg=m;
        }
        @Override
        public String toString() {
            return "ID: " + id + "\t" + "Name: " + name + "\t"
                    + "Type 1: " + t1 + "\t" + "Type 2: " + t2 + "\t"
                    + "Total: " + Total + "\t" + "HP: " + HP + "\t" + "Attack: " + Attack + "\t" + "Defense :" + Defense + "\t" + "Sp. Attack: " + spa + "\t" + "Sp. Defense: " + spd + "\t" + "speed :" + speed + "\t" + "Gen:" + gen + "\t" + "Legendary :" + leg  ;
        }
    }
}





