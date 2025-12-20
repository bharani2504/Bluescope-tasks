import java.io.*;
import java.io.File;
import java.time.LocalDate;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("C:\\Users\\bhara\\Downloads\\employees.xlsx");
        Workbook book = new XSSFWorkbook(fis);
        Sheet sheet = book.getSheetAt(0);


        int lastRow = sheet.getLastRowNum();
        Row newRow = sheet.createRow(lastRow + 1);

        newRow.createCell(0).setCellValue(151);
        newRow.createCell(1).setCellValue("Bharani");
        newRow.createCell(2).setCellValue("Male");
        newRow.createCell(3).setCellValue(98000);
        newRow.createCell(4).setCellValue(LocalDate.now().toString());

        fis.close();

        FileOutputStream fos = new FileOutputStream("C:\\Users\\bhara\\Downloads\\employees.xlsx");
        book.write(fos);

        fos.close();
        book.close();

        System.out.println("New row added successfully!");
    }
}

class ex{


    public  static  void  main (String[] args) throws IOException {

        FileInputStream FS=new FileInputStream("C:\\Users\\bhara\\Downloads\\employees.xlsx");
        Workbook book=new XSSFWorkbook(FS);

        Sheet sc=book.getSheetAt(0);

        book.close();

        BufferedWriter br= new BufferedWriter(new FileWriter("Output.csv"));
        String[]lines= new String[]{sc.toString()};


        for(String l : lines){
            l=l.trim();

            if(!l.isEmpty()){
                l=l.replaceAll(" +" ," ");
                br.write(l);
                br.flush();
            }
        }
        br.close();

        System.out.println("Excel Successfully converted to CSV file");

    }



        }
