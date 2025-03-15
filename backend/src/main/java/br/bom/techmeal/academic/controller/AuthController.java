package br.bom.techmeal.academic.controller;

import br.bom.techmeal.academic.dto.AuthenticationDTO;
import br.bom.techmeal.academic.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping(value = "/login")
    public ResponseEntity<?> login(@RequestBody AuthenticationDTO authDto){
        return ResponseEntity.ok(authService.login(authDto));


    }
}
