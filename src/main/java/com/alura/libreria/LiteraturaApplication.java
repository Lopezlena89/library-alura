package com.alura.libreria;

import com.alura.libreria.menu.Menu;
import com.alura.libreria.repository.AutoresRepository;
import com.alura.libreria.repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class LiteraturaApplication implements CommandLineRunner {


	@Autowired
	private LibrosRepository repo1;

	@Autowired
	private AutoresRepository repo2;

	public static void main(String[] args) {
		SpringApplication.run(LiteraturaApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception{
		Menu menu = new Menu(repo1, repo2);
		menu.Menu();
	}

}