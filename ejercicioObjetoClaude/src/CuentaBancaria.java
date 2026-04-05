import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CuentaBancaria {

private String titular;
private double saldo;


public void ingresar(double cantidad) {
    if (cantidad <= 0) {
        cantidad =0;
        System.out.println("error intente de nuevo");
    } else {
        saldo += cantidad;
    }
}


public void retirar (double cantidad){
    if (cantidad > saldo){
        cantidad =0;
        System.out.println("error intente de nuevo");
    }else{
       saldo -= cantidad;

    }

    }
public void mostrarSaldo(){
    System.out.println("EL titular de la cuenta es "+titular);
    System.out.println("El saldo en cuenta es de: "+saldo);
    }

}





































