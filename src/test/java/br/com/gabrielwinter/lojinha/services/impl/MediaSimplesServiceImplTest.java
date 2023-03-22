package br.com.gabrielwinter.lojinha.services.impl;

import br.com.gabrielwinter.lojinha.services.MediaService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MediaSimplesServiceImplTest {
    @Test
    public void mediaSimples(){

        MediaService mediaService = new MediaSimplesServiceImpl();
        assertEquals(17.5, mediaService.execute(List.of(10.0,20.0,15.0,25.0)));
        assertEquals(5.0, mediaService.execute(List.of(5.0,5.0,5.0,5.0,5.0,5.0)));
        assertEquals(0.0, mediaService.execute(List.of(0.0,0.0,0.0,0.0,0.0)));
    }
    @Test
    public void mediaSimplesListaVazia(){
        MediaService mediaService = new MediaSimplesServiceImpl();
        assertEquals(0.0, mediaService.execute(List.of()));

    }

}