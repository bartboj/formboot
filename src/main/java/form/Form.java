package form;

import lombok.Data;

import java.util.HashMap;
import java.util.List;

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


}
