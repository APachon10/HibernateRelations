package OneToMany;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	//Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO )
	@Column(name="empleado_id")
	private int id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido")
	private String apellido;
	@Column(name="dni")
	private String dni;
	@Column(name="fecha_nacimiento")
	private Date fecha_nacimiento;
	@Column(name="email")
	private String mail;
	
	@ManyToOne()
	private Departamento department;
	
	// Constructores
	public Empleado() {
		super();
	}
	public Empleado(String nombre, String apellido, String dni, Date fecha_nacimiento, String mail,Departamento department) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fecha_nacimiento = fecha_nacimiento;
		this.mail = mail;
		this.department=department;
	}
	
	// Getters && Setters 
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getDni() {
		return dni;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public String getMail() {
		return mail;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public void setMail(String mail) {

		this.mail = mail;
	}
	
	// To String 
	@Override
	public String toString() {
		return "Empleado --> id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", mail=" + mail ;
	}
	
	
	
	
}
