package extra;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.Date;

public class JonEleSwitch {

    public static void colorDefinder() {
        String color = "green";

        switch (color) {
            case "red":
                System.out.println("the color is red");
                break;
            case "blue":
                System.out.println("the color is blue");
                break;
            default:
                System.out.println("the color is not red or blue the color is " + color);
                break;

        }

        int result;
        result = 5*5;
        System.out.println(result);

    }


    public static void main(String[] args) {
        colorDefinder();

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        }




}
