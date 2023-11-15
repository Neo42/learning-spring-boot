package com.example.demo.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
  @Id private Long id;

  @NotBlank(message = "name must not be empty")
  private String name;

  // string

  @NotBlank(message = "password must not be empty")
  // empty string
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private String password;

  @NotBlank(message = "email must not be empty")
  @Email
  private String email;

  //  Customer(Long id, String name, String password, String email) {
  //    this.id = id;
  //    this.name = name;
  //    this.password = password;
  //    this.email = email;
  //  }

  //  public Customer() {}

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  //  @Override
  //  public String toString() {
  //    return "Customer{"
  //        + "id="
  //        + id
  //        + ", name='"
  //        + name
  //        + '\''
  //        + ", password='"
  //        + password
  //        + '\''
  //        + ", email='"
  //        + email
  //        + '\''
  //        + '}';
  //  }

  @JsonProperty("customer_id")
  public Long getId() {
    return id;
  }

  @JsonIgnore
  public String getPassword() {
    return password;
  }
}
