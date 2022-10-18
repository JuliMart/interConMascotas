
package intermia.models;


public class Gato extends Mascota {
    private Boolean tieneUnas;

    public Gato(Boolean tieneUnas, String Nombre, String Color, String Raza) {
        super(Nombre, Color, Raza);
        this.tieneUnas = tieneUnas;
    }

    public Gato(Boolean tieneUnas) {
        this.tieneUnas = tieneUnas;
    }
    
    public Gato() {
        super();
        this.tieneUnas = true;
    }

    public Boolean getTieneUnas() {
        return tieneUnas;
    }
    public void setTieneUnas(Boolean tieneUnas) {
        this.tieneUnas = tieneUnas;
    }
    
    
    @Override
    public String Hace(){
        return "MIAU MIAU";
    }
    @Override
    public String toString(){
    
    StringBuilder sb = new StringBuilder();
    sb.append("\nNombre: ").append(super.getNombre());
    sb.append("\nColor: ").append(super.getColor());
    sb.append("\nRaza: ").append(super.getRaza());
    sb.append("\nTiene Uñas: ").append(this.getTieneUnas());
    sb.append("\nRuido: ").append(this.Hace());
    return sb.toString();
    }
    
}    




