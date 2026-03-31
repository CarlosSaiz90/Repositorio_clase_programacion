public class Main1 {
    public static void main(String[] args) {

        /*Ejercicio: Temperaturas de la semana
        Tienes un array con las temperaturas de los 7 días de la semana: 22, 18, 30, 25, 15, 28, 20
        Tu tarea es:

        Calcular la temperatura media de la semana
        Contar cuántos días han superado los 25 grados
        Mostrar la temperatura más alta y la más baja
        */


        int[] temperatura = new int[]{22, 18, 30, 25, 15, 28, 20};

        double temperaturaMedia = 0;
        int sumatorio = 0;

        for (int item : temperatura) {
            sumatorio += item;

        }
        temperaturaMedia = (double) sumatorio / temperatura.length;
        System.out.printf("la temperatura media es %.2fº%n ", temperaturaMedia);


        int dias = 0;
        for (int item : temperatura) {
            if (item > 25) {
                dias++;

            }
        }

        System.out.println("Los dias con mas de 25º han sido " + dias);

        double temperaturaMax = temperatura[0], temperaturaMin = temperatura[0];
        for (int item : temperatura) {
            if (item > temperaturaMax) {
                temperaturaMax = item;
            }
            if (item < temperaturaMin) {
                temperaturaMin = item;
            }

        }
        System.out.println("la temperatura maxima ha sido de " + temperaturaMax);
        System.out.println("la temperatura minima ha sido de " + temperaturaMin);


    }
}
