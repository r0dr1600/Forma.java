/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

public class Retangulo extends Forma{
  public double Base;

  public void setBase(double Base){
    this.Base = Base;
  }
  public double Altura;
  public void setAltura(double Altura){
    this.Altura = Altura;
  }


  @Override
  public String getNome(){
    return "Retangulo";
  }

  @Override
  public double calcularPerimetro(){
    return (Base * 2) + (Altura * 2);
  }

  @Override
  public double calcularArea(){
    return (Base * Altura);
  }


}