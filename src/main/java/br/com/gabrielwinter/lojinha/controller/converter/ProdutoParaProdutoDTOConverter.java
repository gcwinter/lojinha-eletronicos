package br.com.gabrielwinter.lojinha.controller.converter;

import br.com.gabrielwinter.lojinha.controller.resurces.ProdutoDTO;
import br.com.gabrielwinter.lojinha.model.Produto;

import java.math.BigDecimal;

public class ProdutoParaProdutoDTOConverter {

    public ProdutoDTO converte(Produto produto,String id){

        final var produtoDTO = new ProdutoDTO();

        produtoDTO.setId(id);
        produtoDTO.setNome(produto.getNome());
        produtoDTO.setDescricao(produto.getDescricao());
        produtoDTO.setPrecoSemDesconto(produto.getPreco());
        produtoDTO.setQuantidade(produto.getQuantidade());
        produtoDTO.setPrecoComDesconto(produto.getPreco()
                .multiply(new BigDecimal(produto.getDesconto())));


        return produtoDTO;

    }
}
