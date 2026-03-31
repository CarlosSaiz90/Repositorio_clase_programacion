import java.util.ArrayList;

public class Main {

    static ArrayList<Object[]> listaContactos = new ArrayList<>();

    public static void main(String[] args) {
// Agenda contactos-> ARRAYLIST <objetc[]>
//poder guardar tantos como necesite
// cada contacto tiene datos fijos -> nombre, apellidos , dni , telefono ->
        //ARRAYLIST <Objetct[]>


        listaContactos.add(new Object[]{"Borja", "Martin", "1234A", 1234});
        listaContactos.add(new Object[]{"Maria", "Lopez", "5334A", 1224});
        listaContactos.add(new Object[]{"Juan", "Gomez", "3384B", 3456});

        mostrarContactos();

        System.out.println("Vamos a sacar solo el nombre del ultimo contacto ");
        //Object[] contacto = listaContactos.get(listaContactos.size()-1);
        Object[] contacto = listaContactos.getLast();
        System.out.println(contacto[0]);

        System.out.println("Procedemos a borrar un elemento");
        borrarContacto("1234A");


    }


    public static void mostrarContactos() {

        for (Object[] contacto : listaContactos) {
            System.out.println("imprimiendo contactos");
            System.out.printf("\tnombre: %s Apellido %s DNI: %s Telf: %d%n",
                    contacto[0], contacto[1], contacto[2], (int) contacto[3]);

        }


    }

    public static void borrarContacto(String dni){

        for (int i = 0; i < listaContactos.size(); i++) {
            if (listaContactos.get(i)[2].equals(dni)){
                listaContactos.remove(i);
                break;
            }
            
        }
    }

}

