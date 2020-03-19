package com.alxdroiddev.javaswaggerdemo.dao;

import com.alxdroiddev.javaswaggerdemo.constants.StatusConstants;
import com.alxdroiddev.javaswaggerdemo.entities.OperationItem;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@SuppressWarnings("unused")
public class OperationDao {

    private DynamoDBMapper mapper;


    public OperationDao(AmazonDynamoDB dynamoDBClient) {

        //mapper = new DynamoDBMapper(dynamoDBClient);
    }


    public OperationItem newItem(String idRegistro) {

        OperationItem op = new OperationItem();
        op.setOperationId(UUID.randomUUID().toString().replace("-", ""));
        op.setIdRegistro(idRegistro);
        op.setOperationStatus(StatusConstants.STATUS_RECEIVED);
        op.setRekognitionJobFinished(false);
        op.setTranscribeJobFinished(false);

        String formattedDate = (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")).format(new Date());
        op.setOperationStartTime(formattedDate);

        op.setOperationStartTimeMillis(System.currentTimeMillis());
        return save(op);
    }

    public OperationItem save(OperationItem operationItem) {
       // mapper.save(operationItem);
        return operationItem;
    }

    public OperationItem getByOperationId(String operationId) {

        OperationItem item = new OperationItem();
        item.setOperationId(operationId);
        item.setIdRegistro(Long.toHexString(System.currentTimeMillis()));
        return item;
//        return mapper.load(OperationItem.class, operationId);
    }


}
