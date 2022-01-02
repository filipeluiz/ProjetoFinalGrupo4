package br.itau.decolar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.decolar.model.Cliente;
import br.itau.decolar.repository.ClienteRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")
public class ClienteController {
  
  @Autowired

  private ClienteRepo repo;

  @GetMapping("/todos")
  public List<Cliente> listarTodosClientes() {
    List<Cliente> list = (List<Cliente>) repo.findAll();

    return list;
  }

}
