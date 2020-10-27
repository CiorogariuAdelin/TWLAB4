import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class DOMCreatorExample {

    public static void main(String[] av) throws IOException {
        DOMCreatorExample dc = new DOMCreatorExample();
        Document doc = dc.makeXML();
    }

    public Document makeXML() {
        try {
            DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
            DocumentBuilder parser = fact.newDocumentBuilder();
            Document doc = parser.newDocument();

            Node root = doc.createElement("Queue");
            Node altele1 = doc.createElement("altele");
            Node altele2 = doc.createElement("altele");
            Node altele3 = doc.createElement("altele");
            Node altele4 = doc.createElement("altele");
            Node altele5 = doc.createElement("altele");
            Node altele6 = doc.createElement("altele");
            Node altele7 = doc.createElement("altele");
            Node altele8 = doc.createElement("altele");
            Node altele9= doc.createElement("altele");
            Node altele10 = doc.createElement("altele");

            doc.appendChild(root);

            Node Persoana = doc.createElement("Persoana1");
            ((Element) Persoana).setAttribute("name", "Ionel");
            ((Element) Persoana).setAttribute("Varsta", "20");
            ((Element) Persoana).setAttribute("inaltime", "1.80m");
            ((Element) Persoana).setAttribute("greutate", "90kg");
            Persoana.appendChild(altele1);
            ((Element) altele1).setAttribute("rec1", "Angajat");
            ((Element) altele1).setAttribute("rec2", "Necasatorit");
            ((Element) altele1).setAttribute("rec3", "Fumator");
            Persoana.appendChild(doc.createTextNode("Persoana 1:"));
            root.appendChild(Persoana);

            Node Persoana2 = doc.createElement("Persoana2");
            ((Element) Persoana2).setAttribute("name", "Dan");
            ((Element) Persoana2).setAttribute("Varsta", "15");
            ((Element) Persoana2).setAttribute("inaltime", "1.60m");
            ((Element) Persoana2).setAttribute("greutate", "49kg");
            Persoana2.appendChild(altele2);
            ((Element) altele2).setAttribute("rec1", "NeAngajat");
            ((Element) altele2).setAttribute("rec2", "Necasatorit");
            ((Element) altele2).setAttribute("rec3", "Nefumator");
            Persoana2.appendChild(doc.createTextNode("Persoana 2:"));
            root.appendChild(Persoana2);

            Node Persoana3 = doc.createElement("Persoana3");
            ((Element) Persoana3).setAttribute("name", "Andrei");
            ((Element) Persoana3).setAttribute("Varsta", "25");
            ((Element) Persoana3).setAttribute("inaltime", "1.65m");
            ((Element) Persoana3).setAttribute("greutate", "77kg");
            Persoana3.appendChild(altele3);
            ((Element) altele3).setAttribute("rec1", "Angajat");
            ((Element) altele3).setAttribute("rec2", "Necasatorit");
            ((Element) altele3).setAttribute("rec3", "Nefumator");
            Persoana3.appendChild(doc.createTextNode("Persoana 3:"));
            root.appendChild(Persoana3);

            Node Persoana4 = doc.createElement("Persoana4");
            ((Element) Persoana4).setAttribute("name", "Mirel");
            ((Element) Persoana4).setAttribute("Varsta", "30");
            ((Element) Persoana4).setAttribute("inaltime", "1.83m");
            ((Element) Persoana4).setAttribute("greutate", "86kg");
            Persoana4.appendChild(altele4);
            ((Element) altele4).setAttribute("rec1", "Angajat");
            ((Element) altele4).setAttribute("rec2", "Casatorit");
            ((Element) altele4).setAttribute("rec3", "Fumator");
            Persoana4.appendChild(doc.createTextNode("Persoana 4:"));
            root.appendChild(Persoana4);

            Node Persoana5 = doc.createElement("Persoana5");
            ((Element) Persoana5).setAttribute("name", "Lucian");
            ((Element) Persoana5).setAttribute("Varsta", "36");
            ((Element) Persoana5).setAttribute("inaltime", "1.74m");
            ((Element) Persoana5).setAttribute("greutate", "74kg");
            Persoana5.appendChild(altele5);
            ((Element) altele5).setAttribute("rec1", "Angajat");
            ((Element) altele5).setAttribute("rec2", "Casatorit");
            ((Element) altele5).setAttribute("rec3", "Fumator");
            Persoana5.appendChild(doc.createTextNode("Persoana 5:"));
            root.appendChild(Persoana5);

            Node Persoana6 = doc.createElement("Persoana6");
            ((Element) Persoana6).setAttribute("name", "Adrian");
            ((Element) Persoana6).setAttribute("Varsta", "21");
            ((Element) Persoana6).setAttribute("inaltime", "1.80m");
            ((Element) Persoana6).setAttribute("greutate", "55kg");
            Persoana6.appendChild(altele6);
            ((Element) altele6).setAttribute("rec1", "Neangajat");
            ((Element) altele6).setAttribute("rec2", "Necasatorit");
            ((Element) altele6).setAttribute("rec3", "Nefumator");
            Persoana6.appendChild(doc.createTextNode("Persoana 6:"));
            root.appendChild(Persoana6);

            Node Persoana7 = doc.createElement("Persoana7");
            ((Element) Persoana7).setAttribute("name", "Dorel");
            ((Element) Persoana7).setAttribute("Varsta", "13");
            ((Element) Persoana7).setAttribute("inaltime", "1.40m");
            ((Element) Persoana7).setAttribute("greutate", "60kg");
            Persoana7.appendChild(altele7);
            ((Element) altele7).setAttribute("rec1", "Neangajat");
            ((Element) altele7).setAttribute("rec2", "Necasatorit");
            ((Element) altele7).setAttribute("rec3", "Nefumator");
            Persoana7.appendChild(doc.createTextNode("Persoana 7:"));
            root.appendChild(Persoana7);

            Node Persoana8 = doc.createElement("Persoana8");
            ((Element) Persoana8).setAttribute("name", "Darius");
            ((Element) Persoana8).setAttribute("Varsta", "26");
            ((Element) Persoana8).setAttribute("inaltime", "1.63m");
            ((Element) Persoana8).setAttribute("greutate", "60kg");
            Persoana8.appendChild(altele8);
            ((Element) altele8).setAttribute("rec1", "Neangajat");
            ((Element) altele8).setAttribute("rec2", "Necasatorit");
            ((Element) altele8).setAttribute("rec3", "Fumator");
            Persoana8.appendChild(doc.createTextNode("Persoana 8:"));
            root.appendChild(Persoana8);

            Node Persoana9 = doc.createElement("Persoana9");
            ((Element) Persoana9).setAttribute("name", "Daniel");
            ((Element) Persoana9).setAttribute("Varsta", "18");
            ((Element) Persoana9).setAttribute("inaltime", "1.80m");
            ((Element) Persoana9).setAttribute("greutate", "70kg");
            Persoana9.appendChild(altele9);
            ((Element) altele9).setAttribute("rec1", "Neangajat");
            ((Element) altele9).setAttribute("rec2", "Necasatorit");
            ((Element) altele9).setAttribute("rec3", "Nefumator");
            Persoana9.appendChild(doc.createTextNode("Persoana 9:"));
            root.appendChild(Persoana9);

            Node Persoana0 = doc.createElement("Persoana10");
            ((Element) Persoana0).setAttribute("name", "Alex");
            ((Element) Persoana0).setAttribute("Varsta", "26");
            ((Element) Persoana0).setAttribute("inaltime", "1.80m");
            ((Element) Persoana0).setAttribute("greutate", "90kg");
            Persoana0.appendChild(altele10);
            ((Element) altele10).setAttribute("rec1", "Angajat");
            ((Element) altele10).setAttribute("rec2", "Casatorit");
            ((Element) altele10).setAttribute("rec3", "Nefumator");
            Persoana0.appendChild(doc.createTextNode("Persoana 10:"));
            root.appendChild(Persoana0);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\Users\\40747\\IdeaProjects\\DomLab5TW\\src\\result.xml"));
            transformer.transform(source, result);
            return doc;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
