package uy.com.minishop.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.GregorianCalendar;

public class HistorialPrecio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Producto producto;
	private GregorianCalendar fecha;
	private BigDecimal precio;
	
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
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}
	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	/**
	 * @return the fecha
	 */
	public GregorianCalendar getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the precio
	 */
	public BigDecimal getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
}
