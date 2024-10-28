import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lectura = null;
		
		// Declarar variables
		long pedigri;
		String raza;
		float precio;
		
		System.out.println("come frutas y verduras");
		
		Mascotas mascotas = null;
		
		int menuPrin, subMenu;
		
		Implementacion imp = new Implementacion();
		
		do {
			
			System.out.println("MENU PRINCIPAL ");
			System.out.println("1---ALTA");
			System.out.println("2---MOSTRAR");
			System.out.println("3---BUSCAR");
			System.out.println("4---EDITAR");
			System.out.println("5---ELIMINAR");
			System.out.println("6---SALIR");
			lectura = new Scanner(System.in);
			menuPrin = lectura.nextInt();
			
			switch(menuPrin) {
			
			case 1:

				System.out.println("Ingrese pedigri");
				lectura = new Scanner(System.in);
				pedigri = lectura.nextLong();

				System.out.println("Ingrese el raza");
				lectura = new Scanner(System.in);
				raza = lectura.nextLine();

				System.out.println("Ingrese el precio");
				lectura = new Scanner(System.in);
				precio = lectura.nextFloat();
				
				//objeto
				mascotas = new Mascotas(pedigri, raza, precio);
				
				//Guardar
				imp.guardar(mascotas);
				System.out.println("Se guardo");
				break;
			
			case 2:
				imp.mostrar();
				System.out.println(mascotas);
				break;
			
			case 3:
				System.out.println("Ingrese pedigri a buscar");
				lectura = new Scanner(System.in);
				pedigri = lectura.nextLong();
				
				//Buscar
				mascotas= imp.buscar(pedigri);	
				System.out.println(mascotas);
				break;				
			
			case 4:
				
				System.out.println("Ingrese pedigri a editar");
				lectura = new Scanner(System.in);
				pedigri = lectura.nextLong();
				
				//buscar
				mascotas = imp.buscar(pedigri);
				System.out.println(mascotas);
				
				//Submenu
				
				do {
					
					System.out.println("1 pedigri");
					System.out.println("2 raza");
					System.out.println("3 regresar");
					lectura = new Scanner(System.in);
					subMenu = lectura.nextInt();
					
					switch(subMenu) {
					
					
					case 1:
						System.out.println("Ingrese el nuevo pedigri");
						lectura = new Scanner(System.in);
						pedigri = lectura.nextLong();
						
						//Actualizaciones
						mascotas.setPedigri(pedigri);
						imp.editar(mascotas);
						System.out.println("Se edito con exito");
						break;
					
					case 2:
						System.out.println("Ingresa la nueva raza");
						lectura = new Scanner(System.in);
						raza = lectura.nextLine();
						
						//Actualizacion
						mascotas.setRaza(raza);
						imp.editar(mascotas);
						System.out.println("Se edito con exito");
						break;
					
					case 3:
						
						break;
					
					}
					
				} while(subMenu < 3);
				
				break;
			
			case 5:
				System.out.println("Ingrese el pedigri a eliminar");
				lectura = new Scanner(System.in);
				pedigri=lectura.nextLong();
				
				break;
				
			case 6:
				System.out.println("Saliendo del programa...");
				break;
			
			
			}
			
		} while(menuPrin < 6);

	}

}
