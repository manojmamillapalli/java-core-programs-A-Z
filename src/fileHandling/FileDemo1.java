package fileHandling;
import java.io.File;
import java.util.*;
public class FileDemo1 {

	public static void main(String[] args) {
		File f=new File("C://Users//Manoj Naidu//Downloads//filehandling//QueInterface.java");
		System.out.println(f.canRead());
		System.out.println(f.getAbsolutePath());
		File f1=new File("C://Users//Manoj Naidu//Downloads//filehandling//filedemo.txt");
		f.renameTo(f1);
		System.out.println(f.canWrite());
		System.out.println(f.canRead());

	}

}
