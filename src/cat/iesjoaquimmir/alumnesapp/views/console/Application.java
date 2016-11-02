
package cat.iesjoaquimmir.alumnesapp.views.console;
import cat.iesjoaquimmir.alumnesapp.model.businesslayer.entities.alumne.Alumne;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        int opcio;
        String nom;
        String dni;
        int edat;
        Scanner entrada=new Scanner(System.in);
        System.out.printf("1.Nom,DNI,Edat%n2.DNI%n3.DNI,Edat%n4.Edat,nom%n5.Nom,DNI%n6.Sortir%n");
        System.out.printf("Quina opcio vols?");
        opcio = entrada.nextInt();  
         switch (opcio) {
             case 1:
               
                System.out.printf("Digues el teu nom:");
                nom = entrada.next();
                System.out.printf("Digues el teu DNI:");
                dni= entrada.next();
                System.out.printf("Digues la teva edat:");
                edat= entrada.nextInt();
                Alumne a1 = new Alumne (nom,dni,edat);
                System.out.printf("%s",a1.getSalutacio());
                break;
             case 2:
               
                System.out.printf("Digues el teu DNI:");
                dni= entrada.next();
                Alumne a2 = new Alumne (dni);
                System.out.printf("%s",a2.getSalutacio());
                break;
             case 3:
                System.out.printf("Digues el teu DNI:");
                dni= entrada.next();
                System.out.printf("Digues la teva edat:");
                edat= entrada.nextInt();
                Alumne a3 = new Alumne (dni,edat);
                System.out.printf("%s",a3.getSalutacio());
                break;
             case 4: 
                System.out.printf("Digues la teva edat:");
                edat= entrada.nextInt();
                System.out.printf("Digues el teu nom:");
                nom = entrada.next();
                Alumne a4 = new Alumne (edat,nom);
                System.out.printf("%s",a4.getSalutacio());
                break;
             case 5:
                System.out.printf("Digues el teu nom:");
                nom = entrada.next();
                System.out.printf("Digues el teu DNI:");
                dni= entrada.next();
                Alumne a5 = new Alumne (nom,dni);
                System.out.printf("%s",a5.getSalutacio());
                break;
                 
         }
    }
    
}
