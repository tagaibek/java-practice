package jaxb.xml_1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Human on 02.09.2017.
 */
@XmlRootElement(name = "person")
public class Human {

    @XmlElement
    String name;

    @XmlAttribute(name ="age")
    int age;

    @XmlElement(name = "lastName")
    String surname;

    @Override
    public String toString(){
        return name + " " + surname;
    }

}
