
package intermia.models.services;

import intermia.models.Mascota;
import java.util.ArrayList;


public interface IMascotaService {
    public void Crear(Mascota m );
    public void Reemplazar(int indice,Mascota m);
    public void Eliminar(Mascota m);
    public ArrayList<Mascota> ObtenerTodo();
    public Mascota Obtener(int indice);
    public void Imprimir();
}
    

