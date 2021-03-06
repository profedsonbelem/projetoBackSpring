package br.com.arq.back.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clienteAgenda")
public class ClienteAgenda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long idCliente;
    private String nomeCliente;
    @Column(length=250, unique=true)
    private String email;
    private  Date dataNascimento ;
    @Column(length=250, unique=true)
    private String cnh;
    

 

}
