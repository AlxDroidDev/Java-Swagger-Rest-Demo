package com.alxdroiddev.javaswaggerdemo.service;

import com.alxdroiddev.javaswaggerdemo.aws.models.InicioOperacao;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.UUID;

public class ConteudoService {

    private Gson gson = (new GsonBuilder()).create();

    public ConteudoService() {
        /* empty */
    }

    public String salvarConteudo(String userName, String userId, String generatedText, @Valid MultipartFile imageFile, @Valid MultipartFile videoFile) {

        final String imageFileName = UUID.randomUUID().toString().replace("-", "") + ".jpg";
        final String videoFileName = UUID.randomUUID().toString().replace("-", "") + ".mp4";

        System.out.println("imageFileName: " + imageFileName);
        System.out.println("videoFileName: " + videoFileName);

        InicioOperacao inicioOp = new InicioOperacao();
        inicioOp.idRegistro = userId + UUID.randomUUID().toString().replace("-", "");
        inicioOp.s3ImageUrlSa = imageFileName + ".jpg";
        inicioOp.s3VideoUrlSa = videoFileName +".mp4";
        inicioOp.textoGerado = generatedText;

        return inicioOp.idRegistro;
    }



}
