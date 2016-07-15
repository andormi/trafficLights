package trafficLights;

import java.util.Scanner;

/** TrafficLights
 * @author Dormidontow Anatoliy
 */


public class TrafficLights {
	
	/**main class of program
	 * @throws are not ejected
	 */
	
	static Lights green = new Lights();
	static Lights yellow = new Lights();
	static Lights red = new Lights();

	
	
	private String lightOfTrafficLights(int minute){
		
		String result = null;
		
		if (minute == 10)
			return red.getName();
		else{
		
		switch (minute%10) {
		case 1:
		case 2:
			result = green.getName();
			break;
		case 3:
		case 4:
		case 5:
			result = yellow.getName();
			break;
		case 6:
		case 7:
		case 8:
		case 9:
			result = red.getName();
			break;
		default:
			break;
		}
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		
		green.setTimeRate(2);
		yellow.setTimeRate(3);
		red.setTimeRate(5);
		
		green.setName("green");
		yellow.setName("yellow");
		red.setName("red");
		
		System.out.println(green.getTimeRate());
		System.out.println(yellow.getTimeRate());
		System.out.println(red.getTimeRate());
		
		
		TrafficLights traffic = new TrafficLights();
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		while (i <= 0){
			System.out.println("Please, input value which is more than zero");
			i = sc.nextInt();
		}
		
		System.out.println(traffic.lightOfTrafficLights(i));
		
	}

}
