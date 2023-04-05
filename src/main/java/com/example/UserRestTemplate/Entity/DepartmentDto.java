package com.example.UserRestTemplate.Entity;



public class DepartmentDto {

	private Long departmentid;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
    
    public Long getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(Long departmentid) {
		this.departmentid = departmentid;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	
	public DepartmentDto() {
		
	}
	public DepartmentDto(Long departmentid, String departmentName, String departmentAddress, String departmentCode) {
		this.departmentid = departmentid;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}
	@Override
	public String toString() {
		return "DepartmentDto [departmentid=" + departmentid + ", departmentName=" + departmentName
				+ ", departmentAddress=" + departmentAddress + ", departmentCode=" + departmentCode + "]";
	}
	
	
	
    
    
}
