package jaxb.xml_1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Adyl on 02.09.2017.
 */
@XmlRootElement (name = "human")
public class Human2 {

    @XmlElement
    String firstName;

    @XmlElement
    String surname;

}
