package maingameapp;

public class FightLog {
//Ints för Fiende
    int ehealth = 30;
    static int eblock = 0;
    static int eatt = 0;
    
//Ints för Spelare
    int phealth = 30;
    static int pblock = 0;
    static int attC = 0;
    static int power = 0;
    
    static int Tdmg = 0;
    static int TPdmg = 0;

    public static int Random(){
        double m = Math.random();
        m *=3;
        m = Math.floor(m);
        m+=1;
        return (int) m;
    }
    
    static void AttChoose(){
    int rn = Random();
    if(rn == 1){
        attv1();
    }
    else if(rn == 2){
        attv2();
    }
    else if(rn == 3){
        attv3();
    }
    }
    static void attv1(){
    eatt = 13;
    System.out.println("din fiende blir väldigt offensiv.");
    System.out.println(eatt+" attack.");
    }
    static void attv2(){
    eatt = 7;
    eblock = 4;
    System.out.println("din fiende verkar klyven. han håller sin gard uppe.");
    System.out.println(eatt+" attack.");
    System.out.println(eblock+" sköld.");
    }
    static void attv3(){
    eblock = 16;
    System.out.println("din fiende stärker sig själv och väntar på ditt drag:");
    System.out.println(eblock+" sköld.");
    }
    
    
    public void Pblock() {
// Detta ska multipliceras så många gånger spelaren använder sina kort.
        eatt-=5;
        if (eatt < 0) {
            eatt = 0;
        }
    }

    public void Pattack() {
// Detta ska multipliceras så många gånger spelaren använder sina kort.
        attC++;
    }

    public void pattCalc() {
        power = 5 * attC;
        System.out.println(power);
         if (eblock > 0) {
            Tdmg = power - eblock;
            if(Tdmg < 0){
            Tdmg = 0;
            }
        } else {
            Tdmg = power;
        }
    }
    public void eattCalc(){
    if(pblock > 0) {
    TPdmg = eatt - pblock;
    }
    else{
    TPdmg = eatt;
    }
    }
    public void RoundLog(){
    pattCalc();
    eattCalc();
    ehealth = ehealth - Tdmg;
    phealth = phealth - TPdmg;
    if(ehealth > 0 && phealth > 0){
    System.out.println("din hälsa: "+ phealth);
    System.out.println("din fiendes hälsa: "+ ehealth);
    eblock = 0;
    eatt = 0;
    
    pblock = 0;
    attC = 0;
    
    }
    if(ehealth <= 0){
    System.out.println("Du har vunnit!");
    ehealth = 30;
    }
    else if(phealth <= 0){
    System.out.println("du har förlorat.");
    MainGameapp.on = false;
    }
    }

}
