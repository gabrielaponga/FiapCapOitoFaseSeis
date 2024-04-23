package br.com.fintech;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class InvestimentoDAO {
    
      private Connection conexao;
    
      public void cadastrar(Investimento investimento) {
        PreparedStatement stmt = null;
    
        try {
          conexao = FintechDBManager.obterConexao();
          String sql = "INSERT INTO T_SIP_INVESTIMENTOS(ID_INVESTIMENTO, DS_INVESTIMENTO, DT_INVESTIMENTO, VR_INVESTIMENTO, RTN_INVESTIMENTO, ID_CONTA_BANCARIA) VALUES (SQ_COLABORADOR.NEXTVAL, ?, ?, ?, ?, ?)";
          stmt = conexao.prepareStatement(sql);
          stmt.setString(1, investimento.getDescricaoInvestimento());
          java.sql.Date data = new java.sql.Date(investimento.getDataInvestimento().getTimeInMillis());
          stmt.setDate(2, data);
          stmt.setDouble(3, investimento.getValorInvestimento());
          stmt.setInt(4, investimento.getRtnInvestimento());
          stmt.setInt(5, investimento.getContaBancariaInvestimento());
    
          stmt.executeUpdate();
          
        } catch (SQLException e) {
          e.printStackTrace();
        } finally {
          try {
            stmt.close();
            conexao.close();
          } catch (SQLException e) {
            e.printStackTrace();
          }
        }
      }
      
      public List<Investimento> listar() {
    	    List<Investimento> lista = new ArrayList<Investimento>();
    	    PreparedStatement stmt = null;
    	    ResultSet rs = null;
    	    try {
    	      conexao = FintechDBManager.obterConexao();
    	      stmt = conexao.prepareStatement("SELECT * FROM T_SIP_INVESTIMENTOS");
    	      rs = stmt.executeQuery();
    	  

    	      while (rs.next()) {
    	    	  int investimentoId = rs.getInt("ID_INVESTIMENTO");
    	    	  String descricaoInvestimento = rs.getString("DS_INVESTIMENTO");
    	    	  java.sql.Date data = rs.getDate("DT_INVESTIMENTO");
    	    	  Calendar dataInvestimento = Calendar.getInstance();
    	    	  dataInvestimento.setTimeInMillis(data.getTime());
    	    	  double valorInvestimento = rs.getDouble("VR_INVESTIMENTO");
    	    	  int rtnInvestimento = rs.getInt("RTN_INVESTIMENTO");
    	    	  int contaBancariaInvestimento = rs.getInt("ID_CONTA_BANCARIA");

    	    	  Investimento investimento = new Investimento(investimentoId, descricaoInvestimento, dataInvestimento, valorInvestimento, rtnInvestimento, contaBancariaInvestimento);

    	    	  lista.add(investimento);
    	      }
    	    } catch (SQLException e) {
    	    	e.printStackTrace();
    	    }finally {
    	    	try {
    	    		stmt.close();
    	    		rs.close();
    	    		conexao.close();
    	    	} catch (SQLException e) {
    	    		e.printStackTrace();
    	    	}
    	    }
    	    return lista;
      }

    }