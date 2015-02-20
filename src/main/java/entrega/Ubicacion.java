package main.java.entrega;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Ubicacion")
public class Ubicacion {
	
	@Id
	@Column(name="nombre")
	private String coordenadas;
	
	@Column(name="calle")
	private String calle;
	
	@Column(name="avenida")
	private String avenida;
	
	@Column(name="edificio")
	private String edifico;
	
	@Column(name="local")
	private String local;
	
	@ManyToOne()
	@JoinTable(name="Ubicacion_Ciudad")
	private Ciudad ciudad;
	
	public Ubicacion() {}

	public String getCoordenadas() {
		return coordenadas;
	}


	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}


	public String getCalle() {
		return calle;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public String getAvenida() {
		return avenida;
	}


	public void setAvenida(String avenida) {
		this.avenida = avenida;
	}


	public String getEdifico() {
		return edifico;
	}


	public void setEdifico(String edifico) {
		this.edifico = edifico;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}
	
	
	

}
