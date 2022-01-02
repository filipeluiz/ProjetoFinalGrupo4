package br.itau.decolar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.decolar.model.Conta;
import br.itau.decolar.repository.ContaRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/conta")
public class ContaController {

  @Autowired
  
  private ContaRepo repo;

  @GetMapping("/todos")
  public List<Conta> ListarContas() {
    List<Conta> list = (List<Conta>) repo.findAll();

    return list;
  }
}
