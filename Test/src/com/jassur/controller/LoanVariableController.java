package com.jassur.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.jassur.model.LoanVariable;
import com.jassur.view.LoanVariableShowCardPanel;


// Class controller coordinates interactions between the view and model

public class LoanVariableController{
	

	private LoanVariableShowCardPanel theView;
	private LoanVariable theModel;
	
	public LoanVariableController(LoanVariableShowCardPanel theView, LoanVariable theModel ){
		
		this.theView = theView;
		this.theModel = theModel;
		//tell the view that when ever the calculate button is clicked to execute the actionPerformed method in the CalculateListener inner class
		
		this.theView.addCalculationListener(new CalculateListener());
		
	}
	// Listener for calculate constant button
	class CalculateListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double unMontant;
			int uneDuree  ;
			double unTaux ;
			
			
			try {
				unMontant = theView.getUnMontant();
				uneDuree = theView.getUneDuree();
				unTaux = theView.getUnTaux();
				
				//calculate constant taux -> theModel Class
				theModel.addValues(unMontant, uneDuree, unTaux);
				// the solution
				theView.setCalcSolution(theModel.getCalculationValue());
			}
			catch(NumberFormatException ex){
				
				System.out.println(ex);
				// if no values = alert
				theView.displayErrorMessage("Vous devez rentrer des valeurs");
			}
			
		}
		
	}
}
	