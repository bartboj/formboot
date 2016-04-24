package form;

import java.util.HashMap;

/**
 * Created by lkedron on 2016-04-19.
 */
public class ValidatorExecutor {

    private Form form;

    private HashMap<String, String> errorMap;

    public void validate() {
        for (Field field : form.getFields()) {
            IValidator iValidator = form.getValidators().get(field.getName());
            if (iValidator != null) {
                iValidator.inject(form, field, errorMap);
                iValidator.validate();
            }
            if(!field.validateRegexp()) {
                errorMap.put(field.getName(), "Niepoprawnie wypełnione pole:" + field.getName());
            }
        }


    }

}
