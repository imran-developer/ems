package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

@Data

public class GenericServiceResponse {

    @JsonProperty("status")
    private int status;

    @JsonProperty("timestamp")
    private LocalDateTime timestamp;

    @JsonProperty("message")
    private String message;

    @JsonProperty("errorMessage")
    private String errorMessage;

    @JsonProperty("data")
    private Object data;

    @JsonIgnore
    private Object tempData;

    @JsonProperty("redirectUrl")
    private String redirectUrl;


    @JsonProperty("httpStatus")
    private HttpStatus httpStatus;

    @JsonIgnore
    private Object tempObject;

    @JsonProperty("totalPages")
    private int totalPages;

    @JsonProperty("totalElements")
    private long totalElements;

    public GenericServiceResponse() {
        this.timestamp = LocalDateTime.now();
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.status = httpStatus.value();
        this.httpStatus = httpStatus;

    }

}













