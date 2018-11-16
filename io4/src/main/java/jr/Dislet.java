package jr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Map;

import static javax.print.attribute.standard.MediaSizeName.C;

public class Dislet extends AbstractJrlet{


    @Override
    public void service(String line, OutputStream out) throws Exception {

        out.write(new String("Content-Type: text/html;\r\n\r\n").getBytes());
        System.out.println("discomfort service");
        out.write("<h1>discomfort service</h1>".getBytes());


        Map<String, String> paramMap = parse(line);

        double temperature = Double.parseDouble(paramMap.get("temperature"));
        System.out.println(temperature);
        double humidity = Double.parseDouble(paramMap.get("humidity"));
        System.out.println(humidity);

        double dis = (1.8*temperature)-(0.55)*(1-humidity/100)*(1.8*temperature-26)+32;

        out.write(("<h1>" + paramMap.get("temperature")+"</h1>").getBytes());
        out.write(("<h1>" + paramMap.get("humidity")+"</h1>").getBytes());
        out.write(("<hr/>").getBytes());
        out.write(("<h2>" + dis +"</h2>").getBytes());
        out.write(("<img src= /img/dis.jpg>").getBytes());
//<img src="그림 파일 주소" alt="설명문" />
    }//out.write는 웹에 쓴다!
}
