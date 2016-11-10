
package cat.iesjoaquimmir.alumnesapp.model.businesslayer.entities.moduls;
public class Moduls {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private String nom;
    private String descripcio;
    private String num_hores;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
  
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(nom==null){
            throw new IllegalArgumentException(String.format("Nom %s no valida",nom));
        }
        this.nom = nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
       if(descripcio==null){
           throw new IllegalArgumentException(String.format("Descripcio %s no valida",descripcio));
       }
        this.descripcio = descripcio;
    }

    public String getNum_hores() {
        return num_hores;
    }

    public void setNum_hores(String num_hores) {
        if(num_hores==null){
            throw new IllegalArgumentException(String.format("Numero d'hores %s no valida",num_hores));
        }
        this.num_hores = num_hores;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Moduls(String nom, String descripcio, String num_hores){
        this.setNom(nom);
        this.setDescripcio(descripcio);
        this.setNum_hores(num_hores);
    }
    public Moduls (String nom,String num_hores){
        this(nom,null,num_hores);
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
     public String getNom_modul(){
         return String.format("Modul %s Descripcio:%s Hores:%s",getNom(),getDescripcio(),getNum_hores());
     }
//</editor-fold>
//</editor-fold>


}