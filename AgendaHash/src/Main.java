import controller.Agenda;
import model.Persona;

public class Main {
    public static void main(String[] args) {


        Agenda agenda = new Agenda();
        agenda.agregarPersona(new Persona("borja1","Martin1","12345"));
        agenda.agregarPersona(new Persona("borja2","Martin2","12345"));
        agenda.obtenerPersona("Martin1").mostrarDatos();
        agenda.obtenerPersonas();
























    }

}
