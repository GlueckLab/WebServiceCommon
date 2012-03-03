package edu.ucdenver.bios.webservice.common.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Category implements Serializable
{
    private static final long serialVersionUID = -4943061399348979383L;
    
    /*--------------------
	 * Member Variables
	 *--------------------*/
	private int id;
	@ManyToOne
	@Column(name="idBetweenParticipant")
	private BetweenParticipantFactor betweenParticipantFactor;
	@Column(name="category")
	private String category = null;	
	/*--------------------
	 * Constructors
	 *--------------------*/
	public Category(){}
	
	public Category(String category)
	{
		this.category = category;
	}
	/*--------------------
	 * Getter/Setter Methods
	 *--------------------*/
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BetweenParticipantFactor getBetweenParticipantFactor() {
		return betweenParticipantFactor;
	}

	public void setBetweenParticipantFactor(
			BetweenParticipantFactor betweenParticipantFactor) {
		this.betweenParticipantFactor = betweenParticipantFactor;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}	
}
