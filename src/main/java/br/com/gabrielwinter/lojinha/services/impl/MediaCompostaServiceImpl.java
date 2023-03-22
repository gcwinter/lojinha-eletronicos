package br.com.gabrielwinter.lojinha.services.impl;

import br.com.gabrielwinter.lojinha.services.MediaService;

import java.util.List;

public class MediaCompostaServiceImpl implements MediaService {
    @Override
    public Double execute(List<Double> list) {

        if (list.isEmpty()) {
            return 0.0;
        }
        Double multiplicacaoDeElementos = list.stream()
                .reduce(1.0, (subtotal, element) -> subtotal * element);

        return Math.pow(multiplicacaoDeElementos, (1.0 / list.size()));
    }
}
