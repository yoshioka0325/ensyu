import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		for(int i=0;i<2;i++){
		    	System.out.print("身長");
			double height = s.nextDouble();

			System.out.print("体重");
			double weight = s.nextDouble();

			double BMI = weight / (height * height);
			System.out.println("BMI" + String.format("%.2f",BMI));
		}
	}
}
