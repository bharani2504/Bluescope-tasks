import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.BufferedReader;
import java.io.FileReader;

public class Pdf {


    public static void main(String[] args) throws Exception {

        BufferedReader reader =new BufferedReader(new FileReader("C:\\Users\\bhara\\Downloads\\employees.csv"));

        PDDocument PDF=new PDDocument();
        PDPage pg=new PDPage();

        PDF.addPage(pg);

        PDPageContentStream pd =new PDPageContentStream(PDF,pg);

        pd.setFont(PDType1Font.HELVETICA,12);
        pd.beginText();
        pd.newLineAtOffset(50,700);


        String line="";

        while ((line=reader.readLine())!=null){
            pd.showText(line);
            pd.newLineAtOffset(0,-20);
        }

        pd.endText();
        pd.close();
        PDF.save("employees.pdf");
        PDF.close();
        reader.close();

        System.out.println("CSV File successfully converted into pdf");

    }
}


