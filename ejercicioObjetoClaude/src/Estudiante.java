import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {

private String nombre;
private ArrayList<Double> notas = new ArrayList<Double>();


    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }


public void agregarNota(double nota){
        if (nota<0 || nota>10){
            System.out.println("nota incorrecta, intente de nuevo");
        }else{
            notas.add(nota);
        }
}

    public double calcularMedia(){
        double suma = 0;
        for (Double nota : notas) {
            suma += nota;
        }

        return suma / notas.size();

    }




    public void mostrarInfo(){
        System.out.println("El alumno se llama: "+nombre);
        System.out.println("sus notas han sido: "+getNotas());
        System.out.printf("la media de las notas del alumno es %.1f: ",calcularMedia());


    }


    }



