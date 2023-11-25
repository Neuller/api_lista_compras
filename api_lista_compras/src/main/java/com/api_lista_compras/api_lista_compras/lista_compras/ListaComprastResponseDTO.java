package com.api_lista_compras.api_lista_compras.lista_compras;

public record ListaComprastResponseDTO(Long id, String descricao, Boolean status) {
    public ListaComprastResponseDTO(ListaCompras listaCompras){
        this(listaCompras.getId(), listaCompras.getDescricao(), listaCompras.getStatus());
    }
}
