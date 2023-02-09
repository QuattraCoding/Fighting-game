package maingameapp;


public class Menu {
    //booleans from launch
    static boolean menu = true;
    static boolean addonM = false;
    static boolean gameB = false;
    static boolean add1stat = false;
    static boolean add2stat = false;
    static boolean add3stat = false;
    static boolean add4stat = false;
    
    public void menuPR() {
        System.out.println("*****************************");
        System.out.println("*                           *");
        System.out.println("*         Project Q         *");
        System.out.println("*                           *");
        System.out.println("*      1. Play              *");
        System.out.println("*      2. Continue          *");
        System.out.println("*      3. Addons            *");
        System.out.println("*                           *");
        System.out.println("*****************************");
        System.out.println("Navigera med input av siffra:");
    }
        static public void addonswitch() {
        menu = false;
        addonM = true;
        gameB = false;
    }

    static public void menuswitch() {
        menu = true;
        addonM = false;
        gameB = false;
    }
    
    static public void gameswitch() {
        menu = false;
        addonM = false;
        gameB = true;
        
    }
        static public void addonScr() {

        System.out.println("Addon 1: " + add1stat);
        System.out.println("Addon 2: " + add2stat);
        System.out.println("Addon 3: " + add3stat);
        System.out.println("Addon 4: " + add4stat);

    }
        public void ad1SW() {
        add1stat = !add1stat;
        addonScr();
    }

    public void ad2SW() {
        add2stat = !add2stat;
        addonScr();
    }

    public void ad3SW() {
        add3stat = !add3stat;
        addonScr();
    }

    public void ad4SW() {
        add4stat = !add4stat;
        addonScr();
    }
}
