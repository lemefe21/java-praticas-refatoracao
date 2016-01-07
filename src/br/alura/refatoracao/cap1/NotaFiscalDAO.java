package br.alura.refatoracao.cap1;

public class NotaFiscalDAO {

	public void salvaBanco(NotaFiscal nf) {
		// salva no banco
		String sql = "insert into notafiscal (cliente, valor)" + "values (?," + nf.getValorLiquido() + ")";

		System.out.println("Salvando no banco" + sql);
	}

}
