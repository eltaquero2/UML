package l;

public class Hospital {
	private String nombre;
   
	private String direccion;

    public Hospital(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
    public String getNombre() { 
    	
    	return nombre; 
    	
    	}
    public String getDireccion() { 
    	
    	return direccion;
    	
    }
}
