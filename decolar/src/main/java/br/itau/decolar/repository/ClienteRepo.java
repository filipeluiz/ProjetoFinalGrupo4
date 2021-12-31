package br.itau.decolar.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import br.itau.decolar.model.Cliente;

public interface ClienteRepo extends CrudRepository<Cliente, Long> {
  public Page<Cliente> findAll(Pageable pageable);
}
