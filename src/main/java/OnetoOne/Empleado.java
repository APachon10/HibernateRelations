package OnetoOne;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	@Column(name="email")
	private String mail;
	
	@OneToOne
	@JoinColumn(name="fecha_empleado_id")
	private Ficha_empleado ficha_empleado;
	
	// Constructores
	public Empleado() {
		super();
	}
	public Empleado(String nombre, String apellido, String dni, String mail,Ficha_empleado ficha_empleado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.mail = mail;
		this.ficha_empleado=ficha_empleado;
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
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Ficha_empleado getFicha_empleado() {
		return ficha_empleado;
	}
	public void setFicha_empleado(Ficha_empleado ficha_empleado) {
		this.ficha_empleado = ficha_empleado;
	}
	// To String 
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+  ", mail=" + mail + ", ficha_empleado=" + ficha_empleado
				+ "]";
	}
}
