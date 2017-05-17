package model;

public class Place {
	
	private String departamentCode;
	private String nameDepartment;
	private String cityCode;
	private String cityName;
	
	public Place(String departamentCode, String nameDepartment, String cityCode, String cityName) {
		this.departamentCode = departamentCode;
		this.nameDepartment = nameDepartment;
		this.cityCode = cityCode;
		this.cityName = cityName;
	}

	public String getDepartamentCode() {
		return departamentCode;
	}

	public void setDepartamentCode(String departamentCode) {
		this.departamentCode = departamentCode;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
}