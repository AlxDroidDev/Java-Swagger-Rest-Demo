package com.alxdroiddev.javaswaggerdemo.controllers;


import com.alxdroiddev.javaswaggerdemo.service.ConteudoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

@RestController
public class ConteudoController implements ConteudoApi {

    @Autowired
    private ConteudoService conteudoService;

    // https://medium.com/oril/uploading-files-to-aws-s3-bucket-using-spring-boot-483fcb6f8646

    @Override
    public ResponseEntity<String> uploadFiles(String userName, String userId, @RequestParam(value="generatedText", required=true)  String generatedText, @Valid @RequestPart("imageFile") MultipartFile imageFile, @Valid @RequestPart("videoFile") MultipartFile videoFile) {
        return ResponseEntity.ok(conteudoService.salvarConteudo(userName, userId, generatedText, imageFile, videoFile));
    }


}
