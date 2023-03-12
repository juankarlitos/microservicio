package com.microserviciorest.microservicio.controller;
import com.microserviciorest.microservicio.entity.Login;
import com.microserviciorest.microservicio.service.LoginService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }
    @PostMapping
    public Login createLogin(@RequestBody Login login){
        return loginService.createLogin(login);
    }
    @GetMapping("/{id}")
    public Login getLoginById(@PathVariable Integer id){
        return loginService.getLoginById(id);
    }
    @GetMapping
    public List<Login> findAll(){
        return loginService.findAll();
    }
}
