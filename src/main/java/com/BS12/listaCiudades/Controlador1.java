package com.BS12.listaCiudades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController


public class Controlador1 {


    @Autowired
    ArrayList<Ciudades> listaCiudades;

    @PostMapping("/controlador1/addCiudad")

    public ArrayList<Ciudades> addCiudades(@RequestBody Ciudades ciudad){
        listaCiudades.add(ciudad);
        return listaCiudades;
    }

}
