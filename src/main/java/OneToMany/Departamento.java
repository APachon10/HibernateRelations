package OneToMany;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="departamento")
public class Departamento {
	//Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO )
	@Column(name="departamento_id")
	private int id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="fecha_creacion")
	private Date fecha_creacion;
	
	@OneToMany()
	@JoinColumn(name = "empleado_id")
	private List<Empleado> employees;
	
	// Constructores
	public Departamento() {
		super();
	}
	public Departamento(String nombre, Date fecha_creacion, List<Empleado> employees) {
		super();
		this.nombre = nombre;
		this.fecha_creacion = fecha_creacion;
		this.employees = employees;
	}
	
	//Getters && Setters
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public List<Empleado> getE() {
		return employees;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	public void setE(List<Empleado> employees) {
		this.employees = employees;
	}
	
	//To String
	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + ", fecha_creacion=" + fecha_creacion + ", lista =" + employees;
	}
	
	
	
}
