public class NotasTrimestre {

    public static void main(String[] args) {

        int [] notasCurso = new int[]{5,7,4,8,10};


        System.out.println("mi nota del curso ha sido " +notasCurso[1]);


        for (int item:notasCurso) {
            System.out.println("mis notas del curso han sido " + item);

        }
        int sumatorioNotas=0;
        for (int item:notasCurso){
            sumatorioNotas += item;


        }
            System.out.println("la media de mis notas es "+(double)sumatorioNotas/notasCurso.length);


        int notaMaxima = notasCurso[0];
        int notaMinima = notasCurso[0];

        for (int item : notasCurso) {
            if (item > notaMaxima) {
                notaMaxima = item;
            }
            if (item < notaMinima) {
                notaMinima = item;
            }
        }

        System.out.println("La nota más alta es: " + notaMaxima);
        System.out.println("La nota más baja es: " + notaMinima);









    }




}
