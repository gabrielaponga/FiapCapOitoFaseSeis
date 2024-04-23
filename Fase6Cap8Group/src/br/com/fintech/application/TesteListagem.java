package br.com.fintech;

import java.util.List;

public class TesteListagem {

	public static void main(String[] args) {

		InvestimentoDAO dao = new InvestimentoDAO();

		List<Investimento> lista = dao.listar();
		for (Investimento item : lista) {
			System.out.println("investimentoId: " + item.getInvestimentoId() + ", descricaoInvestimento: " + item.getDescricaoInvestimento() + ", dataInvestimento: " + item.getDataInvestimento().getTime() + ", valorInvestimento: " + item.getValorInvestimento() + ", rtnInvestimento: " + item.getRtnInvestimento());
		}
	}
}