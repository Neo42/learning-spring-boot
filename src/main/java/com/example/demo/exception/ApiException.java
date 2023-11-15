package com.example.demo.exception;

import java.time.ZonedDateTime;
import org.springframework.http.HttpStatus;

// private final, getter, setter, public constructor, equals, hashcode,
// toString
public record ApiException(
    String message, Throwable throwable, HttpStatus httpStatus, ZonedDateTime zonedDateTime) {}

  //  @Override
  //  public String toString() {
  //    return "ApiException{"
  //        + "message='"
  //        + message
  //        + '\''
  //        + ", throwable="
  //        + throwable
  //        + ", httpStatus="
  //        + httpStatus
  //        + ", zonedDateTime="
  //        + zonedDateTime
  //        + '}';
  //  }

  //  public String getMessage() {
  //    return message;
  //  }
  //
  //  public Throwable getThrowable() {
  //    return throwable;
  //  }
  //
  //  public HttpStatus getHttpStatus() {
  //    return httpStatus;
  //  }
  //
  //  public ZonedDateTime getZonedDateTime() {
  //    return zonedDateTime;
  //  }

  //  public ApiException(
  //      String message, Throwable throwable, HttpStatus httpStatus, ZonedDateTime zonedDateTime) {
  //    this.message = message;
  //    this.throwable = throwable;
  //    this.httpStatus = httpStatus;
  //    this.zonedDateTime = zonedDateTime;
  //  }
