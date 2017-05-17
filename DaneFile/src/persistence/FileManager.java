package persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	
	public static final String PATH = "src/files/city.txt";
	private List<String> listText;
	
	public FileManager() {
		listText = new ArrayList<>();
	}
	
	public List<String> readFile() throws IOException{
		List<String> listLines;
		listLines = Files.readAllLines(Paths.get("src/files/city.txt"), StandardCharsets.ISO_8859_1);
		return listLines;		
	}
	
	public void readSomeText() throws IOException{
		File file = new File(PATH);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null){
			listText.add(line);
		}
		buffer.close();
	}
}