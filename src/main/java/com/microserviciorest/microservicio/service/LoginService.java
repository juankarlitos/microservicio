package com.microserviciorest.microservicio.service;
import com.microserviciorest.microservicio.entity.Login;
import com.microserviciorest.microservicio.repostory.LoginRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LoginService {

    private final LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }
    public Login createLogin(Login login) {
        return loginRepository.save(login);
    }
    public Login getLoginById(Integer id) {
        return loginRepository.findById(id).get();
    }
    public List<Login> findAll(){
        return loginRepository.findAll();
    }
}