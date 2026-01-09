import javax.swing.JOptionPane;

public class Flores {
    private String color;
    private String nombre;
    private double precio;
    private int stock;

    public Flores(String nombre, String color, double precio, int stock) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
        this.stock = stock;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String detalle(String color){
        JOptionPane.showMessageDialog(null,"COlor: \n"+ color);
        return color + "Rojo";
    }


}
