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
 * Entidad de persistencia de favorito.
 * </b>
 *  
 * @author Wilson Herrera
 * @version $Revision: 1.0 $ <p>[$Author: Wilson Herrera $, $Date: 13 sep. 2018 $]</p>
*/

@Entity
@Table(name="ban_favorito_t")	
public class Favorito implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3947491621290603121L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="id_usuario")
	private Long id_usuario;
	
	@Column(name="id_vehiculo")
	private Long id_vehiculo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Long getId_vehiculo() {
		return id_vehiculo;
	}

	public void setId_vehiculo(Long id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}

}
