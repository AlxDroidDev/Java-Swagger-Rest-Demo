package com.alxdroiddev.javaswaggerdemo.aws.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Operation {

    public String operationId;

    public String idRegistro;

    public String operationStatus;

    public String operationStartTime;

    public long   operationStartTimeMillis;

    public String textCreated;

    public String videoFileName;

    public String videoFileS3Url;

    public String imageFileName;

    public String originalVideoFileS3Url;

    public String originalImageFileS3Url;

    public String imageFileS3Url;

    public int rekognitionFacesFound;

    public String rekognitionBestFaceId;

    public double rekognitionBestFaceSimilarity;

    public String transcribeTextFound;

    public double transcribeTextSimilarity;

    public String transcribeJobId;

    public String rekognitionJobId;

    public double transcribeJobDuration;

    public double rekognitionJobDuration;

    public boolean transcribeJobFinished;

    public boolean rekognitionJobFinished;

}
