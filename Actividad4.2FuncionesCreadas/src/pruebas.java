import java.io.FileWriter;

public class pruebas {

	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		int  l=0;
			String[] producto = new String [2/*espacio para la dimension*/] ;
			producto [1/*aqui va en que cenda se guarda*/]=""/*espacion para guardar los datos*/;
			String nuevalinea = System.getProperty("line.separator");
			/** FORMA 1 DE ESCRITURA **/
			FileWriter archivo = null;
			try {
				

		
				 archivo = new FileWriter("Texto.txt");
		
					// Escribimos linea a linea en el archivo
				 
				 archivo.write("\tProducto\t"+"Cantidada\t"+"Precio"+nuevalinea);
					for (String linea : producto) {
						l++;
						archivo.write(l+"\t"+linea+ nuevalinea);
					}
				
			} 
			catch (Exception ex) {
				System.out.println("Mensaje de la excepción: " + ex.getMessage());
			}
			 finally {
				   System.out.println("Archivo guardado!!!");
		           try {	          
		           if (null != archivo)
		        	   archivo.close();
		           } catch (Exception e2) {
		              e2.printStackTrace();
		           }
		        }
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		int n=0, i=0;
//		int [] v=new int[n];
			String[] lineas = {"hola mmundo", "bacab", "David", "rayar", "Gallina", "anitalavalatina", "Siete"};
			String[] cantidad = { "          bacab", "        rayar", "      Gallina", "		anitalavalatina", "		Siete"};
			String[] precio = { "	bacab", "	rayar", "	Gallina", "	anitalavalatina", "	Siete"};
//			String [] cnt= new String [];
			String nuevalinea1 = System.getProperty("line.separator");
			/** FORMA 1 DE ESCRITURA **/
			FileWriter archivo2 = null;
			try {
				

		
				 archivo = new FileWriter("Prueba.txt");


				 		
						// Escribimos linea a linea en el archivo
				 archivo.write("Producto "+"Cantidada "+"Precio"+nuevalinea);
						for (String linea : lineas) {
							i++;
							archivo.write(i+linea+ precio + nuevalinea);
						}
				/*for(i=0;i<n;i++){//numeración
					System.out.println("Dame el elemento "+i+" del vector");
					v[i]=t.nextInt();
					
				}*/
		
			} 
			catch (Exception ex) {
				System.out.println("Mensaje de la excepción: " + ex.getMessage());
			}
			 finally {
				   System.out.println("Archivo guardado!!!");
		           try {	          
		           if (null != archivo)
		        	   archivo.close();
		           } catch (Exception e2) {
		              e2.printStackTrace();
		           }
		        }

	}

}
