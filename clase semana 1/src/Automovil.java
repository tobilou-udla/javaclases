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
        this.color = color;
        this.cilindraje = cilindraje;
    }

    //System.out.println("Info del metodo");
    //METDO PARA IMPRIIR
    public void detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("auto1.marca: ").append(this.marca).append("\n");
        sb.append("auto1.modelo: ").append(this.modelo).append("\n");
        sb.append("auto1.color: ").append(this.color).append("\n");
        sb.append("auto1.cilindraje: ").append(this.cilindraje);
        System.out.println(sb.toString());
    }

}
