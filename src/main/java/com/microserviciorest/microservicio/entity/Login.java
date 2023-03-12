package com.microserviciorest.microservicio.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

@Entity
@Table(name="datos")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Integer Id;
    @NonNull
    private String username;
    @JsonIgnore
    private String pass;
    @NonNull
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
}