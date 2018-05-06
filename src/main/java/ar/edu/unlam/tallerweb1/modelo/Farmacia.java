package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Farmacia")
public class Farmacia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

	private String nombre;
	private String telefono;
	private String diaDeTurno;

	
	// RELACIONES
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="direccion_id")
	private Direccion direccion;
	
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="geoLocalizacion_id")
	private Punto geoLocalizacion;
	
	
	
	// CONSTRUCTORES
	public Farmacia() {
	}
	
	public Farmacia(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	
	public Farmacia(String nombre, String telefono, String diaDeTurno) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.diaDeTurno = diaDeTurno;
	}


	public Farmacia(String nombre, String telefono, String diaDeTurno, Direccion direccion, Punto geoLocalizacion) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.diaDeTurno = diaDeTurno;
		this.direccion = direccion;
		this.geoLocalizacion = geoLocalizacion;
	}



	// GETTERS SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDiaDeTurno() {
		return diaDeTurno;
	}

	public void setDiaDeTurno(String diaDeTurno) {
		this.diaDeTurno = diaDeTurno;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Punto getGeoLocalizacion() {
		return geoLocalizacion;
	}

	public void setGeoLocalizacion(Punto geoLocalizacion) {
		this.geoLocalizacion = geoLocalizacion;
	}
		
		
		
	
	
	
}
