import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("1 añadir correo");
            System.out.println("2 listar correo");
            System.out.println("3 buscar correo");
            System.out.println("4 añadir iterativo");
            System.out.println("5 salir");
            System.out.println("indica que opcione quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Dime el correo que quieres añadir");
                    String correo = scanner.next();
                    if (controller.metodoandir(correo)) {
                        System.out.println("usuario agregado correctamente");

                    } else {
                        System.out.println("usuario no agregado ");
                    }
                }
            

                case 2 -> {
                    controller.metodoListar();
                }
                case 3 -> {
                    System.out.println("indica el correo que quieres buscar");
                    String correo = scanner.next();
                    if (controller.metodoBuscar(correo)){
                        System.out.println("el correo esta en la lista");
                    }else{
                        System.out.println("el correo no esta en la lista");
                    }
                }
                case 4 ->{
                    System.out.println("Vamos a añadir recurrentemente");

                    for (int i = 0; i < 5; i++) {
                        String correo;
                        do {


                            System.out.println("indica el correo a añadir");
                             correo = scanner.next();
                             if (controller.metodoBuscar(correo)){
                                 System.out.println("el correo ya esta");
                             }
                        }while (controller.metodoBuscar(correo));
                            controller.metodoandir(correo);
                    }
                }

            }

        } while (opcion != 5);


    }


}
