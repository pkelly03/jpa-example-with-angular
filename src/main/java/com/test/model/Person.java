/**
 * 
 */
package com.test.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Models a Person.
 * @author bphillips
 *
 */
@Entity
@Table(name="person")
@NamedQuery(name="person.findByEmplid", query="from Person where emplid = :emplid")
public class Person implements Serializable {

	private static final long serialVersionUID = 3697535594187479699L;

	private Long emplid;
	
	private String first_name;
	
	private String last_name;
	
	@Override
	public String toString() {
		return "Person [emplid=" + emplid + ", first_name=" + first_name
				+ ", last_name=" + last_name + "]";
	}

	@Id
    @GeneratedValue
	public Long getEmplid() {
		return emplid;
	}

	public void setEmplid(Long emplid) {
		this.emplid = emplid;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

}
