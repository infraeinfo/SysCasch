package funcao;
import static funcao.Abre.cad_prod;
import javax.swing.*;
public class Abre {
public static JFrame principal;
public static JFrame novo_reg;
public static JInternalFrame sobre;
public static JInternalFrame cad_prod;
public static JInternalFrame buscaProd;
public static JInternalFrame cadVendas;
public static JInternalFrame insereVendas;
public static JInternalFrame buscaVendas;

public static void telaPrincipal(){
 if(principal==null || principal.isVisible()==false)
 {
    principal  = new tela.JFprincipal();
    principal.setVisible(true);
 } 
 else
    principal.toFront();
}//telaPrincipal

public static void reg_usuario()
{
  if(novo_reg==null || novo_reg.isVisible()==false)
  {
     novo_reg = new tela.JFreg_usuario();
     novo_reg.setVisible(true);
  }//reg_usuario
  else
      novo_reg.toFront();
}//reg_usuario

public static void sobre()
{
  if(sobre==null ||sobre.isVisible()==false)
  {
     sobre = new tela.JIsobre();
     tela.JFprincipal.area.add(sobre);
     sobre.setVisible(true);
  }else
      sobre.toFront();
  
}//sobre

    //cadastra produto telas
    public static void cad_prod(){
        if(cad_prod == null || cad_prod.isVisible() == false){
           cad_prod = new tela.CadProduto();
           tela.JFprincipal.area.add(cad_prod);
           cad_prod.setVisible(true);
        }
        else
            cad_prod.toFront();
    }//cadastra produto telas

    //Consulta de Produtos e Alteraçoes
    public static void buscaProd(){
        if (buscaProd == null || buscaProd.isVisible()== false){
            buscaProd = new tela.consultaProduto();
            tela.JFprincipal.area.add(buscaProd);
            buscaProd.setVisible(true);
        }
    }//Busca Produto e Alterarçoes
    
    //Abrir tela para cadastro de Vendas
    public static void cadVendas(){
        if (cadVendas == null || cadVendas.isVisible()== false){
            cadVendas = new tela.cadVendas();
            tela.JFprincipal.area.add(cadVendas);
            cadVendas.setVisible(true);
        }
    }//Cadastro de Vendas
    
    //Abri a tela de acrescentar itens para vendas na tabela
    public static void insereVendas(){
        if (insereVendas == null || insereVendas.isVisible()== false){
            insereVendas = new tela.insereProduto();
            tela.JFprincipal.area.add(insereVendas);
            insereVendas.setVisible(true);
        }
    }//Cadastro de Vendas
    
    //Busca vendas
    public static void buscaVendas(){
        if(buscaVendas ==  null || buscaVendas.isVisible()== false){
            buscaVendas = new tela.Consulta_venda();
            tela.JFprincipal.area.add(buscaVendas);
            buscaVendas.setVisible(true);
        }
        else
            buscaVendas.toFront();
    }
}//Abre
