import java.util.Scanner;

public class whiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t=new Scanner(System.in);
		while (true) {
					
					int resp = 0, resp2=0,k=0;
					switch (resp) {
					case 1:
						
						break;
					case 2:
						break;
					}
					System.out.println("Deseas continuar");
					System.out.println("1.-\tSi");
					System.out.println("2.-\tNo");
					resp2=t.nextInt();
					if (resp2==2) break;
					while(true) {// 
						k++;
						System.out.println("¿Que deseas hacer?");
						System.out.println("1.-\tInformación\n2.-\tVentas");
						resp=t.nextInt();
						if(0<resp && resp<3) break;
						
					}
				}

	}

}
