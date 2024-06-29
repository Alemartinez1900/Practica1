package com.Practica1.practica.Controller;

import com.Practica1.practica.entidad.Arbol;
import com.Practica1.practica.servicio.ArbolServicio;
import lombok.experimental.PackagePrivate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class arbolController {

    @Autowired
    private ArbolServicio servicio;

    @GetMapping({"/Arbol", "/"})
    public String listadoArboles(Model modelo) {
        modelo.addAttribute("arboles", servicio.listadoArboles());
        return "arbol";

    }

    @GetMapping("/Arbol/nuevo")
    public String crearArbol(Model modelo) {
        Arbol arbol = new Arbol();
        modelo.addAttribute("arbol", arbol);
        return "crear_Arbol";
    }

    @PostMapping("/Arbol/guardar")
    public String guardarArbol(@ModelAttribute("Arbol") Arbol arbol) {
        servicio.guardarArbol(arbol);
        return "redirect:/Arbol";
    }

    @GetMapping("arbol/editar/{id}")

    public String mostrarFormularioDeEdicion(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("arbol", servicio.obtenerArbolPorId(id));
        return "editar_Arbol";
    }

    @PostMapping("/arbol/editar/{id}")
    public String guardarArbol(@PathVariable Long id, @ModelAttribute("arbol") Arbol arbol) {

        Arbol arbolExistente = servicio.obtenerArbolPorId(id);
        if (arbolExistente != null) {
            arbolExistente.setRutaImagen(arbol.getRutaImagen());
            arbolExistente.setNombreComun(arbol.getNombreComun());
            arbolExistente.setTipoFlor(arbol.getTipoFlor());
            arbolExistente.setDureza(arbol.getDureza());
            arbolExistente.setDescripcion(arbol.getDescripcion());

            servicio.guardarArbol(arbolExistente);
        }

        return "redirect:/Arbol";
    }

    @GetMapping("arbol/eliminar/{id}")
    public String eliminarArbol(@PathVariable("id") Long id) {
        servicio.eliminarArbol(id);
        return "redirect:/Arbol";
    }

}
