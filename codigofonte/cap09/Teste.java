package com.ocajexam.tutorial;

import com.ocajexam.tutorial.NumeroInvalidoException;

public class Teste {
	
	public static void main(String[] args){
	
		try{
			
			Teste teste = new Teste();
			teste.verificaNumero(1);
			teste.verificaNumero(0);
			teste.verificaNumero(-1);
			
		}catch(NumeroInvalidoException ex){
			System.err.println(ex.getMessage());
		}
		
	}
	
	public void verificaNumero(int numero) throws NumeroInvalidoException{
		if(numero >= 0){
			System.out.println("O número " + numero + " é válido");
			return;
		}
		
		throw new NumeroInvalidoException("O número " + numero + " é inválido");
	}
	
}