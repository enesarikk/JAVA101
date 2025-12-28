import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double pear=2.14 ,apple=3.67, tomato=1.11, banana=0.95, eggplant=5.0;
        double p,a,t,b,e,sum,pkg,akg,tkg,bkg,ekg;
        Scanner kg = new Scanner(System.in);

        System.out.print("How many kilos of pears? : ");
        p = kg.nextDouble();
        System.out.print("How many kilos of apples? : ");
        a = kg.nextDouble();
        System.out.print("How many kilos of tomatoes? : ");
        t  = kg.nextDouble();
        System.out.print("How many kilos of bananas? : ");
        b  = kg.nextDouble();
        System.out.print("How many kilos of eggplants? : ");
        e  = kg.nextDouble();

        pkg = p * pear;
        akg = a * apple;
        tkg = t * tomato;
        bkg = b * banana;
        ekg = e * eggplant;
        sum = pkg + akg + tkg + bkg + ekg;


        System.out.println("Total amount : " + sum + " Pound");


    }
}