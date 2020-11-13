package it.sannita.angularspringboot.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tipmansione database table.
 * 
 */
@Entity
@NamedQuery(name="Tipmansione.findAll", query="SELECT t FROM Tipmansione t")
public class Tipmansione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipomansione")
	private int idTipomansione;

	@Temporal(TemporalType.DATE)
	@Column(name="data_fine")
	private Date dataFine;

	@Temporal(TemporalType.DATE)
	@Column(name="data_inizio")
	private Date dataInizio;

	@Column(name="tipologia_mansione")
	private String tipologiaMansione;

	public Tipmansione() {
	}

	public int getIdTipomansione() {
		return this.idTipomansione;
	}

	public void setIdTipomansione(int idTipomansione) {
		this.idTipomansione = idTipomansione;
	}

	public Date getDataFine() {
		return this.dataFine;
	}

	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

	public Date getDataInizio() {
		return this.dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public String getTipologiaMansione() {
		return this.tipologiaMansione;
	}

	public void setTipologiaMansione(String tipologiaMansione) {
		this.tipologiaMansione = tipologiaMansione;
	}

}