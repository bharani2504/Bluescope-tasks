import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.File;

public class UpdatePdf {


    public static void main(String[] args) throws Exception {

        PDDocument document = PDDocument.load(new File("employees.pdf"));

        PDPage newPage = new PDPage();
        document.addPage(newPage);

        PDPageContentStream cs = new PDPageContentStream(document, newPage, PDPageContentStream.AppendMode.APPEND,
                true
        );

        cs.setFont(PDType1Font.HELVETICA_BOLD, 14);
        cs.beginText();
        cs.newLineAtOffset(50, 700);

        cs.showText("---- New Employees Added ----");
        cs.newLineAtOffset(0, -30);

        cs.setFont(PDType1Font.HELVETICA, 12);
        cs.showText("151,Bharani,Male,90000");
        cs.newLineAtOffset(0, -20);

        cs.showText("152,Deepa,Female,85000");
        cs.newLineAtOffset(0, -20);

        cs.endText();
        cs.close();

        document.save("employees.pdf");
        document.close();

        System.out.println("Data appended as new page successfully!");
    }

}
