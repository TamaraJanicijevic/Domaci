package Domaci1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int n,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("N broj:");
		n=sc.nextInt();
		System.out.println("X broj:");
		x=sc.nextInt();
		boolean kraj = true;
		sc.close();
		
		while(kraj==true) {	
		if(n%x==0) {
				int broj = x;
			
     			System.out.println("Broj je: "+broj);
				kraj = false;
			}else {
				x++;
			}
		}
		
		
		
	}

}
