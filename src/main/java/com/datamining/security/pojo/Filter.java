package com.datamining.security.pojo;

public class Filter {

	private String environment;
	private String team;
	private String operatingSystem;
	private String departments;
	private String client;
	private String status;

	public Filter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Filter(String environment, String team, String operatingSystem, String departments, String client,
			String status) {
		super();
		this.environment = environment;
		this.team = team;
		this.operatingSystem = operatingSystem;
		this.departments = departments;
		this.client = client;
		this.status = status;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getDepartments() {
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Filter [environment=" + environment + ", team=" + team + ", operatingSystem=" + operatingSystem
				+ ", departments=" + departments + ", client=" + client + ", status=" + status + "]";
	}

}
