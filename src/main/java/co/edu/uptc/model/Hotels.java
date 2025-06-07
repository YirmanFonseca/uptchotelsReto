package co.edu.uptc.model;

import java.util.List;

public class Hotels {

      private String nombre;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String email;
    private int capacidad;
    private boolean activo;

    // Constructor vacío
    public Hotels() {}

    // Constructor completo
    public Hotels(String nombre, String ciudad, String direccion, String telefono, String email, int capacidad, boolean activo) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.capacidad = capacidad;
        this.activo = activo;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }

    public void addAttribute(String string, List<Hotels> lista) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAttribute'");
    }
}
