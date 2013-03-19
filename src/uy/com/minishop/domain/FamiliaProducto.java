package uy.com.minishop.domain;

import java.io.Serializable;

import uy.com.minishop.domain.enums.TipoAlmacenamientoProducto;
import uy.com.minishop.domain.enums.TipoProducto;

public class FamiliaProducto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String descripcion;
	private TipoProducto tipo;
	private TipoAlmacenamientoProducto tipoAlmacenamiento;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the tipo
	 */
	public TipoProducto getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoProducto tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the tipoAlmacenamiento
	 */
	public TipoAlmacenamientoProducto getTipoAlmacenamiento() {
		return tipoAlmacenamiento;
	}
	/**
	 * @param tipoAlmacenamiento the tipoAlmacenamiento to set
	 */
	public void setTipoAlmacenamiento(TipoAlmacenamientoProducto tipoAlmacenamiento) {
		this.tipoAlmacenamiento = tipoAlmacenamiento;
	}
	
	

}
