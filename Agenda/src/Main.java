import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el nombre de la persona");
        String nombre = scanner.next();
        System.out.println("Dime el apellido de la persona");
        String apellido = scanner.next();
        System.out.println("Dime el correo de la persona");
        String correo = scanner.next();
        System.out.println("Dime el telefono de la persona");
        int telefono = scanner.nextInt();




         Object[] persona = new Object[]{nombre,apellido,correo,telefono};
        //nombre,apellido,correo,telefono



        for (Object item : persona) {
            System.out.println(item);

        }

      */


        int[][] numeros = new int[4][4];//{{4,6,1},{1,8,9},{11,18,19}};

        // 4 6 1
        // 1 8 9
        // 20 18 19

        //System.out.println(numeros[0][2]);
        //System.out.println(numeros[2][1]);



        for (int i = 0; i < numeros.length ; i++) {
            for (int j = 0; j <numeros[i].length ; j++) {
                //System.out.print(numeros[i][j] + "\t");
                numeros[i][j] = (int) (Math.random()*16)+1;
            }

        }


        for (int[] fila : numeros) {
            for (int item : fila) {
                System.out.print(item +"\t");

            }
            System.out.println();
        }
        


    }
}
