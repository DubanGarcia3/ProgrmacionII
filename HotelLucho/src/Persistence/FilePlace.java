/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Place;

/**
 *
 * @author RA302
 */
public class FilePlace {
    private String fileName;
    private File file;
    private RandomAccessFile randomAccessFile;
    
    public FilePlace(String fileName){
        this.file=new File(fileName);
    }
    public void open(String mode){
        try {
            randomAccessFile=new RandomAccessFile(file, mode);
        } catch (FileNotFoundException ex) {
        }
    }
    public void close(){
        try {
            randomAccessFile.close();
        } catch (IOException ex) {
        }
    }

    public void save(Place place, int index){
        DAOPlace dAOPlace = new DAOPlace(place);
//     System.out.println("Codigo leido es "+dAOPlace.getCode());
//     System.out.println("nivel leido es "+dAOPlace.getLevel());
//     System.out.println("nom leido es "+dAOPlace.getName());
//     System.out.println("abre leido es "+dAOPlace.getAbreviate());
//     System.out.println("pare leido es "+dAOPlace.getCodeParent());
        try {
            randomAccessFile.seek(index*DAOPlace.RECORD_SIZE);
            randomAccessFile.writeInt(dAOPlace.getCode());
            randomAccessFile.writeByte(dAOPlace.getLevel());
            randomAccessFile.write(dAOPlace.getName()); // 
            randomAccessFile.write(dAOPlace.getAbreviate()); // array
            randomAccessFile.writeLong(dAOPlace.getCodeParent());
        } catch (IOException ex) {
          
        }
    }

    public Place load(int index){
        DAOPlace dAOPlace = new DAOPlace();
        try {
            randomAccessFile.seek(index * DAOPlace.RECORD_SIZE);
            dAOPlace.setCode(randomAccessFile.readInt());
            dAOPlace.setLevel(randomAccessFile.readByte());
            byte[] data = new byte[DAOPlace.NAME_LENGHT];
            randomAccessFile.read(data);
            dAOPlace.setName(data); // array 
            byte[] data2 = new byte[DAOPlace.NAME_LENGHT];
            randomAccessFile.read(data2);
            dAOPlace.setAbreviate(data2); // array
            dAOPlace.setCodeParent(randomAccessFile.readLong());
        } catch (IOException ex) {
        }
//     System.out.println("Codigo leido es "+dAOPlace.getCode());
//     System.out.println("nivel leido es "+dAOPlace.getLevel());
//     System.out.println("nom leido es "+dAOPlace.getName());
//     System.out.println("abre leido es "+dAOPlace.getAbreviate());
//     System.out.println("pare leido es "+dAOPlace.getCodeParent());
        
     return dAOPlace.BintoPlace();  
   }
    
    public void bubleSort(){
    	this.open("rw");
    	Place place1, place2;
    	boolean isSorted = false;
    	while (!isSorted) {
    		isSorted = true;
    		for (int i = 0; i < this.file.length()/DAOPlace.RECORD_SIZE; i++) {
    			place1 = this.load(i);
    			place2 = this.load(i+1);
    			if (place1.getName().compareTo(place2.getName())>0) {
    				this.save(place2, i);
    				this.save(place1, i+1);
    				isSorted = false;
    			} else {
    				
    			}    		
    		}
    	}
    	this.close();
    }
}
