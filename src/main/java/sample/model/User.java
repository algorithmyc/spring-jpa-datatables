package sample.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * Sample model
 * 
 * @author Damien Arrachequesne
 */
@Entity
public class User {

	@Id
	@GeneratedValue
	@Getter
	@Setter
	@JsonView(DataTablesOutput.View.class)
	private Integer id;

	@Getter
	@Setter
	@JsonView(DataTablesOutput.View.class)
	private String mail;

	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	@JsonView(DataTablesOutput.View.class)
	private UserRole role;

	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	@JsonView(DataTablesOutput.View.class)
	private UserStatus status;

	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name = "id_home")
	@JsonView(DataTablesOutput.View.class)
	private Home home;

	public User() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

}
