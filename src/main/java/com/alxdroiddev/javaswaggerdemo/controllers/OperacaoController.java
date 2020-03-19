package com.alxdroiddev.javaswaggerdemo.controllers;

import com.alxdroiddev.javaswaggerdemo.entities.ResponseOperacao;
import com.alxdroiddev.javaswaggerdemo.service.OperacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
public class OperacaoController implements OperacaoApi {

    @Autowired
    private OperacaoService operacaoService;

    @Override
    public ResponseEntity<ResponseOperacao> getOperacao(@NotNull @Valid String operationId) {
        return ResponseEntity.ok(operacaoService.getStatusOperacao(operationId));
    }

}
