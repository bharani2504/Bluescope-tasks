import java.io.*;
import java.time.LocalDate;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateExcel{

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("C:\\Users\\bhara\\Downloads\\employees.xlsx");
        Workbook book = new XSSFWorkbook(fis);
        Sheet sheet = book.getSheetAt(0);

        int targetId = 15;
        boolean found = false;


        fis.close();

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {

            Row row = sheet.getRow(i);

            if (row == null)
                continue;

            Cell idCell = row.getCell(0);
            if (idCell == null)
                continue;

            int excelId = (int) idCell.getNumericCellValue();

            if (excelId == targetId) {


                row.getCell(1).setCellValue("New Name");


                row.getCell(2).setCellValue("Male");


                row.getCell(3).setCellValue(90000);


                row.getCell(4).setCellValue(LocalDate.now().toString());

                found = true;
                System.out.println("ID " + targetId + " updated!");
                break;
            }
        }


        FileOutputStream fos = new FileOutputStream("C:\\Users\\bhara\\Downloads\\employees.xlsx");
        book.write(fos);

        fos.close();
        book.close();

        if (!found)
            System.out.println("Employee ID not found!");
    }
}
