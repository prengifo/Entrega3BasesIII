package main.java.entrega;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario {
	
	@Id
	@Column(name="username")
	private String username;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="correoElectronico")
	private String correoElectronico;
	
	@Column(name="contrasena")
	private String contrasena;
	
	@Column(name="edad")
	private int edad;
	
	@Column(name="genero")
	private String genero;
	
	@Column(name="frecuenciaCorreos")
	private String frecuenciaCorreos;
	
	@OneToOne(cascade=CascadeType.ALL)
	@MapsId
	private DineroPromocion saldoPromocion;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="usuario")
	private List<TarjetaDeCredito> tarjetasDeCredito;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="usuario")
	private List<RedSocial> redesSociales;
	
	@ManyToMany()
    @JoinTable(
            name="Usuario_Categorias",
            joinColumns=@JoinColumn(name="username"),
            inverseJoinColumns=@JoinColumn(name="nombre")
    )
	private List<Categoria> categoriasPreferidas;
	
	@ManyToMany(cascade=CascadeType.ALL, mappedBy="usuarios")
	private List<Ciudad> ciudadesPreferidas;
	
	@OneToMany(mappedBy = "pk.usuario", cascade=CascadeType.ALL)
	private List<Comparte> promocionesCompartidas;
	
	public Usuario() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFrecuenciaCorreos() {
		return frecuenciaCorreos;
	}

	public void setFrecuenciaCorreos(String frecuenciaCorreos) {
		this.frecuenciaCorreos = frecuenciaCorreos;
	}

	public DineroPromocion getSaldoPromocion() {
		return saldoPromocion;
	}

	public void setSaldoPromocion(DineroPromocion saldoPromocion) {
		this.saldoPromocion = saldoPromocion;
	}
	

}
