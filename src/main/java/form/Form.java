package form;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lkedron on 2016-04-19.
 */
@Data
public class Form {

    private String name;
    private List<Field> fields; // latwiej w angularze iterowac
    private HashMap<String, Object> contextMap;
    private HashMap<String, Field> fieldsMap;
    private HashMap<String, IValidator> validators;


    void fill() {

    }


    public void fill(HashMap<String, Object> body) {
        for (Map.Entry<String, Field> keyField : fieldsMap.entrySet()) {
            if (keyField.getKey().contains(".")){
                HashMap<String, Object> o = (HashMap<String, Object>) body.get(keyField.getKey().substring(0, keyField.getKey().indexOf(".")));
                String id1= keyField.getKey().substring(keyField.getKey().indexOf(".")+1);
                String id1Value = (String) o.get(keyField.getKey().substring(keyField.getKey().indexOf(".")+1));
                keyField.getValue().setValue((String) o.get(keyField.getKey().substring(keyField.getKey().indexOf(".")+1)));
            }
        }

    }
}
