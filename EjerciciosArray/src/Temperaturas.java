public class Temperaturas {
    public static void main(String[] args) {

        double[] temperatura = {19.5, 22, 21.2, 25.8, 30, 16.45, 41.3};
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int[] numerosRandom = new int[10];


        for (int i = 0; i < numerosRandom.length; i++) {
            numerosRandom[i] = (int) (Math.random() * 50) + 1;

            System.out.println("mis numeros aleatorios son en la posicion " + i + " el " + numerosRandom[i]);
        }

        int numeroAlto = numerosRandom[0];

        for (int item:numerosRandom){
            if (item> numeroAlto){
                numeroAlto = item;


            }
        }
        System.out.println("el numero mas alto es "+numeroAlto);








        for (int i = 0; i < temperatura.length; i++) {
            System.out.println(diasSemana[i] + ":" + temperatura[i] + "º");

        }

        double mediaTemperatura = 0;

        for (double item : temperatura) {
            mediaTemperatura += item;


        }
        double media = mediaTemperatura / temperatura.length;
        System.out.printf("la temperatura media es de %.2fº", media);
        System.out.println();

        double temperaturaMax = temperatura[0], temperaturaMin = temperatura[0];

        for (double item : temperatura) {
            if (item >= temperaturaMax) {
                temperaturaMax = item;
            }
            if (item < temperaturaMin) {
                temperaturaMin = item;
            }


        }
        System.out.println("la temperatura maxima es " + temperaturaMax);

        System.out.println("la temperatura minima es " + temperaturaMin);


    }


}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


