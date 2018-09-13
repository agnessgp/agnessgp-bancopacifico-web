package ec.agnessgp.bancopacifico.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 * <b>
 * Entidad de persistencia de vehiculo.
 * </b>
 *  
 * @author Wilson Herrera
 * @version $Revision: 1.0 $ <p>[$Author: Wilson Herrera $, $Date: 13 sep. 2018 $]</p>
*/
@Entity
@Table(name="ban_vehiculo_t")	
public class Vehiculo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1161763108723104094L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="marca")
	private String marca;
	
	@Column(name="modelo")
	private String modelo;
	
	@Column(name="anio")
	private Integer anio;
	
	@Column(name="color")
	private String color;
	
	@Column(name="imagen")
	private String imagen;
	
	@Column(name="precio")
	private Float precio;
	
	@Column(name="marca")
	private Integer estado;
	
	@Column(name="consecionario_id")
	private Long concesionarioId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Long getConcesionarioId() {
		return concesionarioId;
	}

	public void setConcesionarioId(Long concesionarioId) {
		this.concesionarioId = concesionarioId;
	}
	
	
	
}

