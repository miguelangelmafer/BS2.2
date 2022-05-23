package com.BS12.listaCiudades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class Controlador2 {

    @Autowired
    ArrayList<Ciudades> ciudades;


    @GetMapping("/controlador2/getCiudad")

    public List <Ciudades> listaCiudades(){
        return ciudades;

    }

}
