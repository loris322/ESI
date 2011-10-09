package main.br.usp.esi.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="grade")
public class Grade {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="grade_id", nullable=false)
	private Integer id;
	private String nomePeriodo;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="grade")
	@ForeignKey(name="FK_horario_grade")
	private List<HorarioAula> horarios;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="nome_periodo", nullable=false, length=255)
	public String getNomePeriodo() {
		return nomePeriodo;
	}
	public void setNomePeriodo(String nomePeriodo) {
		this.nomePeriodo = nomePeriodo;
	}
	
	public List<HorarioAula> getHorarios() {
		return horarios;
	}
	public void setHorarios(List<HorarioAula> horarios) {
		this.horarios = horarios;
	}
	
}