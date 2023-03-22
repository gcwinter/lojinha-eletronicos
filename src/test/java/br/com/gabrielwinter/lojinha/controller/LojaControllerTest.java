package br.com.gabrielwinter.lojinha.controller;

import br.com.gabrielwinter.lojinha.controller.converter.ProdutoParaProdutoDTOConverter;
import br.com.gabrielwinter.lojinha.model.Produto;
import br.com.gabrielwinter.lojinha.services.ExibirProdutoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LojaControllerTest {
    @InjectMocks
    private LojaController lojaController;

    @Mock
    private ExibirProdutoService exibirProdutoService;
    @Spy
    private ProdutoParaProdutoDTOConverter produtoParaProdutoDTOConverter = new ProdutoParaProdutoDTOConverter();

    @Test
    void testeDeveExibirUmProduto() {
        final var produto = new Produto();
        produto.setPreco(new BigDecimal(1700));
        produto.setDesconto(0.88235);
        produto.setNome("celular");
        produto.setDescricao("celular iphone 14");
        produto.setQuantidade(80);

        when(exibirProdutoService.execute(anyString())).thenReturn(produto);

        final var produtoDTO = lojaController.exibir("123");
        assertAll("Produto DTO",
                () -> assertEquals("123", produtoDTO.getId()),
                () -> assertEquals("celular", produtoDTO.getNome()),
                () -> assertEquals("celular iphone 14", produtoDTO.getDescricao()),
                () -> assertEquals(new BigDecimal(1500.00).setScale(2, RoundingMode.CEILING), produtoDTO.getPrecoComDesconto().setScale(2, RoundingMode.CEILING)),
                () -> assertEquals(new BigDecimal(1700.00).setScale(2, RoundingMode.CEILING), produtoDTO.getPrecoSemDesconto().setScale(2, RoundingMode.CEILING)),
                () -> assertEquals(80, produtoDTO.getQuantidade())
        );

    }

}