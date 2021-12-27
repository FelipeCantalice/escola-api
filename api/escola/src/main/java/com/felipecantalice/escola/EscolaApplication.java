package com.felipecantalice.escola;

import com.felipecantalice.escola.entities.Escola;
import com.felipecantalice.escola.entities.Materia;
import com.felipecantalice.escola.entities.Sala;
import com.felipecantalice.escola.entities.Serie;
import com.felipecantalice.escola.repositories.EscolaRepository;
import com.felipecantalice.escola.repositories.MateriaRepository;
import com.felipecantalice.escola.repositories.SalaRepository;
import com.felipecantalice.escola.repositories.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EscolaApplication implements CommandLineRunner {

	@Autowired
	EscolaRepository escolaRepository;

	@Autowired
	SerieRepository serieRepository;

	@Autowired
	MateriaRepository materiaRepository;

	@Autowired
	SalaRepository salaRepository;

	public static void main(String[] args) {
		SpringApplication.run(EscolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Escola
		Escola escola = new Escola(null,"Escola de Teste");
		escolaRepository.save(escola);

		// Serie
		Serie serie = new Serie(null,"Serie 1");
		serieRepository.save(serie);

		// Materia
		Materia materia = new Materia(null,"Matematica");
		materiaRepository.save(materia);

		// Sala
		Sala sala = new Sala(null,"Matematica");
		salaRepository.save(sala);
		
		
	}

}
