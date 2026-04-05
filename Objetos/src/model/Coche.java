package model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coche {

    private String color, bastidor, matricula, modelo, marca;
    private int cv, velocidad;
    private double precio;
    private boolean usado;

    //por defecto en toda clase hay un constructor que se denomina constructor vacio.
    // desaparece cuando escribo otro constructor




    public Coche(String marca, String modelo, String bastidor, String color, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.bastidor = bastidor;
        this.color = color;
        this.cv = cv;
    }

    public Coche(String marca, String modelo, String bastidor, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.bastidor = bastidor;
        this.color = color;
    }

    public Coche(String marca, String modelo, int cv, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.precio = precio;
    }

    public Coche(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

   // @Override
    //public String toString() {
     //   return this.modelo +" "+this.marca+" "+this.precio;


public void mostrarDatos(){
    System.out.println(""+marca+modelo+precio);






}






}

























