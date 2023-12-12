package com.g6.prjJogo.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g6.prjJogo.entities.Jogo;
import com.g6.prjJogo.repositories.JogoRepository;


@Service
public class JogoService {

	private final JogoRepository jogoRepository;

	@Autowired
	public JogoService(JogoRepository jogoRepository) {
		this.jogoRepository = jogoRepository;
	}

	// preparando as buscas por id
	public Jogo getJogoById(Long id) {
		return jogoRepository.findById(id).orElse(null);
	}

	// preparando a busca geral
	public List<Jogo> getAllJogos() {
		return jogoRepository.findAll();
	}

	// salvando o Jogo
	public Jogo saveJogo(Jogo jogo) {
		return jogoRepository.save(jogo);
	}

	// excluindo o Jogo
	public void deleteJogo(Long id) {
		jogoRepository.deleteById(id);
	}
	
}
