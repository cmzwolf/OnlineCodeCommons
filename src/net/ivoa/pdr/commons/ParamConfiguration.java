package net.ivoa.pdr.commons;

/**
 * @author Carlo Maria Zwolf
 * Observatoire de Paris
 * LERMA
 */

import java.util.Map;

public class ParamConfiguration {
	public ParamConfiguration(Map<String, String> paramMap) {
		super();
		this.paramMap = paramMap;
	}

	public Map<String, String> getParamMap() {
		return paramMap;
	}

	public void setParamMap(Map<String, String> paramMap) {
		this.paramMap = paramMap;
	}

	private Map<String,String> paramMap;
}
