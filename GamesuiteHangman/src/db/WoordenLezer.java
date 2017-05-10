package db;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import javax.swing.JOptionPane;

import domain.WoordenLijst;

public class WoordenLezer {
	private final static String url = System.getProperty("user.dir") + "\\woorden.txt";
	WoordenLijst woorden;
	
	public WoordenLezer() throws FileNotFoundException{
		initializeWoorden();
	}
	
	private void initializeWoorden() throws FileNotFoundException {
		woorden = new WoordenLijst();
		File file = new File(url);
		Scanner scanner = new Scanner(file);
		String line = "";
		while(scanner.hasNextLine()){
			line += scanner.nextLine();
		}
		scanner.close();
		woorden.voegToeArray(line.split(","));
	}

	public WoordenLijst getWoorden(){
		return woorden;
	}
}
