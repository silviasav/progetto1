package it.sannita.angularspringboot.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the dipendente database table.
 * 
 */
@Entity
@NamedQuery(name="Dipendente.findAll", query="SELECT d FROM Dipendente d")
public class Dipendente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String cognome;

	@Temporal(TemporalType.DATE)
	@Column(name="data_di_nascita")
	private Date dataDiNascita;

	@Temporal(TemporalType.DATE)
	@Column(name="data_fine")
	private Date dataFine;

	@Temporal(TemporalType.DATE)
	@Column(name="data_inizio")
	private Date dataInizio;

	@Column(name="id_dipendente")
	private int idDipendente;

	private String matricola;

	private String nome;

	//bi-directional many-to-one association to Competenze
	@OneToMany(mappedBy="dipendente")
	private List<Competenze> competenzes;

	//bi-directional many-to-one association to Curriculum
	@OneToMany(mappedBy="dipendente")
	private List<Curriculum> curriculums;

	//bi-directional many-to-one association to Ruolo
	@OneToMany(mappedBy="dipendente")
	private List<Ruolo> ruolos;

	public Dipendente() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDataDiNascita() {
		return this.dataDiNascita;
	}

	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
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

	public int getIdDipendente() {
		return this.idDipendente;
	}

	public void setIdDipendente(int idDipendente) {
		this.idDipendente = idDipendente;
	}

	public String getMatricola() {
		return this.matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Competenze> getCompetenzes() {
		return this.competenzes;
	}

	public void setCompetenzes(List<Competenze> competenzes) {
		this.competenzes = competenzes;
	}

	public Competenze addCompetenze(Competenze competenze) {
		getCompetenzes().add(competenze);
		competenze.setDipendente(this);

		return competenze;
	}

	public Competenze removeCompetenze(Competenze competenze) {
		getCompetenzes().remove(competenze);
		competenze.setDipendente(null);

		return competenze;
	}

	public List<Curriculum> getCurriculums() {
		return this.curriculums;
	}

	public void setCurriculums(List<Curriculum> curriculums) {
		this.curriculums = curriculums;
	}

	public Curriculum addCurriculum(Curriculum curriculum) {
		getCurriculums().add(curriculum);
		curriculum.setDipendente(this);

		return curriculum;
	}

	public Curriculum removeCurriculum(Curriculum curriculum) {
		getCurriculums().remove(curriculum);
		curriculum.setDipendente(null);

		return curriculum;
	}

	public List<Ruolo> getRuolos() {
		return this.ruolos;
	}

	public void setRuolos(List<Ruolo> ruolos) {
		this.ruolos = ruolos;
	}

	public Ruolo addRuolo(Ruolo ruolo) {
		getRuolos().add(ruolo);
		ruolo.setDipendente(this);

		return ruolo;
	}

	public Ruolo removeRuolo(Ruolo ruolo) {
		getRuolos().remove(ruolo);
		ruolo.setDipendente(null);

		return ruolo;
	}

}