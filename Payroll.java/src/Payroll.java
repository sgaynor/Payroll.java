/* Figure 2.15
 * Filename: Payroll.java
 * Created: 10/28/17 by Symuel Gaynor
 * 
 * Purpose: Calculates employee earnings
 */


public class Payroll 
{
	
	// main method
	public static void main( String[] args )
	{
		
		// declare and initialize variables
		String empName = "Joe Smith", openingMessage, nameMessage, hoursMessage, 
				          wageMessage, grossEarningsMessage, taxRateMessage,
				          taxMessage, netEarningsMessage, outputMessage;
		double empHours = 30.5, hourlyWage = 7.5, grossEarnings, tax, netEarnings;
		final double TAX_RATE = .15; // tax is 15%, a named constant
		
		// calculations
		grossEarnings = empHours * hourlyWage;
		tax           = grossEarnings * TAX_RATE;
		netEarnings   = grossEarnings - tax;
		
		// build individual strings
		openingMessage       = "Welcome to the payroll application    \n\n";
		nameMessage          = "Employee name:    " + empName        + "\n";
		hoursMessage         = "Hours worked:     " + empHours       + "\n";
		wageMessage          = "Hourly wage:    $ " + hourlyWage     + "\n";
		grossEarningsMessage = "Gross earnings: $ " + grossEarnings  + "\n";
		taxRateMessage       = "Tax rate:         " + TAX_RATE       + "\n";
		taxMessage           = "Tax:            $ " + tax            + "\n";
		netEarningsMessage   = "Net earnings:   $ " + netEarnings    + "\n";
		
		// create output string
		outputMessage = openingMessage + nameMessage + hoursMessage + wageMessage +
				         grossEarningsMessage + taxRateMessage + taxMessage + 
				         netEarningsMessage;
		
		// print output
		System.out.println(  outputMessage  );
		
	} // end main

} // end class
