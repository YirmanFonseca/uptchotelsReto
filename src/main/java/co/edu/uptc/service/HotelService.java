package co.edu.uptc.service;


import java.util.List;

import co.edu.uptc.model.Hotels;

public interface HotelService {
    boolean registrarHotel(Hotels hotel);
    boolean editarHotel(String nombre, String ciudad, Hotels hotelEditado);
    Hotels buscarHotel(String nombre, String ciudad);
    List<Hotels> buscarHotelesPorNombreCiudad(String nombre, String ciudad);
    boolean cambiarEstadoHotel(String nombre, String ciudad);
    List<Hotels> obtenerTodos();



}


