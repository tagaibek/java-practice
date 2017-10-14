package jaxb.xml_1;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.StringWriter;

/**
 * Created by Adyl on 02.09.2017.
 */
public class Converter {
    public static void main(String[] args) throws FileNotFoundException, JAXBException {
        //deserialization - start
        FileInputStream xmlFile = new FileInputStream("C:\\Users\\Adyl\\IdeaProjects\\Test\\src\\jaxb.xml_1\\person.xml");

        JAXBContext jaxbContext = JAXBContext.newInstance(Human.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        Human human = (Human) unmarshaller.unmarshal(xmlFile);
        //deserialization - end

        //serialization - start
        JAXBContext jaxbContext1 = JAXBContext.newInstance(Human2.class);
        Marshaller marshaller = jaxbContext1.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        StringWriter writer = new StringWriter();

        Human2 human2 = new Human2();
        human2.firstName = human.name;
        human2.surname = human.surname;

        marshaller.marshal(human2, writer);

        String string = writer.toString();

        System.out.println(string);
        //serialization - end
    }
}
