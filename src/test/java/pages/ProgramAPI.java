import com.gurock.testrail.APIClient;
import com.gurock.testrail.APIException;
import java.util.Map;
import java.util.HashMap;

import org.apache.xpath.operations.String;
import org.json.simple.JSONObject;

public class Program
{
    public static void main(String[] args) throws Exception
    {
        APIClient client = new APIClient("http://emakhachek/testrail/");
        client.setUser("kmahachek@gmail.com");
        client.setPassword("Ekateriwa33");