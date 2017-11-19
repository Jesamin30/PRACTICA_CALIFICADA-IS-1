package domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Curso implements BaseEntity<Long> {
	@Id	
	@Column(length=15)
	private String codigo;
	
	@Column(length=30)
	private String nombre;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="prerequisito",
	joinColumns=@JoinColumn(name="curso_codigo",referencedColumnName="codigo"),
		inverseJoinColumns=@JoinColumn(name="prerequisito_codigo",
		referencedColumnName="codigo"))

	@Column
	private Integer creditos;
	private List<Curso> prerequisitos;
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public List<Curso> getPrerequisitos() {
		return prerequisitos;
	}

	public void setPrerequisitos(List<Curso> prerequisitos) {
		this.prerequisitos = prerequisitos;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

}
