package net.ivoa.pdr.commons;

/**
 * @author Carlo Maria Zwolf
 * Observatoire de Paris
 * LERMA
 */

public class Service {
	public Integer getIdService() {
		return idService;
	}
	public String getServiceDescription() {
		return serviceDescription;
	}
	public Integer getMaxAuthorizedSimulations() {
		return maxAuthorizedSimulations;
	}
	public void setIdService(Integer idService) {
		this.idService = idService;
	}
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}
	public void setMaxAuthorizedSimulations(Integer maxAuthorizedSimulations) {
		this.maxAuthorizedSimulations = maxAuthorizedSimulations;
	}
	public Service(Integer idService, String serviceDescription,
			Integer maxAuthorizedSimulations) {
		super();
		this.idService = idService;
		this.serviceDescription = serviceDescription;
		this.maxAuthorizedSimulations = maxAuthorizedSimulations;
	}
	private Integer idService;
	private String serviceDescription;
	private Integer maxAuthorizedSimulations;
}
