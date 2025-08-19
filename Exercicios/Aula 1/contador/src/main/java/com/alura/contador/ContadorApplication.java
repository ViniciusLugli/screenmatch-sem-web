package com.alura.contador;

import com.alura.contador.models.Tarefa;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		Tarefa tarefaNova = new Tarefa("Arrumar a cama e passar aspirador de pó", false, "Vinícius");
		mapper.writeValue(new File("tarefa.json"), tarefaNova);
		System.out.println("Nova tarefa criada!");

		Tarefa tarefaLida = mapper.readValue(new File("tarefa.json"), Tarefa.class);
		System.out.println("Tarefa lida do json");
		System.out.println(tarefaLida);
	}
}
