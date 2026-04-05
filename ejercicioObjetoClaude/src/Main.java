import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

   /* Persona persona = new Persona("Carlos",35);
    Persona persona2 = new Persona("Maria",22);

        persona.presentarse();

        persona2.setEdad(28);
        System.out.println();
        persona2.presentarse();
*/



       /* Coche renault=new Coche("renault","Megane",120);
        renault.mostrarInfo();
        renault.acelerar(50);
        renault.mostrarInfo();
        renault.frenar(-30);
        renault.mostrarInfo();
        */



 /*CuentaBancaria cuentaBancaria =new CuentaBancaria("Carlos",500);
 cuentaBancaria.ingresar(200);
 cuentaBancaria.mostrarSaldo();
 cuentaBancaria.retirar(1000);
 cuentaBancaria.mostrarSaldo();
 cuentaBancaria.retirar(100);
 cuentaBancaria.mostrarSaldo();
 */

        Estudiante estudiante = new Estudiante("Carlos");

/*estudiante.agregarNota(6.5);
estudiante.agregarNota(8.9);
estudiante.agregarNota(5);
estudiante.agregarNota(7.3);
estudiante.agregarNota(12.3);
System.out.println(estudiante.getNotas());
estudiante.mostrarInfo();

 */

        int resultado;
        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < 6; j++) {
                resultado = i * j;
                System.out.println(i + "x" + j + "=" + resultado);
            }

        }


    }
}
