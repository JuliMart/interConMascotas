
package intermia.models;


public abstract class Mascota {

    private String Nombre;
    private String Color;
    private String Raza;

    public Mascota(String Nombre, String Color, String Raza) {
        this.Nombre = Nombre;
        this.Color = Color;
        this.Raza = Raza;
    }
    
    public Mascota() {
        this.Nombre = "";
        this.Color = "";
        this.Raza = "";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }


    public abstract String Hace();
        
    
        
    
        
        
   
    
}
    

