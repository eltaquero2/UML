package l;

class Medico extends Hospital {
    private String nombre;
    private String numeroLicencia;
    private String especialidad;

    public Medico(String hospitalNombre, String hospitalDireccion, String nombre, String numeroLicencia, String especialidad) {
        super(hospitalNombre, hospitalDireccion);
        this.nombre = nombre;
        this.numeroLicencia = numeroLicencia;
        this.especialidad = especialidad;
    }

    public String getNumeroLicencia() {
		return numeroLicencia;
	}

	public void setNumeroLicencia(String numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getNombre() { 
    	
    	return nombre;
    	
    }
    public String getEspecialidad() { 
    	
    	return especialidad;
    	
    }
}