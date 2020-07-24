package br.com.java.dao.impl;

import br.com.java.dao.AbstractDao;
import br.com.java.dao.DepartamentoDao;
import br.com.java.domain.Departamento;
import org.springframework.stereotype.Repository;



@Repository
public class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao {

}
