package program1_setB_june1;

import java.util.Scanner;
import java.util.function.Function;

public class WetherApp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1:Celsius to Kelvin");
	System.out.println("Enter 2:Celsius to Fahrenheit");
	System.out.println("Enter 3:Fahrenheit to Celsius");
	System.out.print("Enter your option--");
	int option=sc.nextInt();
	switch(option)
	{
	case 1:System.out.print("Enter the temperature in celsius-");
	Double temp1=sc.nextDouble();
		Function<Double,Double> fu1=new Function<Double,Double>()
	{
         public Double apply(Double temp1)
        {
	Double tempKelvin=temp1+273;
	return tempKelvin;
	
        }
	};
	System.out.println("Temperature in Kelvin-"+fu1.apply(temp1));
	break;
	
	case 2:System.out.print("Enter the temperature in celsius-");
	Double temp2=sc.nextDouble();
			Function<Double,Double> fu2=new Function<Double,Double>()
			{
		public Double apply(Double temp2)
		{
			Double tempFahrenheit=((9/5)*temp2)+32;
			return tempFahrenheit;
			
		}
			};
			System.out.println("Temperature in Fahrenheit-"+fu2.apply(temp2));
			break;
	case 3:		System.out.print("Enter the temperature in fahrenheit-");
	Double temp3=sc.nextDouble();
			Function<Double,Double> fu3=new Function<Double,Double>()
			{
		public Double apply(Double temp3)
		{
			Double tempCelsius=(temp3-32)*(5/9);
			return tempCelsius;
			
		}
			};
			System.out.println("Temperature in Celsius-"+fu3.apply(temp3));
			break;
	default :System.out.println("Wrong input");		
}
}
}
