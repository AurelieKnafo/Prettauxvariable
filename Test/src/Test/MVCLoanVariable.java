package Test;

import javax.swing.SwingUtilities;

import com.jassur.controller.LoanVariableController;
import com.jassur.model.LoanVariable;
import com.jassur.view.LoanVariableShowCardPanel;

public class MVCLoanVariable {
	
	public static void main(String[] args){
		LoanVariableShowCardPanel theView = new LoanVariableShowCardPanel();
		
		LoanVariable theModel = new LoanVariable();
		
		LoanVariableController theController = new LoanVariableController( theView, theModel);
		
		theView.setVisible(true);
		
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new LoanVariableShowCardPanel();
			}
		});
		
	}

}
