import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {


        ArrayList<String> listaCompra = new ArrayList<>();

        listaCompra.add("leche");
        listaCompra.add("pan");
        listaCompra.add("huevos");
        listaCompra.add("agua");
        listaCompra.add("fruta");

        listaCompra.add("yogurt");

        listaCompra.remove("pan");

        System.out.println("esta es mi lista de la compra " + listaCompra);

        System.out.println("este es el tamaño de mi lista " + listaCompra.size());

        for (String s : listaCompra) {
            System.out.println(s);

        }


    }
}
