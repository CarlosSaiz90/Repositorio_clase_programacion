
//INSTRUCCIONES SUDOKU:

public class Sudoku {

    private int[][] cuadrado = new int[4][4];


    public void iniciarCuadrado (){
        System.out.println("Procedemos a iniciar el sudoku ");
        rellenarNumeros();
        mostrarNumeros();
    }


    public void rellenarNumeros(){

        for (int i = 0; i < cuadrado.length ; i++) {
            for (int j = 0; j <cuadrado[i].length ; j++) {
                //System.out.print(numeros[i][j] + "\t");
                int aleatorio;
                do {
                     aleatorio = (int) (Math.random() * 20) + 1;
                }while(estaNumero(aleatorio));

                //estaNumero(aleatorio);
                // SI NO ESTA EN EL CUADRADO. EN CASO DE SI ESTAR GENERA OTRO PARA NO REPETIR
                cuadrado[i][j] = aleatorio;
            }

        }

            // GUARDAR AQUELLOS QUE NO ESTAN REPETIDOS
    }


    private boolean estaNumero(int numero){
        //el numero a comparar
        // Array que quieres recorrer
        // comparar
    for (int[] fila :cuadrado){
        for (int item : fila) {
            if (item==numero){
                return true;
            }
        }
    }
    return false;

    }






    public void mostrarNumeros() {
        for (int[] fila : cuadrado) {
            for (int item : fila) {
                System.out.print(item + "\t");

            }
            System.out.println();
        }
    }





































}
