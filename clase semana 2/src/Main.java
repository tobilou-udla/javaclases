import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Proveedor vendor1= new Proveedor();
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Provedor RUC: ");
            String ruc = sc.nextLine();
            System.out.print("Provedor Razon Social: ");
            String rs = sc.nextLine();
            System.out.print("Provedor Direccion: ");
            String dir = sc.nextLine();
            String dp = vendor1.detalleProveedor(ruc,rs,dir);

            System.out.println("Los datos son\n"+dp);
        }
    }
}
