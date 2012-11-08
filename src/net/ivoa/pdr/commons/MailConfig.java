package net.ivoa.pdr.commons;

/**
 * @author Carlo Maria Zwolf
 * Observatoire de Paris
 * LERMA
 */

public class MailConfig {
	public String getServerName() {
		return serverName;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return Password;
	}
	public String getFromAdress() {
		return fromAdress;
	}
	public String getFromLabel() {
		return fromLabel;
	}
	public String getLabel() {
		return label;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public void setFromAdress(String fromAdress) {
		this.fromAdress = fromAdress;
	}
	public void setFromLabel(String fromLabel) {
		this.fromLabel = fromLabel;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	private String serverName;
	private String userName;
	private String Password;
	private String fromAdress;
	private String fromLabel;
	private String label;
	private String subject;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
