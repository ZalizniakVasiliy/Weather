import com.jcabi.http.Response;
import com.jcabi.http.request.JdkRequest;

import java.io.IOException;

public class ClientRequest {
    public void gettingServerResponse() throws IOException {
        String uri = "http://api.openweathermap.org/data/2.5/weather?q=Nashville&APPID=88180ae0f96f94000f36ce94d11d21ef";
        Response page;
        page = new JdkRequest(uri).fetch();
        System.out.println(page);
    }
}
