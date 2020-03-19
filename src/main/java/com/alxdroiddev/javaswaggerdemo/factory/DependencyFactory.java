package com.alxdroiddev.javaswaggerdemo.factory;

import com.alxdroiddev.javaswaggerdemo.dao.OperationDao;
import com.alxdroiddev.javaswaggerdemo.service.ConteudoService;
import com.alxdroiddev.javaswaggerdemo.service.OperacaoService;
import com.alxdroiddev.javaswaggerdemo.service.TextoService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DependencyFactory {

    @Bean
    public OperacaoService buildOperacaoService() {
        return new OperacaoService();
    }

    @Bean
    public TextoService buildTextoService() {
        return new TextoService();
    }

    @Bean
    public ConteudoService buildConteudoService() { return new ConteudoService(); }

    @Bean
    public OperationDao buildOperationDao() {return  new OperationDao(null); }
    // ^^^^  Aqui deveria receber uma instância de cliente do DynamoDB

}
