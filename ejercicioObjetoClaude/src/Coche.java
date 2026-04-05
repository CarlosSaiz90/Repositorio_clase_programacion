import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coche {


    private String marca, modelo;
    private int velocidad;



    public void acelerar(int cantidad) {
        velocidad += cantidad;
    }


    public void frenar(int cantidad) {
        if (velocidad - cantidad < 0) {
            velocidad = 0;
        } else {
            velocidad -= cantidad;
        }
    }


    public void mostrarInfo(){
        System.out.printf("La marca del coche es %s el modelo es %s y tiene una velocidad de %d\n",marca,modelo,velocidad);

    }
}














