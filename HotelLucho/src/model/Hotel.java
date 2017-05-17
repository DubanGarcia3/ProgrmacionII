/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author RA302
 */
public class Hotel {
	
    private String name;
    private String nameLarge;
    private String adress;
    private Place lugar;
    private String telephone;
    private String url;
    private String email;
    
	public Hotel(String name, String nameLarge, String adress, Place lugar, String telephone, String url, String email) {
		this.name = name;
		this.nameLarge = nameLarge;
		this.adress = adress;
		this.lugar = lugar;
		this.telephone = telephone;
		this.url = url;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameLarge() {
		return nameLarge;
	}

	public void setNameLarge(String nameLarge) {
		this.nameLarge = nameLarge;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Place getLugar() {
		return lugar;
	}

	public void setLugar(Place lugar) {
		this.lugar = lugar;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
