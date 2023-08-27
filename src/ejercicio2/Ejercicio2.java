package ejercicio2;
import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args) {
        int edad;
        int regalo=0;
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingresa edad: ");
        edad=entrada.nextInt();
        if (edad>=15){
            System.out.println("Ingrese 1.trajo regalo \n 0.no trajo regalo");
            regalo=entrada.nextInt();
            switch(regalo){
                case 1:System.out.println("El invitado sí puede ingresar a la fiesta.");break;
                case 0:System.out.println("El invitado no puede inrgesar a la fiesta.");break;
                default:System.out.println("ingrese otro digito");break; 
            }
        }
            else{
                    System.out.println("El invitado sí puede ingresar a la fiesta.");
                    }
        
    }
}