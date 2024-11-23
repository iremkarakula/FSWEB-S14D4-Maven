package org.example.rpg;

public class Main {
    public static void main(String[] args) {
        Monster shreek = new Troll("irem", 15, 12);

        printAttackResult(shreek);

    }
    public static void printAttackResult(Monster monster){
        System.out.println("Name: "+monster.getName()+" result: "+ monster.attack());
    }
}
