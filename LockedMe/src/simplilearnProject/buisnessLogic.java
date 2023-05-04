package simplilearnProject;
import java.io.*;
import java.util.*;

public class buisnessLogic {
Scanner sc = new Scanner(System.in);
protected void addFile() {
	System.out.println("Enter file name to add (with path): ");
	String fileName=sc.nextLine();
	File newFile = new File(fileName);
	try {
		if(newFile.createNewFile()) {
		FileOutputStream fos = new FileOutputStream(fileName);
		System.out.println("Enter the file content: ");
		String content = sc.nextLine();
		byte[] b = content.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("File is saved on given location");
		}
		else {
			System.out.println("file '"+fileName+"' already exists.");
	}
	}
	catch(Exception e) {
		System.out.println("Failed to create "+fileName+" file.");
		e.printStackTrace();
	}
}
protected void deleteFile() {
	System.out.println("Enter the file name to delete (with path): ");
	String fileName = sc.nextLine();
	try {
		File file = new File(fileName);
		if(file.isDirectory()) {
			System.out.println(file.getName()+" is a directory");
		}
		else if(file.delete())
				System.out.println("File '" +fileName+ "' deleted successfully.");
			else
				System.out.println("Failed to delete '" +fileName + "' file.");
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
protected void searchFile() {
	System.out.println("Enter the directory path: ");
	String path = sc.nextLine();
	System.out.println("Enter the file name to search: ");
	String fileName = sc.nextLine();
	File file = new File(path);
	String[] list = file.list();
	boolean flag = false;
	for(int i=0;i<list.length;i++) {
		if(fileName.equals(list[i]))
			flag = true;
	}
	if(flag)
		System.out.println("file found");
	else
		System.out.println("file not found");
}
protected void sortFileNames() {
	System.out.println("Enter a path");
	String path = sc.nextLine();
	File file = new File(path);
	File[] files = file.listFiles();
	Arrays.sort(files);
	
	if(files.length>0) {
		System.out.println("files are: ");
		for(File f : files) {
			System.out.println(f.getName());
		}
	}
	else
		System.out.println("The root directory is empty");
}
}