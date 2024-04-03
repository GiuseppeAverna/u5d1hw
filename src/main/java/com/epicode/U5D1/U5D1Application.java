package com.epicode.U5D1;

import com.epicode.U5D1.entities.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class U5D1Application implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(U5D1Application.class);

	@Value("${tavolo.coperto.prezzo}")
	private double prezzoCoperto;

	public static void main(String[] args) {
		SpringApplication.run(U5D1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Inizializzazione del menu
		Menu menu = new Menu(/* inizializza il menu */);

		// Creazione di un ordine di esempio
		Ordine ordine = new Ordine();
		ordine.setNumeroOrdine(1);
		ordine.setStato("in corso");
		ordine.setNumeroCoperti(4);
		ordine.setOrarioAcquisizione(LocalDateTime.now());
		ordine.setElementiMenu(/* aggiungi elementi del menu all'ordine */);
		ordine.setImportoTotale(/* calcola l'importo totale dell'ordine */);

		// Log dell'ordine
		logger.info("Dettagli ordine:");
		logger.info(ordine.toString());
	}
}
