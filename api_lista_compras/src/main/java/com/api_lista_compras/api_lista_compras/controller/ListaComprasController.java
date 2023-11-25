package com.api_lista_compras.api_lista_compras.controller;

import com.api_lista_compras.api_lista_compras.lista_compras.ListaCompras;
import com.api_lista_compras.api_lista_compras.lista_compras.ListaComprasRepository;
import com.api_lista_compras.api_lista_compras.lista_compras.ListaComprastDTO;
import com.api_lista_compras.api_lista_compras.lista_compras.ListaComprastResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lista_compras")
public class ListaComprasController {
    @Autowired
    private ListaComprasRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void postListaCompras(@RequestBody ListaComprastDTO data){
        ListaCompras listaCompras = new ListaCompras(data);
        repository.save(listaCompras);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ListaComprastResponseDTO> getListaCompras(){
        List<ListaComprastResponseDTO> listaCompras = repository.findAll().stream().map(ListaComprastResponseDTO::new).toList();
        return listaCompras;
    }
}
