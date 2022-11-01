package br.edu.infnet.appdelivery.model.domain;

public class Bar extends Restaurante{
 public  Bebida bebida;

 public Bebida getBebida() {
  return bebida;
 }

 public void setBebida(Bebida bebida) {
  this.bebida = bebida;
 }
}
