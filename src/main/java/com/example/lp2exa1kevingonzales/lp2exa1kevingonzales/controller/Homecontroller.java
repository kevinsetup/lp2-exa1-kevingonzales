package com.example.lp2exa1kevingonzales.lp2exa1kevingonzales.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lp2exa1kevingonzales.lp2exa1kevingonzales.service.DetallepedidoService;
import com.example.lp2exa1kevingonzales.lp2exa1kevingonzales.entity.Usuario;
import  com.example.lp2exa1kevingonzales.lp2exa1kevingonzales.security.JwtUtil;

@RestController
public class Homecontroller {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
    private JwtUtil jwtUtil;
	@Autowired
		private DetallepedidoService detallepedidoservice;
	@GetMapping("/lista")
	public List<Map<String, Object>>listar(){
		return detallepedidoservice.readAll();
		
	}
	
	@GetMapping("/")
	public String mensaje() {
		return "Bienvenido Al sistema de ventas :)";
	}
	
	
	@PostMapping("/authenticate")
    public String generateToken(@RequestBody Usuario authRequest) throws Exception {
        try {
        	System.out.println(authRequest.getNomuser());
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getNomuser(), authRequest.getClave()));
        } catch (Exception ex) {
            throw new Exception("Error: "+ex);
        }
return jwtUtil.generateToken(authRequest.getNomuser());
    }

}
