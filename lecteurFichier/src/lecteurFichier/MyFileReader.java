package lecteurFichier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class MyFileReader implements FileReaderImpl{
	
	
	 public void readFile(File file) {
		 try  
		 {  
		 FileReader fr=new FileReader(file); 
		 BufferedReader br=new BufferedReader(fr);  
		 StringBuffer sb=new StringBuffer();  
		 String line;  
		 while((line=br.readLine())!=null)  
		 {  
			 sb.append(line); 
			 sb.append("\n");
		 }  
		 	fr.close();
		 	System.out.println("Contents of File: " );  
		 	System.out.println(sb.toString());
		 }  
		 catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	 }
	 
	 
	 public void readFileLinesReverse(File file) {
		 try  
		 {  
		 FileReader fr=new FileReader(file); 
		 BufferedReader br=new BufferedReader(fr);  
		 StringBuffer sb=new StringBuffer();  
		 String line;  
		 while((line=br.readLine())!=null)  
		 {  
			 sb.insert(0, line+"\n"); 
			 //sb.append("\n");
		 }  
		 	fr.close();
		 	System.out.println("Contents of File: ");  
		 	System.out.println(sb.toString());
		 }  
		 catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	 }
	 
	 public void readFileWordsReverse(File file) {
		 try  
		 {  
		 FileReader fr=new FileReader(file); 
		 BufferedReader br=new BufferedReader(fr);  
		 StringBuffer sb=new StringBuffer();  
		 String line;  
		 while((line=br.readLine())!=null)  
		 {  
			 String lineWithWordsReverse = "";
			 
			 for (int i = line.length() - 1; i >=0; i--) {
				 lineWithWordsReverse += line.charAt(i);
			 }
			 sb.append(lineWithWordsReverse);
			 sb.append("\n");
		 }  
		 	fr.close();
		 	System.out.println("Contents of File: ");  
		 	System.out.println(sb.toString());
		 }  
		 catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	 }
	 
	 public void diff(File file1, File file2) {
		 try  
		 {  
		 FileReader fr1=new FileReader(file1);
		 FileReader fr2=new FileReader(file2); 
		 BufferedReader br1=new BufferedReader(fr1);
		 BufferedReader br2=new BufferedReader(fr2);
		 StringBuffer sb1=new StringBuffer();
		 StringBuffer sb2=new StringBuffer();
		 
		 String line1 = "";  
		 String line2 = "";
		 int i = 0;
		 String response = "";
		 
		 while((line1=br1.readLine())!=null && (line2=br2.readLine())!=null)  
		 {  
			 if(!line1.equals(line2)) {
				 response += "Difference a la ligne " + i++ + "\n";
				 response += "=> File 1 : " + line1 + "\n";
				 response += "=> File 2 : " + line2 + "\n";
			 }
		 }  
		 	fr1.close();
		 	fr2.close();
		 	
		 	System.out.println(response);
		 }  
		 catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	 }
	 
	
}
