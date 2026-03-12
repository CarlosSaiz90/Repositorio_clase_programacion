public class Main {
    public static void main(String[] args) {
        //Array
        // mediante numero de "huecos"
        // mediante elementos

        int[] listaNumeros = new int[5];
        boolean[] listaAciertas = new boolean[3];
        double[] listaNotas = new double[6];
        String[] listaNombres = new String[4];

        int[] listaNumerosIntroducidos = new int[]{78, 23, 45, 72, 24, 65};

        System.out.println("el tamaño del array es " + listaNumeros.length);
        listaNumeros[listaNumeros.length - 1] = 34;
        listaNumeros[0] = 64;
        listaNumeros[listaNumeros.length / 2] = 56;

        System.out.println("accediendo a posiciones ");
        System.out.println("la posicion 0 es el valor: " + listaNumeros[0]);
        System.out.println("la posicion 0 es el valor: " + listaNumeros[listaNumeros.length - 1]);
        System.out.println("la posicion 0 es el valor: " + listaNumeros[listaNumeros.length / 2]);

        //sacar todos los numeros del array:

        System.out.println("imprimiendo lista array");
        int sumatorio = 0;
        for (int i = 0; i < listaNumeros.length; i++) {
            //System.out.println(listaNumeros[i]);
            sumatorio += listaNumeros[i];

        }
        System.out.println(sumatorio);

        for (int i = 0; i < listaNumeros.length; i++) {

            listaNumeros[i] = (int) (Math.random() * 50);
            System.out.println("imprimir elementos array " + listaNumeros[i]);

        }

        
            for (int item:listaNumeros){
                System.out.println("ejecutando valor "+item);
                sumatorio=+item;
            }
        
        
        
        
        
        
        
        
        
        
        
        
    }


}
