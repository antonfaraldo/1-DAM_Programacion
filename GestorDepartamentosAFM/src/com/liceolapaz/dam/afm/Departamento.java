package com.liceolapaz.dam.afm;

public class Departamento {
    private int idDepartamento;
    private String nombre;
    private String nombreCorto;
    private int planta;
    private String cifDirector;
    private String correo;

    public Departamento(int idDepartamento, String nombre, String nombreCorto, int planta, String cifDirector, String correo) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.nombreCorto = nombreCorto;
        this.planta = planta;
        this.cifDirector = cifDirector;
        this.correo = correo;
    }
    public String toPrint() {
        return idDepartamento + ";" + nombre + ";" + nombreCorto + ";" + planta + ";" + cifDirector + ";" + correo;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public String getCifDirector() {
        return cifDirector;
    }

    public void setCifDirector(String cifDirector) {
        this.cifDirector = cifDirector;
    }

    public String getCorreoElectronico() {
        return correo;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correo = correoElectronico;
    }
}

