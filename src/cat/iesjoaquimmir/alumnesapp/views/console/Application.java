package cat.iesjoaquimmir.alumnesapp.views.console;
import cat.iesjoaquimmir.alumnesapp.model.businesslayer.entities.alumne.Alumne;
import cat.iesjoaquimmir.alumnesapp.model.businesslayer.entities.domicili.Domicili;
import cat.iesjoaquimmir.alumnesapp.model.businesslayer.entities.moduls.Moduls;
import java.util.Scanner;
import  java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        int opcio;
        int opcio_tel;
        int i;
        String nom;
        String nom_modul;
        String descripcio;
        String num_hores;
        String dni;
        String cognom1;
        String cognom2;
        ArrayList<String> telefon = new ArrayList<>();
        ArrayList<Moduls> modul = new ArrayList<>();
        int edat;
        String carrer;
        String numero;
        String pis;
        String cp;
        String provi;
        Scanner entrada=new Scanner(System.in);
        System.out.printf("1.Informacio completa%n2.DNI%n3.DNI,Edat%n4.Edat,nom%n5.Nom,DNI%n6.Sortir%n");
        System.out.printf("Quina opcio vols?");
        opcio = entrada.nextInt();  
         switch (opcio) {
             case 1:
               
                System.out.printf("Digues el teu nom:");
                nom = entrada.next();
                System.out.printf("Digues el cognom 1:");
                cognom1=entrada.next();
                System.out.printf("Digues el cognom 2:");
                cognom2=entrada.next();
                System.out.printf("-----Telefon------%n");
                    System.out.printf("Quants telf. vols?");
                    opcio_tel= entrada.nextInt();
                    for(i=0;i<opcio_tel;i++){
                        System.out.printf("Telefon %d:",i+1); 
                        telefon.add(entrada.next());
                    }
                System.out.printf("Quants moduls vols?");
                    opcio_tel= entrada.nextInt();
                    for(i=0;i<opcio_tel;i++){
                        System.out.printf("Nom modul:"); 
                        nom_modul=entrada.next();
                        System.out.printf("Descripcio:"); 
                        descripcio=entrada.next();
                        System.out.printf("Num. hores:"); 
                        num_hores=entrada.next();
                        modul.add(new Moduls(nom_modul,descripcio,num_hores));
                        
                    }
                    
                System.out.printf("Digues el teu DNI:");
                dni= entrada.next();
                System.out.printf("Digues la teva edat:");
                edat= entrada.nextInt();
                System.out.printf("Digues el carrer:");
                carrer= entrada.next();
                System.out.printf("Digues el numero:");
                numero= entrada.next();
                System.out.printf("Digues el pis:");
                pis= entrada.next();
                System.out.printf("Digues el CP:");
                cp= entrada.next();
                System.out.printf("Digues la provincia:");
                provi=entrada.next();
                Domicili d1 = new Domicili (carrer,numero,pis,cp,provi);
                Alumne a1 = new Alumne (nom,cognom1,cognom2,telefon,dni,edat,d1,modul);
                System.out.printf("%s %nAdreça: %s%n",a1.getSalutacio(),a1.getDomicili().getDomicili());
                System.out.printf("-----Telefons------%n");
                for(int x=0;x<telefon.size();x++) {
                    System.out.printf("Telefon %d: %s%n",x+1,telefon.get(x));
                }
                System.out.printf("-----Moduls------%n");
                 for(int x=0;x<modul.size();x++) {
                    System.out.printf("%s %n",a1.getModul().get(x).getNom_modul());
                }
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
