
package restfulservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
public class Resources {


    private static Map<String ,DataModel> users=new HashMap<String, DataModel>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DataModel> getUsers()
    {


        System.out.println("welcome to api developmemt");
        return new ArrayList<>(users.values());
    }


}