/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class RegistroVeiculos {
    
    private String marca;
    private String modelo;
    private String placa;
    private String ano;
    private String idcor;
    private static String[] cor = {"Branco","Preto","Prata","Vermelho"};
    
    

    
    public RegistroVeiculos(String marca, String modelo, String placa, String ano, String idcor){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.idcor = idcor;
    
    }
    
    
    @Override
      public boolean equals(Object obj){
          if (obj instanceof RegistroVeiculos){
              RegistroVeiculos veiculos = (RegistroVeiculos) obj;
              if (veiculos.marca==this.marca && veiculos.modelo == this.modelo && veiculos.placa == this.placa){
                  return true;
              }
             
          }
           return false;
          
      }
      
    @Override
      public String toString(){

         return this.marca + " - " + this.modelo + " - " + this.placa;

      }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getidCor() {
        return idcor;
    }

    public void setCor(String cor) {
        this.idcor = idcor;
    }
    
    public int getCorId(String corTexto){
        for(int i = 0; i<cor.length;i++){
            if(cor[i].equalsIgnoreCase(corTexto))
                return i;
        }
        return -1;
    }
    
    
    
}
