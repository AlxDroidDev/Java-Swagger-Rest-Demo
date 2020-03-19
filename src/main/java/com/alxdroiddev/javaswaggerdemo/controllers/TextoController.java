package com.alxdroiddev.javaswaggerdemo.controllers;

import com.alxdroiddev.javaswaggerdemo.entities.ResponseTexto;
import com.alxdroiddev.javaswaggerdemo.service.TextoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
public class TextoController implements TextoApi {

    @Autowired
    private TextoService textoService;

    @Override
    public ResponseEntity<ResponseTexto> getTexto(@NotNull @Valid String userName) {
        return ResponseEntity.ok(textoService.getTexto(userName));
    }

}
