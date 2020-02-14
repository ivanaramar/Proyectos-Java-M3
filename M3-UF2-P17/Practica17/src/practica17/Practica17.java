
package practica17;

import java.util.Scanner;

public class Practica17 {

    static Scanner keyboard = new Scanner(System.in);//teclado
    
    public static void main(String[] args) {
        keyboard.useDelimiter("\n");//Para permitir poner nombres con espacios
        System.out.println("Author: Ivan Aranda");
        System.out.println("");
        int euro;
        float dolarsFloat;
        double dolarsDouble;
        String dolarsString;
        int dolarsInt;
        String euroString;
        float euroFloat;
        String name;
        String nameBinary;
        int number;
        char numberChar;
        
        int option = -1;

        do { //inicio do while
            userMenu();
            option = keyboard.nextInt();

            switch (option) {//inicio switch
                case 1:
                    System.out.println("");
                    System.out.print("Euros: ");
                    euro=keyboard.nextInt();
                    dolarsFloat = IntToFloat(euro);
                    System.out.println(dolarsFloat);
                    System.out.println("");
                    break;
                
                case 2:
                    System.out.println("");
                    System.out.print("Euros: ");
                    euro=keyboard.nextInt();
                    dolarsDouble = IntToDouble(euro);
                    System.out.println(dolarsDouble);
                    System.out.println("");
                    break;
                    
                case 3:
                    System.out.println("");
                    System.out.print("Euros: ");
                    euro=keyboard.nextInt();
                    dolarsString = IntToString(euro);
                    System.out.println(dolarsString);
                    System.out.println("");
                    break;
                    
                case 4:
                    System.out.println("");
                    System.out.print("Euros: ");
                    euroString=keyboard.next();
                    dolarsInt = StringToInt(euroString);
                    System.out.println(dolarsInt);
                    System.out.println("");
                    break;
                    
                case 5:
                    System.out.println("");
                    System.out.print("Euros: ");
                    euroFloat=keyboard.nextFloat();
                    dolarsInt = FloatToInt(euroFloat);
                    System.out.println(dolarsInt);
                    System.out.println("");
                    break;
                    
                case 6:
                    System.out.println("");
                    System.out.print("Euros: ");
                    euroFloat=keyboard.nextFloat();
                    dolarsString = FloatToString(euroFloat);
                    System.out.println(dolarsString);
                    System.out.println("");
                    break;
                    
                case 7:
                    CharToIntToBinary();
                    break;
                  
                case 8:
                    System.out.println("");
                    System.out.print("Name: ");
                    name=keyboard.next();
                    nameBinary = NameToBinary(name);
                    System.out.println(nameBinary);
                    System.out.println("");
                    break;
                    
                case 9:
                    System.out.println("");
                    System.out.print("Number: ");
                    number=keyboard.nextInt();
                    numberChar = NumberToChar(number);
                    System.out.println(numberChar);
                    System.out.println("");
                    break;
                    
                case 10:
                    NumberToHexa();
                    break;
                    
                case 0:
                    p0();
                    break;
                    
                default:
                    System.out.println("");
                    System.out.println("Option no valid");
                    System.out.println("");
            }//fin switch
        }while (option != 0); //fin do while
    }
    
    private static void userMenu() {
        System.out.println("Option 0- Exit");
        System.out.println("Option 1- Exercise 1");
        System.out.println("Option 2- Exercise 2");
        System.out.println("Option 3- Exercise 3");
        System.out.println("Option 4- Exercise 4");
        System.out.println("Option 5- Exercise 5");
        System.out.println("Option 6- Exercise 6");
        System.out.println("Option 7- Exercise 7");
        System.out.println("Option 8- Exercise 8");
        System.out.println("Option 9- Exercise 9");
        System.out.println("Option 10- Exercise 10");
        System.out.print("\nOption?: ");
    }
    
    private static void p0() {
        System.out.println("");
        System.out.println("Thank you for using our program, salu2");
    }
    
    private static float IntToFloat(int Euro){
        float result=0;
        result = (float) (Euro * 1.1);
        return result;
    }
    
    private static double IntToDouble(int Euro){
        double result=0;
        result = (double) (Euro * 1.1);
        return result;
    }
    
    private static String IntToString(int Euro){
        String result= "0";
        result = String.valueOf(Euro * 1.1);
        return result;
    }
    
    private static int StringToInt(String Euro){
        int result= 0;
        result = (int)(Integer.valueOf(Euro) * 1.1);
        return result;
    }
    
    private static int FloatToInt(float Euro){
        int result= 0;
        result =(int)(Euro * 1.1);
        return result;
    }
    
    private static String FloatToString(float Euro){
        String result= "0";
        result = String.valueOf(Euro * 1.1);
        return result;
    }
    
    private static void CharToIntToBinary(){
        System.out.println("");
        System.out.print("Letra: ");
        char letra=(keyboard.next()).charAt(0);
        String binary = Integer.toBinaryString(letra);
        System.out.println("Int= " + (int)letra);
        System.out.println("Binary= " + binary);
        System.out.println("");
    }
    
    private static String NameToBinary(String name){
        String result="";
        char ch
                ;
        for (int i=0; i<name.length(); i++){
            ch = name.charAt(i);
            result += Integer.toBinaryString(ch) + " ";
        }
        
        return result;
    }
    
    private static char NumberToChar(int number){
        char result= 0;
        result = (char)number;
        return result;
    }
    
    private static void NumberToHexa(){
        System.out.println("");
        System.out.println("ASCII: Sistema de codificación de caracteres alfanuméricos ");
        System.out.println("que asigna un número del 0 al 127 a cada letra, número o carácter especial recogidos;");
        System.out.println("el ASCII extendido permite hasta 256 caracteres distintos.");
        System.out.println("");
        for (int i=0; i<255; i++){
            System.out.println(i + "\t" + Integer.toString(i, 16) + "\t" + (char)i);
        }
        System.out.println("");
    }
}
