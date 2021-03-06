package br.com.arq.back.repository;
 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.arq.back.entity.UploadImagem;


@Repository
public interface UploadImagemRepository extends JpaRepository<UploadImagem, Long> {
	 public UploadImagem  findByName (String name); 
}
 