
package intermia;

import intermia.models.Gato;
import intermia.models.Perro;
import intermia.models.PerroChico;
import intermia.models.services.IMascotaService;
import intermia.models.services.MascotaService;

public class InterMia {

    public static void main(String[] args) {
       
        
        System.out.println("hola");
        
        Perro p = new Perro();
        
        p.setNombre("Leon");
        p.setColor("Caqui");
        p.setPelaje("Largo");
        p.setRaza("Dogo de Borneo");
        
        
        
        PerroChico t = new PerroChico();
        t.setNombre("Chicho");
        t.setColor("Amarillo patito");
        t.setRaza("De la luna");
        t.setPerroChico("Chihuahuin");
        
       
        
        
        
        
        Perro l = new Perro();
        l.setNombre("Nikki");
        l.setColor("Verde");
        l.setPelaje("Corto");
        l.setRaza("De carrera");
        
        
        Gato g = new Gato();
        g.setNombre("Mishu");
        g.setColor("Blanquito");
        g.setRaza("Mishuno");
        g.setTieneUnas(Boolean.FALSE);
        
        System.out.println(p);
        System.out.println(l);
        System.out.println(g);
        System.out.println(t);
        
        
        IMascotaService MascotaApp = new MascotaService();{
    
            MascotaApp.Crear(p);
            MascotaApp.Crear(g);
            MascotaApp.Crear(t);
            
            
            MascotaApp.Imprimir();
    
        }
        
        
        }
        
        
    }
    

