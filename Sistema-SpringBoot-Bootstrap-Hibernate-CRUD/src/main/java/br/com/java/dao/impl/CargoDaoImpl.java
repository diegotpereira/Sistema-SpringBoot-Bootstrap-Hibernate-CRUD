package br.com.java.dao.impl;

import br.com.java.dao.AbstractDao;
import br.com.java.dao.CargoDao;
import br.com.java.domain.Cargo;
import org.springframework.stereotype.Repository;



@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
