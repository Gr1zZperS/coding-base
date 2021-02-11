package ood.patterns.creational.factoryMethod;

public class InputDocumentProvider {

    InputDocument createDocument(String extension) {
        if(extension.equals("txt")) {
            return new TxtDocument();
        } else if (extension.equals("docx")) {
            return new DocxDocument();
        } else {
            throw new IllegalArgumentException(String.format("No supportable document format  - '%s'.", extension));
        }
    }

}
