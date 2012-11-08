package net.ivoa.pdr.commons;

/**
 * @author Carlo Maria Zwolf
 * Observatoire de Paris
 * LERMA
 */

public class IOFile {
	public IOFile(String filePattern, String fikeExtension, String fileDirectory) {
		super();
		this.filePattern = filePattern;
		this.fikeExtension = fikeExtension;
		this.fileDirectory = fileDirectory;
	}
	public String getFilePattern() {
		return filePattern;
	}
	public String getFikeExtension() {
		return fikeExtension;
	}
	public String getFileDirectory() {
		return fileDirectory;
	}
	public void setFilePattern(String filePattern) {
		this.filePattern = filePattern;
	}
	public void setFikeExtension(String fikeExtension) {
		this.fikeExtension = fikeExtension;
	}
	public void setFileDirectory(String fileDirectory) {
		this.fileDirectory = fileDirectory;
	}
	private String filePattern;
	private String fikeExtension;
	private String fileDirectory;
}
