package br.com.gabrielwinter.lojinha.services.impl;

import br.com.gabrielwinter.lojinha.services.MediaService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MediaCompostaServiceImplTest {

    @Test
    public void mediaComposta(){

        MediaService mediaService = new MediaCompostaServiceImpl();
        assertEquals(16.548754598234364, mediaService.execute(List.of(10.0,20.0,15.0,25.0)),0.001);

    }
    @Test
    public void mediaCompostaListaVazia(){
        MediaService mediaService = new MediaCompostaServiceImpl();
        assertEquals(0.0, mediaService.execute(List.of()));

    }

}