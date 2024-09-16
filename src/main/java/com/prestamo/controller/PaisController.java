package com.prestamo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.prestamo.entity.Pais;
import com.prestamo.services.PaisServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/url/pais")
public class PaisController {
	
	private final PaisServices paisServices;
	
	@Autowired
	public PaisController(PaisServices paisServices) {
		this.paisServices=paisServices;
	}
	@GetMapping("/lista")
	public List<Pais>  getAllPaises() {
		return paisServices.findAll();
	}
	
	

}
