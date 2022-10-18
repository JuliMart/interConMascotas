
package intermia.models.services;

import intermia.models.Mascota;
import java.util.ArrayList;


public class MascotaService implements IMascotaService{
    
    final ArrayList <Mascota> Lista = new ArrayList();
    
    @Override
    public void Crear(Mascota m) {
        Lista.add(m);
    }

    @Override
    public void Reemplazar(int indice, Mascota m) {
        Lista.set(indice, m);
    }

    @Override
    public void Eliminar(Mascota m) {
        Lista.remove(m);
    }

    @Override
    public ArrayList<Mascota> ObtenerTodo() {
        return Lista;
    }

    @Override
    public Mascota Obtener(int indice) {
        return Lista.get(indice);
        }
    
    @Override
    public void Imprimir(){
        for (Mascota m:Lista){
            System.out.println(m);
        }
    } 
}
    
