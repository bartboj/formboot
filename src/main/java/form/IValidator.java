package form;

import java.util.HashMap;

/**
 * Created by lkedron on 2016-04-19.
 */
public interface IValidator {

    void inject(Form form, Field field, HashMap<String, String> errorMap);

    void validate();
}
