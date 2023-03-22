package br.com.gabrielwinter.lojinha.controller.resurces;

import lombok.Data;

import java.math.BigDecimal;

@Data

public class ProdutoDTO {
    private String id;
    private String nome;
    private String descricao;
    private BigDecimal precoComDesconto;
    private BigDecimal precoSemDesconto;
    private Integer quantidade;
}

