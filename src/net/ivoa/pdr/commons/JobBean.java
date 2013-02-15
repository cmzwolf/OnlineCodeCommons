package net.ivoa.pdr.commons;

import java.util.List;
import java.util.Map;

/**
 * @author Carlo Maria Zwolf
 * Observatoire de Paris
 * LERMA
 */

public class JobBean {



	public Integer getIdJob() {
		return IdJob;
	}
	public Integer getIdService() {
		return IdService;
	}
	public Map<Integer, String> getUserToNotify() {
		return userToNotify;
	}
	
	public Map<String, String> getJobConfiguration() {
		return jobConfiguration;
	}
	public Map<String,String> getJobResults() {
		return jobResults;
	}
	public List<String> getJobErrors() {
		return jobErrors;
	}
	public boolean isJobProcessed() {
		return jobProcessed;
	}
	public boolean isJobfinished() {
		return jobfinished;
	}
	public boolean isJobValid() {
		return jobValid;
	}
	public String getDemandDate() {
		return demandDate;
	}
	public String getProcessingDate() {
		return processingDate;
	}
	public String getFinishingDate() {
		return finishingDate;
	}
	public void setIdJob(Integer idJob) {
		IdJob = idJob;
	}
	public void setIdService(Integer idService) {
		IdService = idService;
	}
	public void setUserToNotify(Map<Integer, String> userToNotify) {
		this.userToNotify = userToNotify;
	}
	
	public void setJobConfiguration(Map<String, String> jobConfiguration) {
		this.jobConfiguration = jobConfiguration;
	}
	public void setJobResults(Map<String,String> jobResults) {
		this.jobResults = jobResults;
	}
	public void setJobErrors(List<String> jobErrors) {
		this.jobErrors = jobErrors;
	}
	public void setJobProcessed(boolean jobProcessed) {
		this.jobProcessed = jobProcessed;
	}
	public void setJobfinished(boolean jobfinished) {
		this.jobfinished = jobfinished;
	}
	public void setJobValid(boolean jobValid) {
		this.jobValid = jobValid;
	}
	public void setDemandDate(String demandDate) {
		this.demandDate = demandDate;
	}
	public void setProcessingDate(String processingDate) {
		this.processingDate = processingDate;
	}
	public void setFinishingDate(String finishingDate) {
		this.finishingDate = finishingDate;
	}
	public void setUserAskedThisJob(List<List<String>> userAskedThisJob) {
		this.userAskedThisJob = userAskedThisJob;
	}
	public List<List<String>> getUserAskedThisJob() {
		return userAskedThisJob;
	}
	private Integer IdJob;
	private Integer IdService;
	private Map<Integer,String> userToNotify;
	private List<List<String>> userAskedThisJob;
	private Map<String,String> jobConfiguration;
	private Map<String,String> jobResults;
	private List<String> jobErrors;
	private boolean jobProcessed;
	private boolean jobfinished;
	private boolean jobValid;
	private String demandDate;
	private String processingDate;
	private String finishingDate;
	
}
