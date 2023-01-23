package Readingfile;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ReadXMLFileExample1 {
    public static void main(String argv[]) {
        String StudentId;
        String CourseName;
        String InstructorName;
        String CourseDuration;
        String CourseTime;
        String Location;
        String row;

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("result3.csv"));
            writer.write("id,Course Name,Instructor,Course duration,Course time,Location\n");
            //creating a constructor of file class and parsing an XML file
            File file = new File("C:\\Users\\Hewehy\\Downloads\\FWD\\coursedata.xml");
            //an instance of factory that gives a document builder
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            //an instance of builder to parse the specified xml file
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("row");
            // nodeList is not iterable, so we are using for loop
            for (int itr = 0; itr < nodeList.getLength(); itr++)
            {

                Node node = nodeList.item(itr);

                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) node;
                    StudentId = eElement.getElementsByTagName("id").item(0).getTextContent();
                    CourseName = eElement.getElementsByTagName("CourseName").item(0).getTextContent();
                    InstructorName = eElement.getElementsByTagName("Instructor").item(0).getTextContent().replace(","," ");
                    CourseDuration = eElement.getElementsByTagName("CourseDuration").item(0).getTextContent();
                    CourseTime = eElement.getElementsByTagName("CourseTime").item(0).getTextContent();
                    Location = eElement.getElementsByTagName("Location").item(0).getTextContent();
                    row = StudentId +"," +CourseName + "," + InstructorName + "," + CourseDuration + "," + CourseTime +"," +Location+"\n";

                    System.out.println(row);


                    writer.write(row);

                }
            }
            writer.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}