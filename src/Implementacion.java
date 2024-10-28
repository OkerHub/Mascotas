import java.util.HashMap;
import java.util.List;

public class Implementacion implements Metodos{
	
	//Declarar Hashmap
	HashMap<Long, Mascotas> registros = new HashMap<Long, Mascotas>();
	

	@Override
	public void guardar(Mascotas mascotas) {
		// TODO Auto-generated method stub
		registros.put(mascotas.getPedigri(), mascotas);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("registros");
		
		
	}

	@Override
	public Mascotas buscar(long pedigri) {
		// TODO Auto-generated method stub
		return registros.get(pedigri);
	}

	@Override
	public void editar(Mascotas mascotas) {
		// TODO Auto-generated method stub
		registros.put(mascotas.getPedigri(), mascotas);
		
	}

	@Override
	public void eliminar(Mascotas mascotas) {
		// TODO Auto-generated method stub
		registros.remove(mascotas.getPedigri());
	}

	
}
