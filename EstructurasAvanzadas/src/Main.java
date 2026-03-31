import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {


    int [] numeros = new int[]{2,2,4,4,10,6,7};
    String[] palabras = new String[]{"hola","programacion","elemento","ordenacion","caramba","esternomastoideo"};


        ArrayList <Integer> listaCosas = new ArrayList<>();

        listaCosas.add(5);
        listaCosas.add(10);
        listaCosas.add(15);

        System.out.println("el tamaño es de "+listaCosas.size());
        System.out.println(listaCosas.get(1));


        listaCosas.remove(1);
        int sumatorio =0;
        for (Integer listaCosa : listaCosas) {
            sumatorio += listaCosa;


        }
        System.out.println(sumatorio);































    }
}
