package br.com.fintech;

import java.util.Calendar;

public class TesteCadastro {

	public static void main(String[] args) {
		
		InvestimentoDAO dao = new InvestimentoDAO();

		Investimento investimento = new Investimento();
		investimento.setDescricaoInvestimento("Google");
		investimento.setDataInvestimento(Calendar.getInstance());
		investimento.setValorInvestimento(5000);
		investimento.setRtnInvestimento(30);
		investimento.setContaBancariaInvestimento(1);
		
		dao.cadastrar(investimento);

		System.out.println("Cadastrado!");
	}

}