
package p18;

import java.io.IOException;
import java.util.Scanner;

public class P18 {
static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
         int option = -1;
         int euro;
         String euroS;
         float euroF;
         float eurof2;
         float dolar;
         double dolar2;
         String dolarS;
         String dolarS2;
         char letra;
         int asci;

         int dolarI;
        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//inicio switch
                case 1:
                    
               System.out.println("euros?");
                    euro=keyboard.nextInt();
                dolar = funcionDolar(euro);
                System.out.println(euro +  "€  =  " + dolar + "$");
                    break;
                case 2:
                    System.out.println("euros?");
                    euro=keyboard.nextInt();
                dolar2 = funcionDolar(euro);
                System.out.println(euro +  "€  =  " + dolar2 + "$");
                    break;
                case 3:
                    System.out.println("euros?");
                    euro=keyboard.nextInt();
                dolarS = funcionDolarS(euro);
                System.out.println(euro +  "€  =  " + dolarS + "$");
                    break;
                case 4:
                    System.out.println("euros?");
                    euroS=keyboard.next();
                dolarI = funcionDolarS2(euroS);
                System.out.println(euroS +  "€  =  " + dolarI + "$");
                    break;
                    case 5:
                    System.out.println("euros?");
                    euroF=keyboard.nextFloat();
                dolarI = funcionDolarf(euroF);
                System.out.println(euroF+  "€  =  " + dolarI + "$");
                    break;
                    case 6:
                    System.out.println("euros?");
                    eurof2=keyboard.nextFloat();
                dolarS2 = funcionDolarf2(eurof2);
                System.out.println(eurof2 +  "€  =  " + dolarS2 + "$");
                    break;
                    case 7:
                    System.out.println("letter?");
                    letra = (char) System.in.read();
                    asci= funcionletter(letra);
                        System.out.println(asci);
                    
                    break;
                    case 8:
                        System.out.println("name?");
                        String name=keyboard.next();
                        
                        String nameBinary=functionStringToBinary(name);
                        System.out.println(nameBinary);
                    break;
                    case 9:
                        System.out.println("number?");
                        int number=keyboard.nextInt();
                        char ch= functionIntToChar(number);
                        System.out.println(number+ ":" + ch);
                    break;
                    case 10:
                        ascii();
                    break;
                case 0:
                    p0();
                    break;

                default:
                    System.out.println("Opcion no valida");
            }//fin switch
        }
    }
        
    private static float funcionDolar(int E ){
       float resultF=0;
        resultF= E * 1.1f;
        return resultF;
    }
    private static double funcionDolar2(int E ){
       double resultD=0;
        //result=(double) (E * 1.1);
        resultD= Double.valueOf(E * 1.1);
        return resultD;
    }
    private static String funcionDolarS(int E ){
       String resultS= String.valueOf(E);
        //result=(double) (E * 1.1);
        resultS= String.valueOf(E * 1.1);
        return resultS;
    }
    private static int funcionDolarS2(String Eu){
        int resultI=0;
        
        
        resultI=( int) (Integer.valueOf(Eu) * 1.1);
        return resultI;
    }
    private static int funcionDolarf(float Eu){
        
        int resultI2 = (int)(Eu*1.1);
        return resultI2;
     
        
    }

    private static String funcionDolarf2(float Eu ){
       String resultS= String.valueOf(Eu * 1.1);
        //result=(double) (E * 1.1)
        return resultS;
    }
     private static int funcionletter(char letra){
     int asci = (int) letra;
     return asci;
     
     
    }
    
    private static String functionStringToBinary(String txt){
        String result=""; //jordi :  J  O  R  D  I
        char ch;
        for(int i=0; i<txt.length();i++){
        ch= txt.charAt(i);
        result += Integer.toBinaryString(ch)+" ";
        }
        
        
        return result;
    }
    
    private static char functionIntToChar(int number){
        char ch=' ';
        ch=(char) number;
        return ch;
    }
    
    private static void ascii(){
        for(int i=0; i<255; i++)
        System.out.println(i + "\t" +Integer.toString(i, 16)+"\t"+(char)i);
    }
    
    
    
    
    private static void userMenu() {
        System.out.println("Opción 1");
        System.out.println("Opción 2-");
        System.out.println("Opción 3");
        System.out.println("Opción 4");
        System.out.println("Opción 5");

        System.out.println("Opción 0- salir");
        System.out.print("\nOpcion ?: ");
    }
}
