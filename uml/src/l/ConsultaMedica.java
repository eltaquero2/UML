package l;

import java.util.Date;

class ConsultaMedica extends Hospital {
    private Date fecha;
    private String diagnostico;
    private String tratamiento;

    public ConsultaMedica(String hospitalNombre, String hospitalDireccion, Date fecha, String diagnostico, String tratamiento) {
        super(hospitalNombre, hospitalDireccion);
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

    public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public Date getFecha() { 
    	
    	return fecha;
    	
    }
    public String getDiagnostico() { 
    	
    	return diagnostico;
    	
    }
}