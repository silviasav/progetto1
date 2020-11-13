package it.sannita.angularspringboot.model;

import java.io.Serializable;


import javax.persistence.*;
import java.util.Date;

//silvia


/**
 * The persistent class for the curriculum database table.
 * 
 */
@Entity
@NamedQuery(name="Curriculum.findAll", query="SELECT c FROM Curriculum c")
public class Curriculum implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	private byte[] curriculum;

	@Temporal(TemporalType.DATE)
	@Column(name="data_fine")
	private Date dataFine;

	@Temporal(TemporalType.DATE)
	@Column(name="data_inizio")
	private Date dataInizio;

	@Column(name="id_curriculum")
	private int idCurriculum;

	//bi-directional many-to-one association to Dipendente
	@ManyToOne
	@JoinColumn(name="id_dipendente")
	private Dipendente dipendente;

	public Curriculum() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getCurriculum() {
		return this.curriculum;
	}

	public void setCurriculum(byte[] curriculum) {
		this.curriculum = curriculum;
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

	public int getIdCurriculum() {
		return this.idCurriculum;
	}

	public void setIdCurriculum(int idCurriculum) {
		this.idCurriculum = idCurriculum;
	}

	public Dipendente getDipendente() {
		return this.dipendente;
	}

	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}

}