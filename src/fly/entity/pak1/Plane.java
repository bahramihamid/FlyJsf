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
 * هواپیما
 * زمان می تواند پرواز کند که همه ی مسافران سوار شده باشند
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Plane")
public class Plane implements Serializable {
	public Plane() {
	}
	
	@Column(name="Id", nullable=false)	
	@Id	
	@GeneratedValue(generator="FLY_ENTITY_PAK1_PLANE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FLY_ENTITY_PAK1_PLANE_ID_GENERATOR", strategy="native")	
	private Long id;
	
	@Column(name="Type", nullable=true, length=255)	
	private String type;
	
	@OneToMany(mappedBy="plane", targetEntity=fly.entity.pak1.Fly.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set<fly.entity.pak1.Fly> fly = new java.util.HashSet<fly.entity.pak1.Fly>();
	
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return type;
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
	
	public void setFly(java.util.Set<fly.entity.pak1.Fly> value) {
		this.fly = value;
	}
	
	public java.util.Set<fly.entity.pak1.Fly> getFly() {
		return fly;
	}
	
	
	public void take_off() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void land() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
