package root;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.Contended;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestContorller {

   List<String> list = new ArrayList<>();
    @RequestMapping("/getGson")
    public String getJsonString(){
        return "Hello";
    }

    @RequestMapping("/putGson")
    public void getJsonString(String json){
        list.add(json);
        System.out.println(list);
    }
}
