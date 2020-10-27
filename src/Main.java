import org.xml.sax.*;
import org.xml.sax.helpers.XMLReaderFactory;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        try {
            XMLReader parser = XMLReaderFactory.createXMLReader();
            ContentHandler handler = new TextExtractor();
            parser.setContentHandler(handler);

            parser.parse(args[0]);
            System.out.println(args[0] + " is well-formed.");
            System.out.print("SAX parse time:");
            System.out.print(System.currentTimeMillis());
        }
        catch (SAXException e) {
            System.out.println(args[0] + " is not well-formed.");
        }
    }

}