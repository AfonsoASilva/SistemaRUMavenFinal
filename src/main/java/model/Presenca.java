package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="presenca")
public class Presenca {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="data")
	private Date data;
	
	@Column(name="momento")
	private char momento;
	
	/*@ManyToOne(targetEntity=Refeicao.class)
	private Refeicao refeicao;
	
	@ManyToOne(targetEntity=Usuario.class)
	private Usuario usuario;
	
	@ManyToOne(targetEntity=Aluno.class)
	private Aluno aluno;
*/
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public char getMomento() {
		return momento;
	}

	public void setMomento(char momento) {
		this.momento = momento;
	}
	
}
