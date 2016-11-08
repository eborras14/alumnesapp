
package cat.iesjoaquimmir.alumnesapp.model.businesslayer.entities.domicili;

public class Domicili {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private String carrer;
    private String numero;
    private String pis;
    private String codi_postal;
    private String provincia;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public String getCodi_postal() {
        return codi_postal;
    }

    public void setCodi_postal(String codi_postal) {
        this.codi_postal = codi_postal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Contructors">
    public Domicili (String carrer,String numero,String pis,String codi_postal,String provincia){
        this.setCarrer(carrer);
        this.setNumero(numero);
        this.setPis(pis);
        this.setCodi_postal(codi_postal);
        this.setProvincia(provincia);
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
    public String getDomicili(){
        return String.format("%s %s,%s,%s,(%s)",getCarrer(),getNumero(),getPis(),getCodi_postal(),getProvincia());
    }
//</editor-fold>
//</editor-fold>


}
