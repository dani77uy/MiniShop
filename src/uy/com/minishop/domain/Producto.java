package uy.com.minishop.domain;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Producto implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nombre;
	private String descripcion;
	private FamiliaProducto familia;
	private GregorianCalendar fechaVencimiento;
	private Float pesoNeto;
	private Float pesoBruto;
	private Float capacidad;
	
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	 * @return the familia
	 */
	public FamiliaProducto getFamilia() {
		return familia;
	}
	/**
	 * @param familia the familia to set
	 */
	public void setFamilia(FamiliaProducto familia) {
		this.familia = familia;
	}
	/**
	 * @return the fechaVencimiento
	 */
	public GregorianCalendar getFechaVencimiento() {
		return fechaVencimiento;
	}
	/**
	 * @param fechaVencimiento the fechaVencimiento to set
	 */
	public void setFechaVencimiento(GregorianCalendar fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	/**
	 * @return the pesoNeto
	 */
	public Float getPesoNeto() {
		return pesoNeto;
	}
	/**
	 * @param pesoNeto the pesoNeto to set
	 */
	public void setPesoNeto(Float pesoNeto) {
		this.pesoNeto = pesoNeto;
	}
	/**
	 * @return the pesoBruto
	 */
	public Float getPesoBruto() {
		return pesoBruto;
	}
	/**
	 * @param pesoBruto the pesoBruto to set
	 */
	public void setPesoBruto(Float pesoBruto) {
		this.pesoBruto = pesoBruto;
	}
	/**
	 * @return the capacidad
	 */
	public Float getCapacidad() {
		return capacidad;
	}
	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(Float capacidad) {
		this.capacidad = capacidad;
	}
	
	
}
