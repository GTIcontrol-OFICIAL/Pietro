package com.familia.anjos;

import familia.Pedro;
import familia.Roberta;
import familia.DNA;

public class Pietro {

    private DNA[] filho;

    public static void main(String[] cromossomos) {
        new Pietro();
    }
    public Pietro() {

        Pedro pai = new Pedro();
		Roberta mae = new Roberta();

        filho = new DNA[]{pai.getDNA(), mae.getDNA()};
		
		System.out.println("Carregando Pietro...");
        mae.gestacao(filho).esperarMeses(9);

        System.out.println("Hello World!!!");
		//Pietro Luiz Marconi dos Anjos
    }
}