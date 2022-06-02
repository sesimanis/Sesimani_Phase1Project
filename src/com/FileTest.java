package com;
import java.util.Scanner;
public class FileTest {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int option = 0;
	String filename;
	FileManager objFile = new FileManager();
	if (!objFile.directory.exists()) {
		objFile.directory.mkdir();
	}
	System.out.println("Hello this application is made by Sinalo Sesimani");
	System.out.println("file manager");
    do {
		System.out.println("main menu");
		System.out.println("option 1: display all files");
		
		System.out.println("option 2: view more options");
		System.out.println("option 3: quite application");
		System.out.println("");
		
		try {
			System.out.println("enter your option");
			option = input.nextInt();
			if (option == 1) {
				objFile.display_Files();
				System.out.println("");
				System.in.read();
			}else if (option == 2 ) {
				int suboption;
				System.out.println("");
				System.out.println("option 1: add a new file ");
				System.out.println("option 2: delete file ");
				System.out.println("option 3: search file ");
				System.out.println("option 4: main menu ");
				
				System.out.println("enter your option");
				suboption = input.nextInt();
				if (suboption == 1 ) {
					System.out.println("enter file name");
					filename = input.next();
					objFile.createnewfile(filename);
					System.in.read();
				}else if (suboption == 2) {
					System.out.println("enter the file you want to delete");
					filename = input.next();
					objFile.delete(filename);
					System.in.read();
				}else if (suboption == 3) {
					System.out.println("enter the file you want to search");
					filename = input.next();
					objFile.searchfile(filename);
					System.in.read();
				}else {
					continue;
				}
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	} while (option != 3);
    System.out.println("application closed");
	}

}
