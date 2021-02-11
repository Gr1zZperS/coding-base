package ood.patterns.creational.factoryMethod;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

public class DocxDocument implements InputDocument{

    @Override
    public String readData(String fileName) {
        try(FileInputStream fis = new FileInputStream(new File(fileName).getAbsolutePath())) {

            XWPFDocument document = new XWPFDocument(fis);
            List<XWPFParagraph> paragraphs = document.getParagraphs();

            StringBuilder sb = new StringBuilder();

            for (XWPFParagraph para : paragraphs) {
                sb.append(para.getText());
                sb.append(System.lineSeparator());
            }

            return sb.toString();

        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

}
