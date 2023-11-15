package com.example.demo.exception;

import java.time.ZonedDateTime;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class ApiExceptionHandler {
  //  private static final Logger LOGGER = LoggerFactory.getLogger(ApiExceptionHandler.class);

  @ExceptionHandler(value = ApiRequestException.class)
  public ResponseEntity<Object> handleApiRequestException(ApiRequestException e) {
    ApiException apiException =
        new ApiException(e.getMessage(), e, HttpStatus.BAD_REQUEST, ZonedDateTime.now());
    return new ResponseEntity<>(apiException, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(value = NotFoundEexception.class)
  public ResponseEntity<Object> handleApiRequestException(NotFoundEexception e) {
    ApiException apiException =
        new ApiException(e.getMessage(), e, HttpStatus.NOT_FOUND, ZonedDateTime.now());
    return new ResponseEntity<>(apiException, HttpStatus.NOT_FOUND);
  }
}
