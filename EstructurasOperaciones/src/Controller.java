public class Controller {


    String[] correos = new String[5];


    public boolean metodoandir(String correo) {


        for (int i = 0; i < correos.length; i++) {
            if (correos[i] == null) {
                correos[i] = correo;
                return true;
            }

        }
    return false;
    }



    public void metodoListar() {
        System.out.println("listar elemento");
        for (String item : correos) {
            System.out.println(item);
        }
    }


    public boolean metodoBuscar(String correo) {


        for (String item : correos) {
            if (item!=null && item.equalsIgnoreCase(correo)){
                System.out.println("encontrado");
                return true;
            }


        }
        return false;
    }


}
