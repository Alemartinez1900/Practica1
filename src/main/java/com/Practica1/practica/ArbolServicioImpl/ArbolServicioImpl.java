package com.Practica1.practica.ArbolServicioImpl;

import com.Practica1.practica.Repositorio.ArbolRepositorio;
import com.Practica1.practica.entidad.Arbol;
import com.Practica1.practica.servicio.ArbolServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArbolServicioImpl implements ArbolServicio {

    @Autowired
    private ArbolRepositorio repositorio;

    @Override
    public List<Arbol> listadoArboles() {
        return repositorio.findAll();
    }

    @Override
    public Arbol guardarArbol(Arbol arbol) {
        return repositorio.save(arbol);
    }

    @Override
    public Arbol actualizarArbol(Arbol arbol) {
        return repositorio.save(arbol);
    }

    @Override
    public Arbol obtenerArbolPorId(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public void eliminarArbol(Long id) {
        repositorio.deleteById(id);
    }

}
