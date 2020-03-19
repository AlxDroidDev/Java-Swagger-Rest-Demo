package com.alxdroiddev.javaswaggerdemo.service;

import com.alxdroiddev.javaswaggerdemo.entities.ResponseTexto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TextoService {

    public TextoService() {
        /* empt */
    }

    public ResponseTexto getTexto(String userName) {
        Locale ptbr = new Locale("pt", "br");
        DateFormat dateFormat = new SimpleDateFormat("dd 'de' MMMMM", ptbr);
        Date hoje = new Date();
//        System.out.println(dateFormat.format(hoje)); //2016/11/16 12:08:43
        return new ResponseTexto().texto(
                String.format("Meu nome é %s e hoje é dia %s",
                    userName, dateFormat.format(hoje))).tempo(15);
    }

}
