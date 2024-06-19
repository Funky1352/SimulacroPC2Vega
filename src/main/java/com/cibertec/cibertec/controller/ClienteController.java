package com.cibertec.cibertec.controller;

import com.cibertec.cibertec.entity.Cliente;
import com.cibertec.cibertec.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/url/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/listaTodos")
    public List<Cliente> getAllClientes() {
        return clienteService.listaCliente();
    }

    @GetMapping("/buscarPorNombre")
    public List<Cliente> getClienteByNombre(@RequestParam("nombres") String nombres) {
        return clienteService.listaClientePorNombre(nombres + "%");
    }

    @GetMapping("/buscarPorDni/{dni}")
    public List<Cliente> getClienteByDni(@PathVariable("dni") String dni){
        return clienteService.listaClientePorDni(dni);
    }

}