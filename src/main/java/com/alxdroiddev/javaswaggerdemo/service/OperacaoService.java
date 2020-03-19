package com.alxdroiddev.javaswaggerdemo.service;

import com.alxdroiddev.javaswaggerdemo.dao.OperationDao;
import com.alxdroiddev.javaswaggerdemo.entities.OperationItem;
import com.alxdroiddev.javaswaggerdemo.entities.ResponseOperacao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.beans.FeatureDescriptor;
import java.util.stream.Stream;

public class OperacaoService {

    @Autowired
    private OperationDao operationDao;

    public OperacaoService() {
        /* empty */
    }

    public ResponseOperacao getStatusOperacao(String operationId) {
        final OperationItem operationItem = operationDao.getByOperationId(operationId);
        ResponseOperacao responseOperacao = new ResponseOperacao();
        if (operationItem != null) {
            String[] nullPropertyNames = getNullPropertyNames(operationItem);
            BeanUtils.copyProperties(operationItem, responseOperacao, nullPropertyNames);
        } else {
            responseOperacao.setOperationId(operationId);
            responseOperacao.setOperationStatus("Não encontrado");
            responseOperacao.setRekognitionJobFinished(false);
            responseOperacao.setTranscribeJobFinished(false);
        }
        return responseOperacao;
    }

    private static String[] getNullPropertyNames(Object source) {
        final BeanWrapper wrappedSource = new BeanWrapperImpl(source);
        return Stream.of(wrappedSource.getPropertyDescriptors())
                .map(FeatureDescriptor::getName)
                .filter(propertyName -> wrappedSource.getPropertyValue(propertyName) == null)
                .toArray(String[]::new);
    }

}
