/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import javax.swing.table.DefaultTableModel;
import modelo.RegistroVeiculos;

/**
 *
 * @author aluno
 */
public class Veiculos {
    
    
    
     private String[] colunas = {"Marca","Modelo","Placa", "Ano", "Cor"};
     private DefaultTableModel dataModel;
      
     public Veiculos(){
        this.dataModel = new DefaultTableModel(); 
        
        Object[][] data = null;
        
        dataModel.setDataVector(data, this.colunas);
    }
    
    public DefaultTableModel getDataModel(){
       return this.dataModel;
    }
    
    public void insereVeiculos(RegistroVeiculos veiculos){
       Object[] data = {veiculos.getMarca(), veiculos.getModelo(),veiculos.getPlaca(), veiculos.getAno(), veiculos.getidCor()};
        this.dataModel.addRow(data);
        
    }
    
    public void removeVeiculos(int selectedRow) {

        this.dataModel.removeRow(selectedRow);
    }
    
    public RegistroVeiculos getVeiculos(int codigo) {
        String marca = String.valueOf(this.dataModel.getValueAt(codigo, 0));
        String modelo = String.valueOf(this.dataModel.getValueAt(codigo, 1)); 
        String placa = String.valueOf(this.dataModel.getValueAt(codigo, 2)); 
        String ano = String.valueOf(this.dataModel.getValueAt(codigo, 3));
        String cor = String.valueOf(this.dataModel.getValueAt(codigo, 4));
               
                                
        RegistroVeiculos auxVeiculos = new RegistroVeiculos(marca, modelo, placa, ano, cor);
        return auxVeiculos;
        
    }
    
    

    public void atualizarVeiculos(RegistroVeiculos veiculos, int codigo) {
      this.dataModel.setValueAt(veiculos.getMarca(), codigo, 0);
      this.dataModel.setValueAt(veiculos.getModelo(), codigo, 1);
      this.dataModel.setValueAt(veiculos.getPlaca(), codigo, 2); 
      this.dataModel.setValueAt(veiculos.getAno(), codigo, 3);
      this.dataModel.setValueAt(veiculos.getidCor(), codigo, 4);
    }

    

    
    
    
}


