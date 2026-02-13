public class GestorFinancieroJava {

public void calcularIva(double precioSinIva) {
    double resultado = precioSinIva * 1.21;
    System.out.println("El precio del producto sin el iva es "+resultado+ "€");
}

public void cambioDolares(double euros){
    double resultado = euros * 1.08;
    System.out.println(+euros+ "+euros equivalen a " +resultado+ " dolares ");

}

public void mediaNotasCurso(int nota1, int nota2, int nota3){
    int resultado = (nota1+nota2+nota3)/3;
    System.out.println("La media de tus notas es "+resultado);
}










}
