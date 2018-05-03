package ar.edu.unlam.tallerweb1.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Barrio")
public class Barrio {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	
	// RELACIONES
	@OneToMany(mappedBy="barrio")
	private List<Direccion> direccion = new ArrayList<>();
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="comuna_id")
	private Comuna comuna;

	
	// CONSTRUCTORES
	public Barrio() {
	}
	
	public Barrio(String nombre) {
		this.nombre = nombre;
	}

	public Barrio(String nombre, List<Direccion> direccion, Comuna comuna) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.comuna = comuna;
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

	public List<Direccion> getDireccion() {
		return direccion;
	}

	public void setDireccion(List<Direccion> direccion) {
		this.direccion = direccion;
	}

	public Comuna getComuna() {
		return comuna;
	}

	public void setComuna(Comuna comuna) {
		this.comuna = comuna;
	}
	
	
	
	
	
	
	
}
