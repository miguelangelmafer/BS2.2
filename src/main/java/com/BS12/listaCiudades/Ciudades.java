package com.BS12.listaCiudades;

import org.springframework.stereotype.Service;

@Service

public class Ciudades {

    private String nombre;
    private Integer numeroHabitantes;


    public Ciudades(String nombre, Integer numeroHabitantes ){
        this.nombre=nombre;
        this.numeroHabitantes =numeroHabitantes;
    }

    public Ciudades(){
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroHabitantes(Integer numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

}
