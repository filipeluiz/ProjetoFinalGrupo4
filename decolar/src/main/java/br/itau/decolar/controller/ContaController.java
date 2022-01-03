package br.itau.decolar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.decolar.model.Conta;
import br.itau.decolar.repository.ContaRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/contas")
public class ContaController {

  @Autowired
  
  private ContaRepo repo;

  @GetMapping
  public List<Conta> ListarContas() {
    List<Conta> list = (List<Conta>) repo.findAll();

    return list;
  }

  @GetMapping("/{id}") // {indica uma variável}
  public ResponseEntity<Conta> buscarConta(@PathVariable long id) {
      // busca um cliente, e se não encontrar retorna null
      Conta conta = repo.findById(id).orElse(null);

      if (conta != null) { 
          return ResponseEntity.ok(conta); 
      }

      return ResponseEntity.notFound().build(); 
  }  
}
