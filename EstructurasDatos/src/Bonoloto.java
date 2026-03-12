import java.util.Scanner;

public class Bonoloto {

      private  int [] numerosSistema = new int[5]; // esto crea 5 ceros 0,0,0,0,0
       private int [] numerosUsuario = new int[5];
    private Scanner scanner = new Scanner(System.in);








public void iniciarJuego(){
    for (int i = 0; i < 5 ; i++) {
        numerosSistema[i] = (int)(Math.random()*21);

    }

    System.out.println("sellando boleto" +
            "");
    for (int i = 0; i < 5; i++) {
        System.out.println("introduce el numero con el que quieres jugar ");
        numerosUsuario[i] = scanner.nextInt();
        
    }
}



public void listarNumerosSistema(){
    System.out.println("los numeros del sistema son ");
    for (int item: numerosSistema){
        System.out.println(item);
    }






}


public void listarNumerosUsuario(){
    for (int item : numerosUsuario) {
        System.out.println(item);
    }
    
}










































}
