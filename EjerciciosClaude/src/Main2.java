public class Main2 {
    public static void main(String[] args) {


        double[] cestaCompra = new double[]{3.50, 12.99, 0.75, 8.20, 5.00, 15.30};

        double precioCesta = 0;
        for (double item : cestaCompra) {
            precioCesta += item;


        }
        System.out.printf("El precio total de la compra fue de %.2f€%n ", precioCesta);

        double precioMedio = 0;
        precioMedio = precioCesta / cestaCompra.length;
        System.out.printf("El precio medio por producto es de %.2f€ ", precioMedio);

        int productosMenos5 = 0;
        for (double item : cestaCompra) {
            if (item < 5) {
                productosMenos5++;
            }


        }
        System.out.println("Cantidad de productos con menor precio que 5€ son: " + productosMenos5);


        double productoCaro = cestaCompra[0], productoBarato = cestaCompra[0];

        for (double item : cestaCompra) {
            if (item>productoCaro){
                productoCaro=item;
            }
            if (item<productoBarato){
                productoBarato=item;
            }
        }
        System.out.println("El producto mas barato cuesta "+productoBarato+"€");
        System.out.println("El producto mas caro cuesta "+productoCaro+"€");

    }
}
