import java.util.Scanner;

public class counter {
  
  public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] values= {0.25,0.1,0.05,0.01};
		String[] coin= {"Quarter:", "Dime", "Nickel", "Penny"};
		double[] time= {0,0,0,0};
		double input = in.nextDouble();
		input= Math.round(input * 100);
		input= input/100;
		double temp = input;
		for (int i = 0; i < 4; i++) {
		    	while (temp >= values[i]) {
		    		temp = Math.round(temp * 100);
		    		temp = temp/100;
		    		time[i]++;
		    		temp -= values[i];
		    	}
		    }
		if (temp > 0 && temp < 0.01) time[3]++;
		for (int i = 0; i < 4; i++) {
			if (time[i] != 0) {
			System.out.println(coin[i] + " " + time[i]);
			}
		}
	}
}
