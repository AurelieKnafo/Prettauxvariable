package com.jassur.model;


// Data and methods used to work with it
public class LoanVariable {
	
	// calcule le montant constant

	private double calculationValue;
	private double calculationBestValue;
	private double calculationWorstValue;
	
	
	
	
	// calculate constant loan
	public void addValues (double unMontant, double uneDuree, double unTaux ){
		// Math pow = puissance
		// 12 calculate per month
		calculationValue = ((unMontant * unTaux)/ 12 ) / (1 - (1/(Math.pow( (1 + (unTaux/12)),(uneDuree*12)))));

	}

	//good scenario
	public void addBestValues (double unMontant, int uneDuree, double unTaux ){
		calculationBestValue = calculationValue * 0.99995 ;
		
	}
	
	public void addWorstValues (double unMontant, int uneDuree, double unTaux ){
		calculationWorstValue = calculationValue * 1.0009 ;
		
	}
	
	// calculate constant loan
	public double getCalculationValue(){
		
		return calculationValue;
	}
	//good scenario

	public double getCalculationBestValue(){
		
		return calculationBestValue;
	}
	public double getCalculationWorstValue(){
		
		return calculationWorstValue;
	}
	
}


	
	
	
