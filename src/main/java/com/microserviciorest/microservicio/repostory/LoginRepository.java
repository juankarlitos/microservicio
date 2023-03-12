package com.microserviciorest.microservicio.repostory;
import com.microserviciorest.microservicio.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Integer> {
}
