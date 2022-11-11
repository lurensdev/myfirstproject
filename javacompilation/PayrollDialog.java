import javax.swing.*;

public class PayrollDialog{
	public static void main(String[] args){
		String userName;
		String userInputString;
		int userHours;
		double userHourlyRate;
		double userTotalRate;
		
		userName = JOptionPane.showInputDialog( "Please enter your name: " );
		
		userInputString = JOptionPane.showInputDialog( "Please enter your hours work: " );
		userHours = Integer.parseInt(userInputString);
		
		userInputString = JOptionPane.showInputDialog( "Please enter your hourly pay rate: " );
		userHourlyRate = Double.parseDouble(userInputString);
		
		userTotalRate = userHours*userHourlyRate;
		JOptionPane.showMessageDialog(null, userName + " Total gross pay is PHP" + userTotalRate + " for " + userHours + "hours of work." );
		
		System.exit(0);
	}
}