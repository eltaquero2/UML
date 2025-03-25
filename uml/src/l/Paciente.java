package l;

class Paciente extends Hospital {
    private String nombre;
    private String numeroHistoriaClinica;
    private String direccionPaciente;

    public Paciente(String hospitalNombre, String hospitalDireccion, String nombre, String numeroHistoriaClinica, String direccionPaciente) {
        super(hospitalNombre, hospitalDireccion);
        this.nombre = nombre;
        this.numeroHistoriaClinica = numeroHistoriaClinica;
        this.direccionPaciente = direccionPaciente;
    }

    public String getDireccionPaciente() {
		return direccionPaciente;
	}

	public void setDireccionPaciente(String direccionPaciente) {
		this.direccionPaciente = direccionPaciente;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNumeroHistoriaClinica(String numeroHistoriaClinica) {
		this.numeroHistoriaClinica = numeroHistoriaClinica;
	}

	public String getNombre() { 
    	
    	return nombre;
    	
    }
    public String getNumeroHistoriaClinica() { 
    	
    	return numeroHistoriaClinica;
    	
    }
}