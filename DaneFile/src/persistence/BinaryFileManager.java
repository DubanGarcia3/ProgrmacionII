package persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

import model.GroupPlace;
import model.Place;

public class BinaryFileManager {

    private String fileName;
    private File file;
    private RandomAccessFile randomAccessFile;
    
    
    public BinaryFileManager(String fileName){
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
    
    public void save(ArrayList<Place> placeList){
    	for (int i = 0; i < placeList.size(); i++) {
    		DaoPlace dAOPlace = new DaoPlace(placeList.get(i));
    		try {
    			randomAccessFile.seek(i * DaoPlace.RECORD_SIZE);
    			randomAccessFile.write(dAOPlace.getDepartamentCode());
    			randomAccessFile.write(dAOPlace.getNameDepartment());
    			randomAccessFile.write(dAOPlace.getCityCode());
    			randomAccessFile.write(dAOPlace.getCityName());
    		} catch (IOException ex) {
    		}
		}
    }
}
