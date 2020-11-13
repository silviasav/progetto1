package it.sannita.angularspringboot.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tipruolo database table.
 * 
 */
@Entity
@NamedQuery(name="Tipruolo.findAll", query="SELECT t FROM Tipruolo t")
public class Tipruolo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="data_fine")
	private Date dataFine;

	@Temporal(TemporalType.DATE)
	@Column(name="data_inizio")
	private Date dataInizio;

	@Column(name="id_tiporuolo")
	private int idTiporuolo;

	@Column(name="tipologia_ruolo")
	private String tipologiaRuolo;

	public Tipruolo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getIdTiporuolo() {
		return this.idTiporuolo;
	}

	public void setIdTiporuolo(int idTiporuolo) {
		this.idTiporuolo = idTiporuolo;
	}

	public String getTipologiaRuolo() {
		return this.tipologiaRuolo;
	}

	public void setTipologiaRuolo(String tipologiaRuolo) {
		this.tipologiaRuolo = tipologiaRuolo;
	}

}