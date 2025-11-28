package com.knmodicollege.collegemanagemet.models;

public class Module {
	private String moduleId;
	private String modulename;
	private String description;
	private String duration;
	/*-------------------------*/
	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Module(String moduleId, String modulename, String description, String duration) {
		super();
		this.moduleId = moduleId;
		this.modulename = modulename;
		this.description = description;
		this.duration = duration;
	}
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	public String getModulename() {
		return modulename;
	}
	public void setModulename(String modulename) {
		this.modulename = modulename;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Module Id : " + moduleId 
				+ ", Module Name : " + modulename 
				+ ", Description : " + description
				+ ", Duration : " + duration + "\n--------------\n";
	}

	/*------------------------------*/
	
	
	
}
