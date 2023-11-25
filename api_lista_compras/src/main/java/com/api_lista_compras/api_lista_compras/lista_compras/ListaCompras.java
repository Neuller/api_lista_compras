package com.api_lista_compras.api_lista_compras.lista_compras;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "lista_compras")
@Entity(name = "lista_compras")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ListaCompras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Boolean status;

    public ListaCompras(ListaComprastDTO data){
        this.descricao = data.descricao();
        this.status = data.status();
    }
}
