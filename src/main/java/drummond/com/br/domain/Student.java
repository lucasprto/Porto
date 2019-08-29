package drummond.com.br.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	private Integer ra;
	private String name;
	private String email;
	
	@Id
	public Integer getRa() {
		return ra;
	}
	public void setRa(Integer ra) {
		this.ra = ra;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
