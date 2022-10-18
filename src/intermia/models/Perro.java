
package intermia.models;


public class Perro extends Mascota {
    private String Pelaje;

    public Perro(String Pelaje, String Nombre, String Color, String Raza) {
        super(Nombre, Color, Raza);
        this.Pelaje = Pelaje;
    }

    public Perro(String Pelaje) {
        this.Pelaje = Pelaje;
    }
    public Perro(){
        super();
        this.Pelaje = "";
    }
    
    public String getPelaje() {
        return Pelaje;
    }
    
    public void setPelaje(String Pelaje) {
        this.Pelaje = Pelaje;
    }
    


    
    @Override
    public String Hace(){
        return "GUAU GUAU";
    }
    
    @Override
    public String toString(){
    
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre: ").append(super.getNombre());
        sb.append("\nColor: ").append(super.getColor());
        sb.append("\nRaza: ").append(super.getRaza());
        sb.append("\nPelaje: ").append(this.getPelaje());
        sb.append("\nRuido: ").append(this.Hace());
        return sb.toString();
    }   
}    
    

       
    

    


