package com.example.probabilidadyestadistica;

public class Funciones {
	//Funciones Basicas 
	private double factorial(int numero){
		double resultado=1;
		for (int i=1; i<=numero; i++){
			resultado=numero*resultado;
		}
		return resultado;
	}
	private double calcularConvinacion(int n, int r){
		double respuesta=0;
		respuesta= factorial(n)/(factorial(r)*factorial(n-r));
		return respuesta;
	}
	private double calcularElevados(double base, int exponente){
		double resultado =base;
		for (int i = 1; i <exponente; i++) {
			resultado = resultado*base;
		}
		return resultado;
	}
	public double calcularBinomial(int x, int n, double p){
		double respuesta=0;
		respuesta = calcularConvinacion(n,x);
		double palx= calcularElevados(p,x);
		double q= 1-p;
		int exp=n-x;
		double qAlExp=calcularElevados(q,exp);
		respuesta = respuesta*palx*qAlExp;
		return respuesta;
	}
	
}
