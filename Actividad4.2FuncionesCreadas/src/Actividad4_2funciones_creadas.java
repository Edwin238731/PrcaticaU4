import java.util.Scanner;
import javax.swing.JOptionPane;

public class Actividad4_2funciones_creadas {
	
	public static double Promedio ( double EF,double T1F,double T2F,double PF) { 
		double Pr=0.0;
		Pr= ((EF+T1F+T2F+PF)*20)/100;
		System.out.println("El promedio sobre 20 del alumno es "+Pr);
		return Pr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double E=0.0, T1=0.0, T2=0.0, P=0.0, EF=0.0, T1F=0.0, T2F=0.0, PF=0.0, Pr=0.0;
		String Nom="";
		Scanner t=new Scanner(System.in);
		System.out.println( "Calificación del examen");
		E=t.nextDouble();
		EF= (E*40)/100;
		System.out.println( "El promedio del examen es: "+EF);
		System.out.println( "Calificacion de la tarea 1");
		T1=t.nextDouble();
		T1F= (T1*25)/10;
		System.out.println("El promedio de la tarea 1 es: "+T1F);
		System.out.println( "Calificación de la tarea 2");
		T2=t.nextDouble();
		T2F= (T2*25)/10;
		System.out.println("El promedio de la tarea 2 es: "+T2F);
		System.out.println("Calificacion de la practica ");
		P=t.nextDouble();
		PF=(P*10)/10;
		System.out.println("El promedio de la practica es: "+PF);
		Pr= Promedio ( EF,T1F, T2F, PF);

	}

}
