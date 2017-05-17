package persistence;

import model.Place;

public class DaoPlace {
	
	private static final int NAME_LENGHT = 30;
	public static final int RECORD_SIZE=180;
	private byte[] departamentCode;
	private byte[] nameDepartment;
	private byte[] cityCode;
	private byte[] cityName;
	
	public DaoPlace(String departamentCode, String nameDepartment, String cityCode, String cityName) {
		this.departamentCode = this.stringToArray(departamentCode, NAME_LENGHT);
		this.nameDepartment = this.stringToArray(nameDepartment, NAME_LENGHT);
		this.cityCode = this.stringToArray(cityCode, NAME_LENGHT);
		this.cityName = this.stringToArray(cityName, NAME_LENGHT);
	}
	
	public DaoPlace(Place place) {
		this.departamentCode = this.stringToArray(place.getDepartamentCode(),NAME_LENGHT);
        this.nameDepartment = this.stringToArray(place.getNameDepartment(),NAME_LENGHT);
        this.cityCode = this.stringToArray(place.getCityCode(),NAME_LENGHT);
        this.cityName = this.stringToArray(place.getCityName(),NAME_LENGHT);
    }

	public byte[] stringToArray(String string,int size){
        byte[] array=new byte[size];
        for (int i = 0; i <Math.min(string.length(),size) ; i++) {
            array[i]= (byte)string.charAt(i);
        }
        return array;
    }
    
	public byte[] getDepartamentCode() {
		return departamentCode;
	}

	public void setDepartamentCode(String departamentCode) {
		this.departamentCode = this.stringToArray(departamentCode, NAME_LENGHT);
	}

	public byte[] getNameDepartment() {
		return nameDepartment;
	}
	

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = stringToArray(nameDepartment, NAME_LENGHT);
	}

	public byte[] getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = stringToArray(cityCode, NAME_LENGHT);
	}

	public byte[] getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = stringToArray(cityName, NAME_LENGHT);
	}
}