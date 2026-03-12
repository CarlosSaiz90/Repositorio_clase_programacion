package ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intentos = 7;
        Random random = new Random();
        int numeroAleatorio = random.nextInt(50)+1;
        int numeroSistema = (int) (Math.random()*50);
        int numeroUsuario;
        System.out.println("El numero del sistema es "+numeroSistema);
        do {
            System.out.println("introduce el numreo a ver si aciertas");
            numeroUsuario = scanner.nextInt();
            intentos--;
            if (numeroUsuario==numeroSistema){
                System.out.println("Numero acertado");
                break;

            }
            System.out.println("Numero incorrecto");



        }while (intentos>0);


        if (intentos==0){
            System.out.println("has perdido");
        }
















    }

}
