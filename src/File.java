import java.io.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class File {
    public static void main(String[] args) throws IOException {

        FileInputStream fs= new FileInputStream("C:\\Users\\bhara\\Downloads\\employees.xlsx");

        Workbook book = new XSSFWorkbook(fs);

        Sheet sh = book.getSheetAt(0);

        double highestsalaryF=Double.MIN_VALUE;
        double lowestSalaryM=Double.MAX_VALUE;

        String nameF=" ";
        String nameM=" ";

        for(int i=1;i<=sh.getLastRowNum();i++){


            Row row=sh.getRow(i);

            int id = (int) row.getCell(0).getNumericCellValue();
            String name =row.getCell(1).getStringCellValue();
            String gender =row.getCell(2).getStringCellValue();
            Double salary=row.getCell(3).getNumericCellValue();

            if(gender.equalsIgnoreCase("female")) {
                if (salary > highestsalaryF) {
                    highestsalaryF = salary;
                    nameF = name;
                }
            }

            if(gender.equalsIgnoreCase("male")) {
                if (salary < lowestSalaryM) {
                    lowestSalaryM = salary;
                    nameM = name;
                }

            }


        }
        System.out.println("highest salary" + " " +highestsalaryF +  ":"+nameF );
        System.out.println("Lowest salary " + " " +lowestSalaryM + " :"+nameM);
    }

}






