public class Pruebas {
    public static void main(String[] args) {


        double[] preciosCompra = {1.50, 2.65, 3, 5.50, 9.95, 4.80};

        for (int i = 0; i < preciosCompra.length; i++) {
            System.out.println("El producto " + i + " cuesta " + preciosCompra[i] + "€");
        }

        System.out.println("El precio total de la compra es:");

        double precioTotal = 0;

        for (int i = 0; i < preciosCompra.length; i++) {
            precioTotal += preciosCompra[i];


        }
        System.out.printf("El precio total de la compra es %.2f",precioTotal);

        System.out.println();
        double precioMaximo = 0;

        for (double item:preciosCompra){
            if (item > precioMaximo){

                precioMaximo = item;



            }


        }
        System.out.println("el precio maximo este es el "+precioMaximo);





















    }


}
