package br.alura.refatoracao.cap3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteMatricula {

	public static void main(String[] args) {

		Matricula matricula = new Matricula(false, new GregorianCalendar(2020, Calendar.APRIL, 2));

		//if - complicado pois possui regras de negócio, passamos para um método
		//criando mais semântica no código

		//if = dificuldade de leitura (evite condições complexas)

		if(matricula.estaValida()) {
			System.out.println("Matricula com acesso ilimitado!");
		}

	}

}
