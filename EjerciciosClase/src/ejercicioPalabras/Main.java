package ejercicioPalabras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("indica la frase que quieres analizar");
        String frase = scanner.nextLine();
        System.out.println(frase);


        String[] frases = frase.split("\\.");


        String frasePalabras = frase.replaceAll(" ","").replaceAll(",","").replaceAll("\\.","");

        String palabraFrase = frase.replaceAll(","," ").replaceAll("\\.","");
        String[] palabras = frase.split(" ");



        System.out.println("el numero de oraciones es "+frases.length);
        System.out.println("el numero de letras es "+frasePalabras.length());
        System.out.println("el numero de palabras "+palabras.length);


        for  (String item : frases){

            int contador = item.split(" ").length;
            System.out.println("el numero de palabras de la oracion es "+contador);


        }














        //for (int i = 0; i <frase.length() ; i++) {
            //System.out.println("tiene "+frase.length() +"letras");
            //break;

        //}


























    }
}
