import javax.swing.JOptionPane;

public class Flores {
    String color;
    String nombre;
    double precio;
    int stock;

    public Flores(String color, String nombre, double precio, int stock) {
        this.color = color;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String detalle(String color){
        String c;

        JOptionPane.showMessageDialog(null,"COlor: \n"+ color);
        c = color+"Rojo";
        return c;
    }


}
