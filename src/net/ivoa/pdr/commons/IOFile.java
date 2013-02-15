package net.ivoa.pdr.commons;

/**
 * @author Carlo Maria Zwolf
 * Observatoire de Paris
 * LERMA
 */

public class IOFile {
	public String getResultName() {
		return resultName;
	}
	public void setResultName(String resultName) {
		this.resultName = resultName;
	}
	public IOFile(String filePattern, String fikeExtension, String fileDirectory) {
		super();
		this.filePattern = filePattern;
		this.fileExtension = fikeExtension;
		this.fileDirectory = fileDirectory;
	}
	public String getFilePattern() {
		return filePattern;
	}
	public String getFileExtension() {
		return fileExtension;
	}
	public String getFileDirectory() {
		return fileDirectory;
	}
	public void setFilePattern(String filePattern) {
		this.filePattern = filePattern;
	}
	public void setFileExtension(String fikeExtension) {
		this.fileExtension = fikeExtension;
	}
	public void setFileDirectory(String fileDirectory) {
		this.fileDirectory = fileDirectory;
	}
	private String filePattern;
	private String fileExtension;
	private String fileDirectory;
	private String resultName;
}
