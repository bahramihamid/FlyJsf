/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Faculty of informatics, Burapha University 01
 * License Type: Purchased
 */
package fly.entity.pak1;

import java.io.Serializable;
import javax.persistence.*;
/**
 * فرودگاه
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Airport")
public class Airport implements Serializable {
	public Airport() {
	}
	
	@Column(name="Id", nullable=false)	
	@Id	
	@GeneratedValue(generator="FLY_ENTITY_PAK1_AIRPORT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FLY_ENTITY_PAK1_AIRPORT_ID_GENERATOR", strategy="native")	
	private Long id;
	
	@ManyToOne(targetEntity=fly.entity.pak1.Country.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="CountryId", referencedColumnName="Id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private fly.entity.pak1.Country country;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	private void setId(long value) {
		setId(new Long(value));
	}
	
	private void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return id;
	}
	
	public Long getORMID() {
		return getId();
	}
	
	public void setCountry(fly.entity.pak1.Country value) {
		this.country = value;
	}
	
	public fly.entity.pak1.Country getCountry() {
		return country;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
