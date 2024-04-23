package br.com.fintech.application;

import br.com.fintech.dao.*;
import br.com.fintech.model.*;
import java.util.Calendar;
import java.util.Scanner;

public class TesteCadastro {

	public static void main(String[] args) {

		InvestimentoDAO dao = new InvestimentoDAO();
		Scanner scanner = new Scanner(System.in);

		Investimento investimento = new Investimento();

		System.out.print("Digite a descrição do investimento: ");
		investimento.setDescricaoInvestimento(scanner.nextLine());

		System.out.print("Digite o valor do investimento: ");
		investimento.setValorInvestimento(Double.parseDouble(scanner.nextLine()));

		System.out.print("Digite o retorno do investimento: ");
		investimento.setRtnInvestimento(Integer.parseInt(scanner.nextLine()));

		investimento.setContaBancariaInvestimento(1);

		investimento.setDataInvestimento(Calendar.getInstance());

		try {
			if (investimento.getDescricaoInvestimento() == null || investimento.getDescricaoInvestimento().isEmpty()) {
				throw new IllegalArgumentException("Descrição do investimento não pode ser vazia.");
			}

			if (investimento.getValorInvestimento() <= 0) {
				throw new IllegalArgumentException("Valor do investimento deve ser maior que zero.");
			}

			dao.cadastrar(investimento);

			System.out.println("Cadastrado!");
		} catch (Exception e) {
			System.out.println("Erro ao cadastrar: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}