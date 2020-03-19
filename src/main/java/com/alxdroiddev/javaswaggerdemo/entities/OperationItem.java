package com.alxdroiddev.javaswaggerdemo.entities;

import com.alxdroiddev.javaswaggerdemo.aws.models.Operation;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@SuppressWarnings("unused")
@DynamoDBTable(tableName="ABERTURADECONTA-DEV-TABELA-RESULTADOS")
public class OperationItem extends Operation {

    @DynamoDBHashKey(attributeName="operationId")
    public String getOperationId() { return operationId; }
    public void setOperationId(String operationId) { this.operationId = operationId; }

    @DynamoDBAttribute(attributeName = "idRegistro")
    public String getIdRegistro() { return idRegistro; }
    public void setIdRegistro(String idRegistro) { this.idRegistro = idRegistro; }

    @DynamoDBAttribute(attributeName ="operationStatus")
    public String getOperationStatus() {  return operationStatus; }
    public void setOperationStatus(String opStatus) { this.operationStatus = opStatus; }

    @DynamoDBAttribute(attributeName ="operationStartTime")
    public String getOperationStartTime() {return operationStartTime; }
    public void setOperationStartTime(String operationStartTime) { this.operationStartTime = operationStartTime; }

    @DynamoDBAttribute(attributeName ="operationStartTimeMillis")
    public long getOperationStartTimeMillis() { return operationStartTimeMillis; }
    public void setOperationStartTimeMillis(long operationStartTimeMillis) { this.operationStartTimeMillis = operationStartTimeMillis; }

    @DynamoDBAttribute(attributeName ="textCreated")
    public String getTextCreated() { return textCreated; }
    public void setTextCreated(String textCreated) { this.textCreated = textCreated;}

    @DynamoDBAttribute(attributeName ="videoFileName")
    public String getVideoFileName() { return videoFileName; }
    public void setVideoFileName(String videoFileName) { this.videoFileName = videoFileName; }

    @DynamoDBAttribute(attributeName ="videoFileS3Url")
    public String getVideoFileS3Url() { return videoFileS3Url; }
    public void setVideoFileS3Url(String videoFileS3Url) { this.videoFileS3Url = videoFileS3Url; }

    @DynamoDBAttribute(attributeName ="imageFileName")
    public String getImageFileName() { return imageFileName; }
    public void setImageFileName(String imageFileName) { this.imageFileName = imageFileName; }

    @DynamoDBAttribute(attributeName ="imageFileS3Url")
    public String getImageFileS3Url() { return imageFileS3Url; }
    public void setImageFileS3Url(String imageFileS3Url) { this.imageFileS3Url = imageFileS3Url; }

    @DynamoDBAttribute(attributeName ="originalVideoFileS3Url")
    public String getOriginalVideoFileS3Url() { return originalVideoFileS3Url; }
    public void setOriginalVideoFileS3Url(String originalVideoFileS3Url) { this.originalVideoFileS3Url = originalVideoFileS3Url; }

    @DynamoDBAttribute(attributeName ="originalImageFileS3Url")
    public String getOriginalImageFileS3Url() { return originalImageFileS3Url; }
    public void setOriginalImageFileS3Url(String originalImageFileS3Url) { this.originalImageFileS3Url = originalImageFileS3Url; }

    @DynamoDBAttribute(attributeName ="rekognitionFacesFound")
    public int getRekognitionFacesFound() { return rekognitionFacesFound; }
    public void setRekognitionFacesFound(int rekognitionFacesFound) { this.rekognitionFacesFound = rekognitionFacesFound; }

    @DynamoDBAttribute(attributeName ="rekognitionBestFaceId")
    public String getRekognitionBestFaceId() { return rekognitionBestFaceId; }
    public void setRekognitionBestFaceId(String rekognitionBestFaceId) { this.rekognitionBestFaceId = rekognitionBestFaceId; }

    @DynamoDBAttribute(attributeName ="rekognitionBestFaceSimilarity")
    public double getRekognitionBestFaceSimilarity() { return rekognitionBestFaceSimilarity; }
    public void setRekognitionBestFaceSimilarity(double rekognitionBestFaceSimilarity) { this.rekognitionBestFaceSimilarity = rekognitionBestFaceSimilarity; }

    @DynamoDBAttribute(attributeName ="transcribeTextFound")
    public String getTranscribeTextFound() { return transcribeTextFound;}
    public void setTranscribeTextFound(String transcribeTextFound) { this.transcribeTextFound = transcribeTextFound; }

    @DynamoDBAttribute(attributeName ="transcribeTextSimilarity")
    public double getTranscribeTextSimilarity() { return transcribeTextSimilarity; }
    public void setTranscribeTextSimilarity(double transcribeTextSimilarity) { this.transcribeTextSimilarity = transcribeTextSimilarity; }

    @DynamoDBAttribute(attributeName ="transcribeJobId")
    public String getTranscribeJobId() {return transcribeJobId; }
    public void setTranscribeJobId(String transcribeJobId) { this.transcribeJobId = transcribeJobId; }

    @DynamoDBAttribute(attributeName ="rekognitionJobId")
    public String getRekognitionJobId() { return rekognitionJobId; }
    public void setRekognitionJobId(String rekognitionJobId) { this.rekognitionJobId = rekognitionJobId; }

    @DynamoDBAttribute(attributeName ="transcribeJobDuration")
    public double getTranscribeJobDuration() { return transcribeJobDuration; }
    public void setTranscribeJobDuration(double transcribeJobDuration) { this.transcribeJobDuration = transcribeJobDuration; }

    @DynamoDBAttribute(attributeName ="rekognitionJobDuration")
    public double getRekognitionJobDuration() { return rekognitionJobDuration; }
    public void setRekognitionJobDuration(double rekognitionJobDuration) { this.rekognitionJobDuration = rekognitionJobDuration; }

    @DynamoDBAttribute(attributeName ="transcribeJobFinished")
    public boolean isTranscribeJobFinished() { return transcribeJobFinished;}
    public void setTranscribeJobFinished(boolean transcribeJobFinished) { this.transcribeJobFinished = transcribeJobFinished; }

    @DynamoDBAttribute(attributeName ="rekognitionJobFinished")
    public boolean isRekognitionJobFinished() { return rekognitionJobFinished; }
    public void setRekognitionJobFinished(boolean rekognitionJobFinished) { this.rekognitionJobFinished = rekognitionJobFinished; }


}
