package com.BS12.listaCiudades;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ListaCiudadesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaCiudadesApplication.class, args);
	}

	@Bean
	public ArrayList<Ciudades> listaCiudades(){
		return new ArrayList<Ciudades>();
	}

}
