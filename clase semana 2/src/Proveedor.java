public class Proveedor {
    String RUC;
    String razonsocial;
    String direccin;


    //Constructor
    public Proveedor() {

    }

    public Proveedor(String RUC, String razonsocial) {
        this.RUC = RUC;
        this.razonsocial = razonsocial;
    }

    public Proveedor(String RUC, String razonsocial, String direccin) {
        this.RUC = RUC;
        this.razonsocial = razonsocial;
        this.direccin = direccin;
    }

    //Metdos Java

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getDireccin() {
        return direccin;
    }

    public void setDireccin(String direccin) {
        this.direccin = direccin;
    }


    //Metodos programa

    public String detalleProveedor(String ruc, String rs, String dir){
        StringBuilder sb = new StringBuilder();
        sb.append("EL ruc del proveedor es:").append(ruc).append("\n");
        sb.append("Razon social :").append(rs).append("\n");
        sb.append("Direccion:").append(dir).append("\n");
        return sb.toString();
    }




}
