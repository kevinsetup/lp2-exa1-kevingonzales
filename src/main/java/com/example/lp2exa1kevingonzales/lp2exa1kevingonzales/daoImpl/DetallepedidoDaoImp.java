package com.example.lp2exa1kevingonzales.lp2exa1kevingonzales.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.lp2exa1kevingonzales.lp2exa1kevingonzales.dao.DetallepedidoDao;
@Repository
public class DetallepedidoDaoImp implements DetallepedidoDao {
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public List<Map<String, Object>> readAll() {
		String sql = "select * from detalle_pedido";
		return jdbctemplate.queryForList(sql);
	}

}
