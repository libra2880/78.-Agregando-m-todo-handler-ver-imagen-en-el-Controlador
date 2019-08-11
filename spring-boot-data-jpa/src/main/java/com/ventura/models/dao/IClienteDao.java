package com.ventura.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ventura.models.entity.Cliente;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{

}
