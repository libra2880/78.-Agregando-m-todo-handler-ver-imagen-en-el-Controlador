package com.ventura.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ventura.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
