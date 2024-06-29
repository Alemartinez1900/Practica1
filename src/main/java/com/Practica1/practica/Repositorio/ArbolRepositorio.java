
package com.Practica1.practica.Repositorio;

import com.Practica1.practica.entidad.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArbolRepositorio extends JpaRepository<Arbol, Long> {
    
}

