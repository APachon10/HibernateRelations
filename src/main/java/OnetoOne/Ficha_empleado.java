package OnetoOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="ficha_empleado")
public class Ficha_empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ficha_empleado_id")
	private int id;
	@OneToOne(mappedBy="ficha_empleado")
	private Empleado e;
	
	//Constructores
	public Ficha_empleado() {
		super();
	}
	public Ficha_empleado(String nombre, String apellido, String email,Empleado e) {
		super();
		this.e=e;
	}
	
	//Getters && Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Empleado getE() {
		return e;
	}
	public void setE(Empleado e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Ficha_empleado --> id=" + ", e=" + e ;
	}
	
	

}
