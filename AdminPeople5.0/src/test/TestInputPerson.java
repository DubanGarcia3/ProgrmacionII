/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import UI.TTI.InputPerson;
import exception.MenuInputException;
import model.Gender;

/**
 *
 * @author L304
 */
public class TestInputPerson {
    public static void main(String[] args) {
        InputPerson inputPerson = new InputPerson();
        Gender gender;
        gender = inputPerson.captureGender();
		System.out.println("Eligio "+gender);
        
        inputPerson.captureBirthDay();
    }
}
