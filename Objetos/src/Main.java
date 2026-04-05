import model.Coche;

public class Main {
    public static void main(String[] args) {

        Coche opel = new Coche();

        // instancia de la clase = un objeto de la clase

        Coche ford = new Coche("Ford", "Focus", "1234A", "verde", 500);
        //ford.setCv(70);
        //System.out.println("los caballos que tiene el ford son "+ford.getCv());
        //System.out.println("el modelo del ford es "+ford.getModelo());
        System.out.println(ford);
        ford.getModelo();


        Coche mercedes = new Coche("Mercedes","Clase C",80000);
        System.out.println(mercedes);
        mercedes.mostrarDatos();
        ford.mostrarDatos();
        System.out.println(""+ford.getModelo());



























    }
}
