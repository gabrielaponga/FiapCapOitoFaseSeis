package br.com.fintech.application;

import br.com.fintech.model.*;
import br.com.fintech.dao.*;
import java.util.List;

public class TesteListagem {

	public static void main(String[] args) {
		try {
			InvestimentoDAO dao = new InvestimentoDAO();

			List<Investimento> lista = dao.listar();
			for (Investimento item : lista) {
				System.out.println("\n" + "Investimento nº:"  + item.getInvestimentoId() + "\n" + "descricaoInvestimento: " + item.getDescricaoInvestimento() + ", dataInvestimento: " + item.getDataInvestimento().getTime() + ", valorInvestimento: " + item.getValorInvestimento() + ", rtnInvestimento: " + item.getRtnInvestimento());
			}
		} catch (Exception e) {
			System.err.println("Houve um erro: " + e.getMessage());
			e.printStackTrace();
		}
	}
}