package it.sannita.angularspringboot.model;

import java.io.Serializable;

//modifica di prova
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the competenze database table.
 * 
 */
@Entity
@NamedQuery(name="Competenze.findAll", query="SELECT c FROM Competenze c")
public class Competenze implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_competenze")
	private int idCompetenze;

	@Temporal(TemporalType.DATE)
	@Column(name="data_fine")
	private Date dataFine;

	@Temporal(TemporalType.DATE)
	@Column(name="data_inizio")
	private Date dataInizio;

	@Column(name="id_curriculum")
	private int idCurriculum;

	@Column(name="id_tipomansione")
	private int idTipomansione;

	private String skill;

	//bi-directional many-to-one association to Dipendente
	@ManyToOne
	@JoinColumn(name="id_dipendente")
	private Dipendente dipendente;

	public Competenze() {
	}

	public int getIdCompetenze() {
		return this.idCompetenze;
	}

	public void setIdCompetenze(int idCompetenze) {
		this.idCompetenze = idCompetenze;
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

	public int getIdTipomansione() {
		return this.idTipomansione;
	}

	public void setIdTipomansione(int idTipomansione) {
		this.idTipomansione = idTipomansione;
	}

	public String getSkill() {
		return this.skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public Dipendente getDipendente() {
		return this.dipendente;
	}

	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}

}