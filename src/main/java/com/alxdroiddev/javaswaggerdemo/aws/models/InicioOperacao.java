package com.alxdroiddev.javaswaggerdemo.aws.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class InicioOperacao {

    public String idRegistro;

    public String textoGerado;

    public String s3VideoUrlSa;

    public String s3ImageUrlSa;

}
