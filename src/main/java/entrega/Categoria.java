package main.java.entrega;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Categoria")
public class Categoria {

	@Id
	@Column(name="cantidad")
	private String nombre;
	
	@ManyToOne()
	@JoinColumn(name="nombre_hijo")
	private Categoria categoriaPadre;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="categoriaPadre")
	private List<Categoria> subcategoria;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="categoria")
	private List<Empresa> empresas;
	
	@ManyToMany()
    @JoinTable(
            name="Usuario_Categorias",
            joinColumns=@JoinColumn(name="username"),
            inverseJoinColumns=@JoinColumn(name="nombre")
    )
	private List<Usuario> usuarios;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="categoria")
	private List<Promocion> promociones;

	public Categoria() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Categoria> getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(List<Categoria> subcategoria) {
		this.subcategoria = subcategoria;
	}
}
