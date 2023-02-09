package maingameapp;

import java.util.Scanner;
import static maingameapp.FightLog.AttChoose;
import static maingameapp.Menu.menu;
import static maingameapp.Menu.addonM;
import static maingameapp.Menu.gameB;
import static maingameapp.Menu.gameswitch;
import static maingameapp.Menu.addonswitch;
import static maingameapp.Menu.menuswitch;
import static maingameapp.Menu.addonScr;
import static maingameapp.FightLog.Random;

public class MainGameapp {

    static boolean on = true;
    static maingameapp.Menu M = new maingameapp.Menu();
    static maingameapp.FightLog F = new maingameapp.FightLog();

    public static void main(String[] args) {

        Scanner bleugh = new Scanner(System.in);
        Random();
        while (on) {
            if (menu) {
                
                
                M.menuPR();
                int choice = bleugh.nextInt();
                switch (choice) {
                    case 1 ->
                        gameswitch();
                    case 2 ->
                        System.out.print("CASE 2");
                    case 3 ->
                        addonswitch();
                    default ->
                        on = false;
                }
            } else if (addonM) {
                addonScr();
                while (addonM) {

                    int ChoiceAd = bleugh.nextInt();
                    switch (ChoiceAd) {
                        case 1 ->
                            M.ad1SW();
                        case 2 ->
                            M.ad2SW();
                        case 3 ->
                            M.ad3SW();
                        case 4 ->
                            M.ad4SW();
                        default ->
                            menuswitch();
                    }
                }
            } else if (gameB) {
                System.out.println("du stoter på en fiende:");
                Scanner Scan = new Scanner(System.in);
                
                AttChoose();
                while ( F.ehealth > 0 && F.phealth > 0) {
                    
                    System.out.println("1, attackera; 2, blockera; 3, klar");
                    int choiseG = Scan.nextInt();

                    switch (choiseG) {

                        case 1 ->
                            F.Pattack();
                        case 2 ->
                            F.Pblock();
                        case 3 ->{
                            F.RoundLog();
                            AttChoose();
                        }
                        default ->
                            System.out.print("bruh");
                        
                    }
                }
                
            }
        }
    }

}
