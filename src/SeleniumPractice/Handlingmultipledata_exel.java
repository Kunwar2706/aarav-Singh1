package SeleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Handlingmultipledata_exel {

	

	public static void main(String[] args) throws FileNotFoundException {
FileInputStream fis=new FileInputStream("./data/textscrit.xlsx");
  
  wb = WorkbookFactory.create(fis);
	}

}
