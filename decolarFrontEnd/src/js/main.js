"use strict";

const API = (function(){
  const tabela = document.querySelector('.tabelaBody');
  const tabela2 = document.querySelector('.tabelaBodySearch');
  const atualizar = document.querySelector('.btn');
  const input = document.querySelector('.searchbar');
  
  const TabelaContas = async() => {
    const url = "http://localhost:8080/contas";
    const data = await fetch(url);
    const json = await data.json();
  
    const tabelas = json.map(n =>  {
      return `
          <tr>
            <th scope="row">${n.codigo}</th>
            <td>${n.numero}</td>
            <td>${n.agencia}</td>
            <td>R$ ${n.saldo}</td>
            <td>${n.titular.nome}</td>
            <td>${n.tipoConta.tipo}</td>
          </tr>
      `
    })
    tabela.innerHTML = tabelas.join('');
  }

  const TabelaSearch = async() => {
    let tabelas;
    try{
      const id = input.value;
      const url = `http://localhost:8080/contas/${id}`;
      const data = await fetch(url);
      const json = await data.json();

      tabelas = `
        <tr>
          <th scope="row">${json.codigo}</th>
          <td>${json.numero}</td>
          <td>${json.agencia}</td>
          <td>R$ ${json.saldo}</td>
          <td>${json.titular.codigo}</td>
          <td>${json.titular.cpf}</td>
          <td>${json.titular.email}</td>
          <td>${json.titular.nome}</td>
          <td>${json.titular.telefone}</td>
          <td>${json.tipoConta.tipo}</td>
        </tr>`; 
    }
    catch(error) {
      tabelas = `<td colspan="10" class="info">Não encontrado ID</td>`
    } finally {
      tabela2.innerHTML = tabelas;  
    }
  }

  atualizar.addEventListener('click', TabelaContas);
  input.addEventListener('keyup', TabelaSearch);  
  
  TabelaContas();
})();
