package com.example.lp2exa1kevingonzales.lp2exa1kevingonzales;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.lp2exa1kevingonzales.lp2exa1kevingonzales.dao.DetallepedidoDao;

@SpringBootTest
class Lp2Exa1KevingonzalesApplicationTests {
	@Autowired
	private DetallepedidoDao detalle;
	@Test
	void contextLoads() {
		System.out.println(detalle.readAll());
	}

}
