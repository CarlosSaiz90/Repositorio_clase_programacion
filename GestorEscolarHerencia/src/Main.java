import model.Alumno;
import model.Persona;
import model.Profesor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al gestor escolar");

        Alumno alumno1 = new Alumno("Borja","Martin",123,"DAM");
        Alumno alumno2 = new Alumno("Borja","Martin",123,"DAM");
        Alumno alumno3 = new Alumno("Borja","Martin",123,"DAM");
        Alumno alumno4 = new Alumno("Borja","Martin",123,"DAM");
        Profesor profesor1 = new Profesor("Maria","Lopez",30000,12);
        Profesor profesor2 = new Profesor("Maria","Lopez",30000,12);
        Profesor profesor3 = new Profesor("Maria","Lopez",30000,12);
        Profesor profesor4 = new Profesor("Maria","Lopez",30000,12);

        ArrayList<Persona>listaPersonas = new ArrayList<>();
        listaPersonas.add(alumno1);
        listaPersonas.add(alumno2);
        listaPersonas.add(alumno3);
        listaPersonas.add(alumno4);
        listaPersonas.add(profesor1);
        listaPersonas.add(profesor2);
        listaPersonas.add(profesor3);
        listaPersonas.add(profesor4);



        for (Persona persona : listaPersonas) {
            persona.saludar();
            persona.mostarDatos();
            if (persona instanceof Alumno){
                ((Alumno)persona).realizarExamen();
            } else if (persona instanceof Profesor) {
                ((Profesor)persona).corregirExamen();
            }

            //((Profesor)persona).corregirExamen();
        //((Alumno)persona).realizarExamen();


        }
        
        





















    }
}




