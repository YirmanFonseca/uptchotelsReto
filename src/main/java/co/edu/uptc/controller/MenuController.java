package co.edu.uptc.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import co.edu.uptc.model.Hotels;
import co.edu.uptc.service.HotelService;
@Controller
public class MenuController {
       @GetMapping("/")
    public String mostrarMenu() {
        return "index";
    }

    @GetMapping("/registrar")
    public String mostrarFormularioRegistro() {
        return "registrar";
    }

    @GetMapping("/buscar")
    public String mostrarFormularioBusqueda() {
        return "buscar";
    }

    @GetMapping("/listar")
    public String mostrarHoteles() {
        return "listar";
    }

    @GetMapping("/editar")
    public String mostrarFormularioEdicion() {
        return "editar";
    }
       @Autowired
    private HotelService hotelService;

    @GetMapping("/listar")
    public String listarHoteles(Hotels hotel) {
        List<Hotels> lista = hotelService.obtenerTodos();
        hotel.addAttribute("listaHoteles", lista);
        return "listarHoteles"; // Se resuelve a WEB-INF/views/listarHoteles.jsp
    }
}
