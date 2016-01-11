package br.alura.refatoracao.cap2;

import java.util.List;

public class Trem {

	private List<Vagao> vagoes;
	private int capacidade;

	public boolean podeReservar(int lugaresAReservar) {

		int lugaresDisponiveis = capacidade - lugaresJaReservados(); //in line
		return lugaresDisponiveis > lugaresAReservar;

	}

	private int lugaresJaReservados() { //extract method
		int lugaresJaReservados = 0;
		for(Vagao vagao : vagoes) {
			lugaresJaReservados += vagao.reservados();
		}
		return lugaresJaReservados;
	}

}