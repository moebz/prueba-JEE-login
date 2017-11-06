/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedebeans;

import java.io.Serializable;

/**
 *
 * @author win7
 */
public class LoginBean implements Serializable{
	
	private String name;
	
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean autenticacion(){
		return (password.equals("asdf"))?true:false;
	}
	
}
