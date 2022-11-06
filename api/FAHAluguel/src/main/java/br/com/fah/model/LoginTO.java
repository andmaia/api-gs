package br.com.fah.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LoginTO {
	private String email;
	private String login;
	
	public LoginTO(String email, String login) {
		
		this.email=email;
		this.login=login;
	}
	
	public LoginTO() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email=email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login=login;
	}
	
	
}

