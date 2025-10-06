import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Proveedor vendor1= new Proveedor();
        Scanner sc = new Scanner(System.in);
        String ruc,rs,dir,dp;
        System.out.print("Provedor RUC: ");
        ruc=sc.nextLine();
        System.out.print("Provedor Razon Social: ");
        rs=sc.nextLine();
        System.out.print("Provedor Direccion: ");
        dir=sc.nextLine();
        dp= vendor1.detalleProveedor(ruc,rs,dir);

        System.out.println("Los datos son\n"+dp);
        
    }
}
