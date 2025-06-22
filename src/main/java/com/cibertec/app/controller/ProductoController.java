package com.cibertec.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cibertec.app.entity.Producto;
import com.cibertec.app.service.ProductoService;

@Controller
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/producto/edit/{id}")
    public String editarProducto(@PathVariable Long id, Model model) {
        Producto producto = productoService.obtenerPorId(id);
        model.addAttribute("producto", producto);
        return "mantenimientoBarba";
    }

    @PostMapping("/producto/{id}")
    public String actualizarProducto(
        @PathVariable Long id,
        @ModelAttribute Producto producto,
        RedirectAttributes redirect) {

        try {
            Producto existente = productoService.obtenerPorId(id);
            existente.setNomProd(producto.getNomProd());
            existente.setPrecio(producto.getPrecio());
            existente.setStockActual(producto.getStockActual());
            productoService.guardar(existente);
            redirect.addFlashAttribute("success", "Producto actualizado correctamente.");
        } catch (Exception e) {
            redirect.addFlashAttribute("error", "Error al actualizar el producto.");
        }

        return "redirect:/factura";
    }
}
