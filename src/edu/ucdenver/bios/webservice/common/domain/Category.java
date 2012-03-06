package edu.ucdenver.bios.webservice.common.domain;

import java.io.Serializable;

public class Category implements Serializable
{
    private static final long serialVersionUID = -4943061399348979383L;
    
    /*--------------------
	 * Member Variables
	 *--------------------*/
	private int id;
	private BetweenParticipantFactor betweenParticipantFactor;
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
