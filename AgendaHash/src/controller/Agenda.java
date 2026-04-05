package controller;

import model.Persona;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Agenda {
    private HashMap<String, Persona> listaContactos;

    public Agenda() {
        listaContactos = new HashMap<>();

    }

    public Agenda(HashMap<String, Persona> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public void agregarPersona(Persona persona){
        if (listaContactos.containsKey(persona.getDNI())){
            System.out.println("no se puede agregar, dni duplicado");
        }else{
            listaContactos.put(persona.getDNI(),persona);
            System.out.println("persona agregada correctamente");
        }

    }



public void borrarPersona(String dni){
    if (listaContactos.containsKey(dni)){
        listaContactos.remove(dni);
        System.out.println("borrado correctamente");
    }else{
        System.out.println("el dni no esta, no se puede borrar");
    }


}

public Persona obtenerPersona(String dni){
        return listaContactos.get(dni);



}

public void obtenerPersonas(){

        //keys:
    System.out.println("mostrando con keys");
    Set <String> keys = listaContactos.keySet();
    for (String key : keys) {
        listaContactos.get(key).mostrarDatos();

    }

        //values:
    System.out.println("mostrando con values");
    Collection<Persona> values = listaContactos.values();
    for (Persona persona : values) {
        persona.mostrarDatos();

    }


}






}
