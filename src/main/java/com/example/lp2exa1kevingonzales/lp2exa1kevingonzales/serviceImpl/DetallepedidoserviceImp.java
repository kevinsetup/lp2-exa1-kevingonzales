package com.example.lp2exa1kevingonzales.lp2exa1kevingonzales.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lp2exa1kevingonzales.lp2exa1kevingonzales.dao.DetallepedidoDao;
import com.example.lp2exa1kevingonzales.lp2exa1kevingonzales.service.DetallepedidoService;
@Service
public class DetallepedidoserviceImp implements DetallepedidoService {
	@Autowired
	private DetallepedidoDao detallepedidodao;
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return detallepedidodao.readAll();
	}

}
