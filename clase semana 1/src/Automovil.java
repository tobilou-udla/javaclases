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
        sb.append("marca: ").append(this.marca).append("\n");
        sb.append("modelo: ").append(this.modelo).append("\n");
        sb.append("color: ").append(this.color).append("\n");
        sb.append("cilindraje: ").append(this.cilindraje);
        System.out.println(sb.toString());
    }

}
