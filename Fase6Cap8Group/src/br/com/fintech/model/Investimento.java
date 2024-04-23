package br.com.fintech.model;

import java.util.Calendar;
  
  public class Investimento {
  
    private int investimentoId;
    
    private String descricaoInvestimento;
    
    private Calendar dataInvestimento;
    
    private double valorInvestimento;
    
    private int rtnInvestimento;
    
    private int contaBancariaInvestimento;
    
    
    
    public Investimento(int investimentoId, String descricaoInvestimento, Calendar dataInvestimento, double valorInvestimento, int rtnInvestimento, int contaBancariaInvestimento) {
      super();
      this.investimentoId = investimentoId;
      this.descricaoInvestimento = descricaoInvestimento;
      this.dataInvestimento = dataInvestimento;
      this.valorInvestimento = valorInvestimento;
      this.rtnInvestimento = rtnInvestimento;
      this.contaBancariaInvestimento = contaBancariaInvestimento;
    }
  
    public Investimento() {
      super();
    }
  
    public int getInvestimentoId() {
      return investimentoId;
    }

    public void setInvestimentoId(int investimentoId) {
        this.investimentoId = investimentoId;
      }
    
    public String getDescricaoInvestimento() {
        return descricaoInvestimento;
      }
    
    public void setDescricaoInvestimento(String descricaoInvestimento) {
      this.descricaoInvestimento = descricaoInvestimento;
    }
  
    public Calendar getDataInvestimento() {
      return dataInvestimento;
    }
  
    public void setDataInvestimento(Calendar dataInvestimento) {
      this.dataInvestimento = dataInvestimento;
    }
  
    public double getValorInvestimento() {
      return valorInvestimento;
    }
  
    public void setValorInvestimento(double valorInvestimento) {
      this.valorInvestimento = valorInvestimento;
    }
  
    public int getRtnInvestimento() {
      return rtnInvestimento;
    }
  
    public void setRtnInvestimento(int rtnInvestimento) {
      this.rtnInvestimento = rtnInvestimento;
    }
    
    public int getContaBancariaInvestimento() {
        return contaBancariaInvestimento;
      }
    
      public void setContaBancariaInvestimento(int contaBancariaInvestimento) {
        this.contaBancariaInvestimento = contaBancariaInvestimento;
      }
  
  }