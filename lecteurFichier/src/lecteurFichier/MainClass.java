package lecteurFichier;
import java.io.*;

public class MainClass {

	public static void main(String[] args) throws IOException {
		//*******************************Changer ces 2 fichiers et les remplacer par les siens***********************
		File file = new File("/home/ayoub/test.txt");
		File file2 = new File("/home/ayoub/test2.txt");
		TxtReader txt = new TxtReader();
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("////////////////////AFFICHAGE NORMAL//////////////////////");
		txt.readFile(file);
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("////////////////////AFFICHAGE AVEC LIGNES A L ENVERS//////////////////////");
		txt.readFileLinesReverse(file);
		System.out.println("/////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("/////////////////AFFICHAGE AVEC MOT PALINDROMIQUE///////////////////////////////");
		txt.readFileWordsReverse(file);
		System.out.println("/////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("//////////////////////////////////////////");
		System.out.println("/////////////////DIFFERENCE ENTRE 2 FICHIERS///////////////////////////////");
		txt.diff(file, file2);
	}

}
