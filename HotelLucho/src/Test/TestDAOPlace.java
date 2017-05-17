/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Persistence.DAOPlace;
import model.Place;

/**
 *
 * @author RA302
 */
public class TestDAOPlace {
    public static void main(String[] args) {
        Place place0=new Place(57,(byte)1,"Colombia","COL",null);
        Place place1 =new Place(001,(byte)3,"Tunja","TUN",null);
        Place place2=new Place(15,(byte)2,"Boyaca","BY",place0);
        place1.setParent(place2);
//        
//        DAOPlace dAOPlace=new DAOPlace(place0);
//        System.out.println("name: "+dAOPlace.getName()+" "+dAOPlace.getName().length());
//        dAOPlace.setName("este es un nombre demasiao largo, de mas de 20");
//        System.out.println("name "+dAOPlace.getName()+" "+dAOPlace.getName().length());
    }
    
}
