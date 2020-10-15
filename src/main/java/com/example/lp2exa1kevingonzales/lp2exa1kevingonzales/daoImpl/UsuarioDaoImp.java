package com.example.lp2exa1kevingonzales.lp2exa1kevingonzales.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.lp2exa1kevingonzales.lp2exa1kevingonzales.dao.UsuarioDao;
import com.example.lp2exa1kevingonzales.lp2exa1kevingonzales.entity.Usuario;
@Repository

public class UsuarioDaoImp implements UsuarioDao {
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Override
	public Usuario read(String nomuser) {
		String sql = "select * from usuario where nomuser = ?";
		return jdbctemplate.queryForObject(sql, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

}
