public class Automovil {
    String marca;
    String modelo;
    String color="Blanco";
    double cilindraje;

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Automovil(String marca, String modelo, String color, double cilindraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color="Blanco";
        this.cilindraje = cilindraje;
    }

    //System.out.println("Info del metodo");
    //METDO PARA IMPRIIR
    public void detalle(){
        String modelo ="AUDI";
        System.out.println("auto1.marca: "+ this.marca);
        System.out.println("auto1.modelo: "+ this.modelo);
        System.out.println("auto1.color: "+ this.color);
        System.out.println("auto1.cilindraje: "+ this.cilindraje);
    }

}
