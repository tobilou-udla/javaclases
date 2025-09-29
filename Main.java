public class Main {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil();
        // Constructor
        //ASIGNAR VALORES
        auto1.marca="BMW";
        auto1.modelo="I320";
        auto1.cilindraje=3.2;
        auto1.color="Negro";
        //desplegar valor de los objetos
        //auto1.detalle();
        // CReacion de objeto de las flores
        Flores flor1 = new Flores();
        flor1.color="Rojo";
        flor1.nombre="Rosa";
        flor1.precio= 1;
        flor1.stock= 300;

        Flores flor2 = new Flores();
        flor2.color="Amarillo";
        flor2.nombre="Girasol";
        flor2.precio= 2.5;
        flor2.stock= 300;

        //Salida objetos

        System.out.println("Producto 1");

        flor1.detalle();

        System.out.println("Producto 2");

        flor2.detalle();



    }
}
