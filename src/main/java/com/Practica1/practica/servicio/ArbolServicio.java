
package com.Practica1.practica.servicio;

import com.Practica1.practica.entidad.Arbol;
import java.util.List;

/**
 *
 * @author AMD
 */
public interface ArbolServicio {
    public List <Arbol> listadoArboles();
    
    public Arbol guardarArbol( Arbol arbol);
    
    public Arbol obtenerArbolPorId (Long id);
    
    public Arbol actualizarArbol (Arbol arbol);
    
    public void eliminarArbol(Long id);
    
}
