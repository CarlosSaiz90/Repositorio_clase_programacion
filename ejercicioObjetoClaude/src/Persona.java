import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor



public class Persona {

private String nombre;
private int edad;

public void presentarse(){
    System.out.printf("Hola me llamo %s y tengo %d años",nombre,edad);

}

}





























