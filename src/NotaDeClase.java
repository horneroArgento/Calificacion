import java.util.Scanner;
public class NotaDeClase {
    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);
       int nota;

        System.out.println("Ingrese la calificacion:");
        nota = tec.nextInt();

       if(nota < 0 || nota > 10){
           System.out.println("La nota ingresada no es valida");
       }
       else if(nota <= 4){
           System.out.println("Aplazado");
       }
       else if(nota <= 6){
           System.out.println("Desaprobado");
       }
       else{
           System.out.println("Aprobado");
       }
    }
}