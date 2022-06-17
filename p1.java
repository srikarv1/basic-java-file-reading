package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main{
    public static void main(String[] args) {

        try (PrintWriter writer = new PrintWriter("test.csv")) {

            StringBuilder sb = new StringBuilder();
            sb.append("id");
            sb.append(',');
            sb.append("Name");
            sb.append(',');
            sb.append("Type 1");
            sb.append(',');
            sb.append("Type 2");
            sb.append(',');
            sb.append("Total");
            sb.append(',');
            sb.append("HP");
            sb.append(',');
            sb.append("Attack");
            sb.append(',');
            sb.append("Defense");
            sb.append(',');
            sb.append("Sp. Attack");
            sb.append(',');
            sb.append("Sp. Defense");
            sb.append(',');
            sb.append("Speed");
            sb.append(',');
            sb.append("Generation");
            sb.append(',');
            sb.append("Legendary");
            sb.append('\n');

            Poke pokemon = new Poke("16","Sriko","12","13","14","23","44","55","66","88","44","22","88");
            sb.append(pokemon);

            writer.write(sb.toString());

            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
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
            return  id + "," + name + "," + t1 + ","  + t2 + "," + Total + "," + HP + "," + Attack + "," + Defense + "," + spa + ","  + spd + "," + speed + "," + gen + "," + leg  ;
        }
    }
}