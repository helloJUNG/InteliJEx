package jr;

import service.MessageService;

import java.io.OutputStream;
import java.net.URLDecoder;
import java.util.Map;

public class Messagelet extends AbstractJrlet{

    @Override
    public void service(String line, OutputStream out) throws Exception {

        Map<String,String> paramMap = parse(line);

        System.out.println(paramMap);

        String content = paramMap.get("content");

        String deContent = URLDecoder.decode(content,"UTF-8");

        String deTarget = URLDecoder.decode(paramMap.get("target"),"UTF-8");

        System.out.println(deContent);

        MessageService service = MessageService.INSTANCE;
        service.sendMessage(deTarget,deContent);

        out.write(new String("Content-Type: text/html; charset=UTF-8\r\n\r\n").getBytes());
        System.out.println("Hello service");
        out.write("<h1>정상적으로 전송되었습니다.</h1>".getBytes("UTF-8"));
    }
}
