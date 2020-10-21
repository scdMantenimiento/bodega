package com.mantenimiento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="planilla")
public class planillasObjet {
	
	@Id
	@Column(name = "objeCorrelativo")
	private Integer objeCorrelativo;
	
	@Column(name = "objeCorrelativoPadre")
	private Integer objeCorrelativoPadre;
	
	@Column(name = "nombreUsuario", length = 200)
	private String nombreUsuario;
	
	@Column(name = "folio")
	private Integer folio; 
	
	@Column(name = "rubro")
	private String rubro;
	
	@Column(name = "titulo", length = 200)
	private String titulo;
	
	@Column(name = "totalSegundos")
	private Integer totalSegundos;
	
	@Column(name = "cifraRepartidora")
	private Integer cifraRepartidora;

	public Integer getObjeCorrelativo() {
		return objeCorrelativo;
	}

	public void setObjeCorrelativo(Integer objeCorrelativo) {
		this.objeCorrelativo = objeCorrelativo;
	}

	public Integer getObjeCorrelativoPadre() {
		return objeCorrelativoPadre;
	}

	public void setObjeCorrelativoPadre(Integer objeCorrelativoPadre) {
		this.objeCorrelativoPadre = objeCorrelativoPadre;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Integer getFolio() {
		return folio;
	}

	public void setFolio(Integer folio) {
		this.folio = folio;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getTotalSegundos() {
		return totalSegundos;
	}

	public void setTotalSegundos(Integer totalSegundos) {
		this.totalSegundos = totalSegundos;
	}

	public Integer getCifraRepartidora() {
		return cifraRepartidora;
	}

	public void setCifraRepartidora(Integer cifraRepartidora) {
		this.cifraRepartidora = cifraRepartidora;
	}
	
}
