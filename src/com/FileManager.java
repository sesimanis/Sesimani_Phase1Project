package com;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileManager {
	private String[] arrfiles;
	File directory = new File("C:\\Users\\Sinalo Sesimani\\Desktop\\my_files");
	public void display_Files(){
		arrfiles = directory.list();
		Arrays.sort(arrfiles);
		System.out.println("files");
		for(int x = 0; x <arrfiles.length; x ++) {
			System.out.println(arrfiles[x]);
		}
	}
public void searchfile(String filename) {
	File searchfile = new File(directory+"\\"+filename);
	if(searchfile.exists()) {
		System.out.println("file exist");
	} else {
		System.out.println("file does not exist");
	}
}
public void createnewfile(String filename)throws IOException {
	File newfile = new File(directory+"\\"+filename);
	if (newfile.exists()) {
		System.out.println("file already exist");
	}else {
		newfile.createNewFile();
		System.out.println("file created succesfully");
	}
}
public void delete(String filename)throws IOException{
	File deletedfile = new File(directory+"\\"+filename);
	if (deletedfile.exists()) {
		deletedfile.delete();
		System.out.println("file deleted");
		
	}else {
		System.out.println("file does not exist");
	}
}
}