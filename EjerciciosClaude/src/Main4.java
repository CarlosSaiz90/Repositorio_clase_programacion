import java.util.*;

public class Main4 {
    public static void main(String[] args) {


        ArrayList<String> listaAlumnos = new ArrayList<>();
        listaAlumnos.add("Ana");
        listaAlumnos.add("Carlos");
        listaAlumnos.add("Maria");
        listaAlumnos.add("Pedro");
        listaAlumnos.add("Laura");
        listaAlumnos.add("Juan");




        ArrayList <> caca = new ArrayList<>();
        caca.add("hpña")
                caca.add(2)



        Collections.sort(listaAlumnos);
        System.out.println(listaAlumnos);

        for (String item : listaAlumnos) {
            System.out.println(item);

        }
            boolean alumnoEncontrado = false;
        for (String item : listaAlumnos) {
            if (item.equals("Maria")){
                alumnoEncontrado = true;
            }
        }

            System.out.println("Esta Maria? "+alumnoEncontrado);

        System.out.println("El primer alumno o alumna de la lista es "+listaAlumnos.get(0));
        System.out.println("El ultimo alumno o alumna de la lista es " +listaAlumnos.get(listaAlumnos.size()-1));


        System.out.println("Esta Maria en la clase? "+listaAlumnos.contains(listaAlumnos));





        Arrays.



        listaAlumnos.sort(null);
        System.out.println(listaAlumnos);









    }
}
