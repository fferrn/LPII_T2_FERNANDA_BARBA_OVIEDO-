package com.cibertec.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cibertec.app.service.DetalleFacturaService;

@Controller
public class FacturaController {

    @Autowired
    private DetalleFacturaService detalleService;

    @GetMapping("/factura")
    public String listarFacturas(Model model) {
        model.addAttribute("detalles", detalleService.listarTodos());
        return "consultaBarba";  // consultaApellido.html
    }
}
