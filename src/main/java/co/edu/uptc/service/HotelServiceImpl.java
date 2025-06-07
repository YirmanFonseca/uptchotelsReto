package co.edu.uptc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.uptc.model.Hotels;

@Service
public class HotelServiceImpl  implements HotelService {
 private final List<Hotels> hoteles = new ArrayList<>();
 private List<Hotels> listaHoteles;

    @Override
    public boolean registrarHotel(Hotels hotel) {
        if (buscarHotel(hotel.getNombre(), hotel.getCiudad()) != null) {
            return false; // Ya existe un hotel con ese nombre en esa ciudad
        }
        hoteles.add(hotel);
        return true;
    }

    @Override
    public boolean editarHotel(String nombre, String ciudad, Hotels hotelEditado) {
        Hotels existente = buscarHotel(nombre, ciudad);
        if (existente != null) {
            existente.setDireccion(hotelEditado.getDireccion());
            existente.setTelefono(hotelEditado.getTelefono());
            existente.setEmail(hotelEditado.getEmail());
            existente.setCapacidad(hotelEditado.getCapacidad());
            existente.setActivo(hotelEditado.isActivo());
            return true;
        }
        return false;
    }

    @Override
    public Hotels buscarHotel(String nombre, String ciudad) {
        return hoteles.stream()
                .filter(h -> h.getNombre().equalsIgnoreCase(nombre) && h.getCiudad().equalsIgnoreCase(ciudad))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Hotels> buscarHotelesPorNombreCiudad(String nombre, String ciudad) {
        return hoteles.stream()
                .filter(h -> (nombre == null || h.getNombre().equalsIgnoreCase(nombre)) &&
                             (ciudad == null || h.getCiudad().equalsIgnoreCase(ciudad)))
                .toList();
    }

    @Override
    public boolean cambiarEstadoHotel(String nombre, String ciudad) {
        Hotels hotel = buscarHotel(nombre, ciudad);
        if (hotel != null) {
            hotel.setActivo(!hotel.isActivo());
            return true;
        }
        return false;
    }

    @Override
    public List<Hotels> obtenerTodos() {
        return this.listaHoteles;
    }

}
