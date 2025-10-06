import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Automovil auto1 = new Automovil("bmw","I320","blanco",3.2);
        // Constructor
        /*/ASIGNAR VALORES
        auto1.marca="BMW";
        auto1.modelo="I320";
        auto1.cilindraje=3.2;
        auto1.color="Negro";
        //*
         */
        //desplegar valor de los objetos


        //auto1.detalle();
        // CReacion de objeto de las flores
        Flores flor1 = new Flores("Girasol","Verde",20,40);
        System.out.print("Ingrese el color de la flor :");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        flor1.color= br.readLine();
        String cc;
        cc=flor1.detalle(flor1.color);



        System.out.print("Ingrese el nombre de la flor :");
        flor1.nombre = br.readLine();
        System.out.print("Ingrese el precio de la flor :");
        flor1.precio= Double.parseDouble(br.readLine());
        System.out.print("Ingrese el stock de la flor :");
        flor1.stock= Integer.parseInt(br.readLine());
        System.out.print("Ingrese el color de la flor :");
        flor1.color= br.readLine();









        //Salida objetos

        System.out.println("Producto 1");

        System.out.println("Producto 2");



        //flor1.nombre= JOptionPane.showInputDialog("Nombre de la flor:");
        //JOptionPane.showMessageDialog(null,"El nombre de la flor es:" +flor1.nombre);



    }
}
