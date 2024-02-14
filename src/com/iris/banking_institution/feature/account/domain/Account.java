package com.iris.banking_institution.feature.account.domain;

public class Account {
   private String numeroCuenta;
   private String nombreTitular;
   private String transacciones;
   private String productoscontratados;
   private double saldo;

   public Account(String numeroCuenta, String nombreTitular, String transacciones, String productoscontratados, double saldo) {
      this.numeroCuenta = numeroCuenta;
      this.nombreTitular = nombreTitular;
      this.transacciones = transacciones;
      this.productoscontratados = productoscontratados;
      this.saldo = saldo;
   }
   public Account(String numeroCuenta, String nombreTitular, String transacciones, String productoscontratados) {
      this.numeroCuenta = numeroCuenta;
      this.nombreTitular = nombreTitular;
      this.transacciones = transacciones;
      this.productoscontratados = productoscontratados;
      this.saldo = 0;
   }

   public String getNumeroCuenta() {
      return numeroCuenta;
   }

   public void setNumeroCuenta(String numeroCuenta) {
      this.numeroCuenta = numeroCuenta;
   }

   public String getNombreTitular() {
      return nombreTitular;
   }

   public void setNombreTitular(String nombreTitular) {
      this.nombreTitular = nombreTitular;
   }

   public String getTransacciones() {
      return transacciones;
   }

   public void setTransacciones(String transacciones) {
      this.transacciones = transacciones;
   }

   public String getProductoscontratados() {
      return productoscontratados;
   }

   public void setProductoscontratados(String productoscontratados) {
      this.productoscontratados = productoscontratados;
   }

   public double getSaldo() {
      return saldo;
   }

   public void setSaldo(double saldo) {
      this.saldo = saldo;
   }
}
