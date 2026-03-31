import controller.Agenda;

import java.util.Scanner;

public class MainAgenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion = 0;

        //System.out.println("el tamaño de lista es de "+agenda.getListaContactos().size());




        do {
            System.out.println("1 agregar contacto");
            System.out.println("2 borrar");
            System.out.println("3 buscar");
            System.out.println("4 listar");
            System.out.println("5 Salir");
            System.out.println(" Que quieres hacer?");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1->{
                    System.out.println("Introduce nombre");
                    String nombre = scanner.next();

                    System.out.println("Introduce apellido");
                    String apellido = scanner.next();

                    System.out.println("Introduce correo");
                    String correo = scanner.next();

                    System.out.println("Introduce dni");
                    String dni = scanner.next();

                    System.out.println("Introduce telefono");
                    int telefono = scanner.nextInt();

                    agenda.agregarContacto(new Object[]{nombre,apellido,correo,telefono,dni});

                }
                case 2->{}
                case 3->{
                    System.out.println("indica el dni que quieres buscar");
                    String dni = scanner.next();
                    agenda.buscarContacto(dni);
                }
                case 4->{}
                case 5->{
                    System.out.println("salir");
                }

            }


        }while (opcion!=5);


































    }
}
