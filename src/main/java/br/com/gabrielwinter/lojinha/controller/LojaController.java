package br.com.gabrielwinter.lojinha.controller;

import br.com.gabrielwinter.lojinha.controller.converter.ProdutoParaProdutoDTOConverter;
import br.com.gabrielwinter.lojinha.controller.resurces.ProdutoDTO;
import br.com.gabrielwinter.lojinha.services.ExibirProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;

@Controller
@AllArgsConstructor
public class LojaController {

    private final ExibirProdutoService exibirProdutoService;
    private final ProdutoParaProdutoDTOConverter produtoParaProdutoDTOConverter;

    public ProdutoDTO exibir(String id) {
        final var produto = exibirProdutoService.execute(id);
        return produtoParaProdutoDTOConverter.converte(produto, id);

    }

    public void cadastrar() {

    }

    public void excluir() {

    }

    public void atualizar() {

    }
}
