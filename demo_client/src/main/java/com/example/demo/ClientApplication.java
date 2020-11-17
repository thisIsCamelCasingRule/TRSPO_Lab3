package com.example.demo;

import com.example.demo.methods.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {

		KingdomMethods kingdomMethods = new KingdomMethods();
		KingMethods kingMethods = new KingMethods();
		PeasantMethods peasantMethods = new PeasantMethods();
		RebealMethods rebealMethods = new RebealMethods();
		SentenceMethods sentenceMethods = new SentenceMethods();
		WarMethods warMethods = new WarMethods();

		kingdomMethods.createKingdoms();
		kingMethods.createKing();
		peasantMethods.createPeasant();

		kingdomMethods.getAllKingdoms();
		kingMethods.getAllKing();
		peasantMethods.getAllPeasant();

		kingMethods.getKingByName("Georg II");
		kingdomMethods.getKingdomByName("Britan");
		peasantMethods.getPeasantByName("Tom");

		sentenceMethods.execute("Tom", "France");
		sentenceMethods.pardon("Jula");

		rebealMethods.rebeal("Georg II", "Georg III");

		warMethods.war("Rom", "Germany");

		kingdomMethods.updateKingdomByName("France", 100000.234, 345000, 60000);

		kingMethods.getKingByName("Georg III");
		kingMethods.deleteKingByName("Georg III");
		kingdomMethods.deleteKingdomByName("France");
		peasantMethods.deletePeasantByName("Tom");

		kingMethods.getAllKing();
		kingdomMethods.getAllKingdoms();
		peasantMethods.getAllPeasant();

	}

}
