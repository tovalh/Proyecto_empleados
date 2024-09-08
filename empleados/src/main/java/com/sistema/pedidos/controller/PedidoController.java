package com.sistema.pedidos.controller;

import com.sistema.pedidos.entity.Pedido;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @GetMapping("/{id}")
    public String obtenerPedido(@RequestParam int id) {
        return "Pedidos";
    }

    @PostMapping("/crear")
    public String crearPedido(@RequestBody Pedido pedido) {
        return "Pedidos";
    }

    @PutMapping("/editar/{id}")
    public String editarPedido(@RequestParam int id) {
        return "Pedidos";
    }

    @GetMapping("/borrar/{id}")
    public String borrarPedido(@RequestParam int id) {
        return "Pedidos";
    }

}
