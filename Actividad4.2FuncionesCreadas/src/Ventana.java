import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.*;
import org.jfree.data.general.DefaultPieDataset;


public class Ventana extends JFrame{

	public static int A=40;
	public int B=45;
	JPanel panel;
    public Ventana(){
        setTitle("Como Hacer Graficos con Java");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        init();
    }
 
    private void init() {
        panel = new JPanel();
        getContentPane().add(panel);
        // Fuente de Datos
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("C", A);
        data.setValue("Java", B);
        data.setValue("Python", 15);
 
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart(
         "Ejemplo Rapido de Grafico en un ChartFrame", 
         data, 
         true, 
         true, 
         false);
 
        // Crear el Panel del Grafico con ChartPanel
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);
    }
    
    
    
    public static void main(String args[]){
    	Scanner tecla=new Scanner(System.in);
    	System.out.println("Dame un valor");
    	//A=tecla.nextInt();
        new Ventana().setVisible(true);
    }


	


}


