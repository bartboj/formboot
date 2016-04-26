package form;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * Created by lkedron on 2016-04-19.
 */
@Controller
public class FormGeneratorController {

    @Autowired
    DataBase database;

    @RequestMapping(value="/show")
    public String show(ModelMap map) {
        map.put("form", database.getForm(1));

        return "/show";
    }

    @RequestMapping(value="/send", method= RequestMethod.POST, produces="application/json")
    public @ResponseBody  Form save(@RequestBody HashMap<String,Object> body, ModelMap map) {
        Form form = database.getForm(1);
        form.fill(body);
        return form;
    }


}
