package com.bancoagricultura.bancobackend.dto;

import com.bancoagricultura.bancobackend.entity.Cliente;
import java.math.BigDecimal;
import java.time.LocalDate;

public class ClienteDTO {
    private Integer id;
    private String nombre;
    private String apellidos;
    private String dui;
    private String genero;
    private BigDecimal salario;
    private String correo;
    private String estadoCivil; // Cambiado a CamelCase para buenas prácticas
    private String usuario;
    private LocalDate fechaNacimiento;

    public ClienteDTO(Cliente cliente) {
        this.id = cliente.getId();
        this.nombre = cliente.getNombre();
        this.apellidos = cliente.getApellidos();
        this.dui = cliente.getDui();
        this.genero = cliente.getGenero();
        this.salario = cliente.getSalario();
        this.correo = cliente.getCorreo();
        this.estadoCivil = cliente.getEstadoCivil();
        this.usuario = cliente.getUsuario();
        this.fechaNacimiento = cliente.getFechaNacimiento();
    }

    // --- Getters y Setters ---
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public String getDui() { return dui; }
    public void setDui(String dui) { this.dui = dui; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public BigDecimal getSalario() { return salario; }
    public void setSalario(BigDecimal salario) { this.salario = salario; }
    public String getCorreo() { return correo;}

    public void setCorreo(String correo) {this.correo = correo;}
    public String getEstadoCivil() { return estadoCivil;}
    public void setEstadoCivil(String estadoCivil) {this.estadoCivil = estadoCivil;}
    public String getUsuario() { return usuario;}
    public void setUsuario(String usuario) {this.usuario = usuario;}
    public LocalDate getFechaNacimiento() {return fechaNacimiento;}
    public void setFechaNacimiento(LocalDate fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}

}