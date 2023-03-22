package br.com.gabrielwinter.lojinha.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private LocalDateTime cadastro;
    private Double desconto;
    private Integer quantidade;
}
