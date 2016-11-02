
package cat.iesjoaquimmir.alumnesapp.model.businesslayer.entities.alumne;
public final class Alumne {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private String nom;
    private String dni;
    private int edat;
    public static final String nom_def="Anonymous";
    public static final String dni_def="00000000A";
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
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Alumne (String nom, String dni, int edat) {
    this.setNom(nom);
    this.setDni(dni);
    this.setEdat(edat);
    }
    public Alumne (String dni){
       this(nom_def,dni,edat_def); 
    }
    public Alumne (String dni, int edat){
       this(nom_def,dni,edat); 
    }
    public Alumne (int edat, String nom){
       this(nom,dni_def,edat); 
    }
    public Alumne (String nom, String dni){
       this(nom,dni,edat_def); 
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
    public String getSalutacio(){
        return String.format("Hola, sóc en/la %s amb identificació %s i tinc %d anys.",getNom(),getDni(),getEdat());
    }
//</editor-fold>
//</editor-fold>

}
