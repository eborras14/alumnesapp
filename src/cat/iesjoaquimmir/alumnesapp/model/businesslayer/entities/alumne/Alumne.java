
package cat.iesjoaquimmir.alumnesapp.model.businesslayer.entities.alumne;
import  java.util.ArrayList;
import cat.iesjoaquimmir.alumnesapp.model.businesslayer.entities.domicili.Domicili;

public final class Alumne {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private String nom;
    private String cognom1;
    private String cognom2;
    private ArrayList<String> telefon;
    private String dni;
    private int edat;
    private Domicili domicili;
    public static final String nom_def="Anonymous";
    public static final String cognom1_def="Anon_cognom1";
    public static final String cognom2_def="Anon_cognom2";
    public static final String dni_def="00000000A";
    public static final String telefon_def="000000000";
    public static final int edat_def=99;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters / Setters ">
 
    public String getNom() {
      
        return nom;
    }

    public void setNom(String nom) {
        if (nom==null){
            throw new IllegalArgumentException(String.format("Nom %s no valid",nom));
        }
      //  if(!nom.matches("^[A-Z-a-z]$")){
        //    throw new IllegalArgumentException(String.format("Nom %s no valid",nom));
        //}
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
         if (dni==null){
            throw new IllegalArgumentException(String.format("DNI %s no valid",dni));
        }
         if(!dni.matches("^[0-9]{8}[A-Z]$")){
            throw new IllegalArgumentException(String.format("DNI %s no valid",dni));
        }
        this.dni = dni;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        if (edat<=1){
            throw new IllegalArgumentException(String.format("Edat %d no valida",edat));
        }
        this.edat = edat;
    }
        public String getCognom1() {
        return cognom1;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }


    
    public Domicili getDomicili() {
        return domicili;
    }

    public void setDomicili(Domicili domicili) {
        this.domicili = domicili;
    }
  
    public ArrayList<String> getTelefon() {
        return telefon;
    }

    public void setTelefon(ArrayList<String> telefon) {
        this.telefon = telefon;
    }



//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Alumne (String nom,String cognom1,String cognom2,ArrayList<String> telefon, String dni, int edat,Domicili domicili) {
    this.setNom(nom);
    this.setCognom1(cognom1);
    this.setCognom2(cognom2);
    this.setTelefon(telefon);
    this.setDni(dni);
    this.setEdat(edat);
    this.setDomicili(domicili);
    }
    public Alumne (String dni){
       this(dni,edat_def); 
    }
    public Alumne (String dni, int edat){
       this(nom_def,cognom1_def,cognom2_def,null,dni,edat,null); 
    }
    public Alumne (int edat, String nom){
       this(nom,cognom1_def,cognom2_def,null,dni_def,edat,null); 
    }
    public Alumne (String nom, String dni){
       this(nom,cognom1_def,cognom2_def,null,dni,edat_def,null); 
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
    public String getSalutacio(){
        return String.format("Hola, sóc en/la %s amb identificació %s i tinc %d anys",getNom(),getDni(),getEdat());
    }
//</editor-fold>
//</editor-fold>



}
