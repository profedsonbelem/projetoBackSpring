package br.com.arq.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.arq.back.entity.EnderecoCliente;

@Repository
public interface EnderecoClienteRepository extends JpaRepository<EnderecoCliente, Long>  {

}
