
package intermia.models;

public class PerroChico extends Perro {
    private String TipoPerroChico;

    public PerroChico(String TipoPerroChico, String Pelaje, String Nombre, String Color, String Raza) {
        super(Pelaje, Nombre, Color, Raza);
        this.TipoPerroChico = TipoPerroChico;
    }

    public PerroChico(String TipoPerroChico, String Pelaje) {
        super(Pelaje);
        this.TipoPerroChico = TipoPerroChico;
    }

    public PerroChico(String TipoPerroChico) {
        this.TipoPerroChico = TipoPerroChico;
    }
    
    public PerroChico(){
        super();
        this.TipoPerroChico = "";
    }

    public String getTipoPerroChico() {
        return TipoPerroChico;
    }

    public void setPerroChico(String PerroChico) {
        this.TipoPerroChico = TipoPerroChico;
    }
    
}
