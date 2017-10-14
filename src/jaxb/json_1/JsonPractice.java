package jaxb.json_1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.DataOutput;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.StringWriter;

/**
 * Created by Adyl on 02.09.2017.
 */
public class JsonPractice {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        //deserialization - start
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Adyl\\IdeaProjects\\Test\\src\\jaxb\\json_1\\car.json");
        Car car = objectMapper.readValue(fileInputStream, Car.class);
        //deserialization -end

        //serialization - start
        StringWriter writer = new StringWriter();

        Car2 car2 = new Car2();
        car2.car = car.name +" "+ car.model +" "+ car.year;
        objectMapper.writeValue(writer, car2);

        String string = writer.toString();

        System.out.println(string);
    }
}
