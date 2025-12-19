import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class PdftoCsv {
    public static void main(String[] args) throws Exception {

        PDDocument pd= PDDocument.load(new File("employees.pdf"));

        PDFTextStripper st=new PDFTextStripper();
        String text= st.getText(pd);


        pd.close();

        BufferedWriter br=new BufferedWriter(new FileWriter("output.csv"));

        String[]lines=text.split("/n");


        for(String l : lines){
            l=l.trim();

            if(!l.isEmpty()){
                l=l.replaceAll(" +" ," ");
                br.write(l);
                br.flush();
            }
        }
        br.close();

        System.out.println("PDF Successfully converted to CSV file");

    }

}




