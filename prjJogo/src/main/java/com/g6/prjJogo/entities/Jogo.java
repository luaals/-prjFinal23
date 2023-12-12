package com.g6.prjJogo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_jogo")
public class Jogo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String thumbnail;

	private String nome;

	private String genero;
	
	private String descricao;
	
	private String intsquad;
	
	private String squad;
	
	private String url;

	public Jogo() {

	}	

	public Jogo(Long id, String thumbnail, String nome, String genero, String descricao, String intsquad, String squad,
			String url) {
		super();
		this.id = id;
		this.thumbnail = thumbnail;
		this.nome = nome;
		this.genero = genero;
		this.descricao = descricao;
		this.intsquad = intsquad;
		this.squad = squad;
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIntsquad() {
		return intsquad;
	}

	public void setIntsquad(String intsquad) {
		this.intsquad = intsquad;
	}

	public String getSquad() {
		return squad;
	}

	public void setSquad(String squad) {
		this.squad = squad;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	



	

	
}

