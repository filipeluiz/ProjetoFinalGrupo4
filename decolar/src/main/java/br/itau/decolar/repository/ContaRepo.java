package br.itau.decolar.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import br.itau.decolar.model.Conta;

public interface ContaRepo extends CrudRepository<Conta, Long> {
  public Page<Conta> findAll(Pageable pageable);
}

