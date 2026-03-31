public class Main {



   /* Ejercicio: Gestión de notas de clase
    Tienes un array con las notas de 5 alumnos. Tu tarea es:
    Crear un array con estas notas: 85, 42, 91, 67, 55
    Calcular la media de todas las notas
    Mostrar cuántos alumnos han aprobado (nota ≥ 60)
    Mostrar la nota más alta y la más baja
    */

    public static void main(String[] args) {


        int[] notasAlumnos = new int[]{85, 42, 91, 67, 55};


        int sumatorio = 0;
        double notaMedia;
        for (int item : notasAlumnos) {
            sumatorio += item;

        }
        notaMedia = sumatorio / notasAlumnos.length;
        System.out.println("la nota media es " + notaMedia);


        int aprobado = 0;
        for (int item : notasAlumnos) {
            if (item >= 60) {
                aprobado++;
            }

        }
        System.out.println("los alumnos aprobados son " + aprobado);

        int notaAlta = notasAlumnos[0], notaBaja = notasAlumnos[0];

        for (int item : notasAlumnos) {
            if (item > notaAlta) {
                notaAlta = item;
            }
            if (item < notaBaja) {
                notaBaja = item;
            }
        }
        System.out.println("la nota mas alta es " + notaAlta);
        System.out.println("la nota mas baja es " + notaBaja);


    }
}
