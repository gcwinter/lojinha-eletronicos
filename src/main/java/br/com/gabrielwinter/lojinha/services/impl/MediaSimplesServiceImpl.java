package br.com.gabrielwinter.lojinha.services.impl;

import br.com.gabrielwinter.lojinha.services.MediaService;

import java.util.List;

public class MediaSimplesServiceImpl implements MediaService {

    @Override
    public Double execute(List<Double> list) {
        if (list.isEmpty()) {
            return 0.0;
        }

        return (list.stream().mapToDouble(Double::doubleValue).sum()) / list.size();

    }
}
