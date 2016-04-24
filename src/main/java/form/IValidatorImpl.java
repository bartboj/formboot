package form;

import java.util.HashMap;

/**
 * Created by lkedron on 2016-04-19.
 */
public class IValidatorImpl implements IValidator {

    private Form form;
    private Field field;
    private HashMap<String, String> errorMap;

    @Override
    public void inject(Form form, Field field, HashMap<String, String> errorMap) {
        this.form = form;
        this.field = field;
        this.errorMap = errorMap;
    }

    @Override
    public void validate() {
        if (field.getNgShow() != null) {
            Field f = form.getFieldsMap().get(this.field.getNgShow().substring(0, this.field.getNgShow().indexOf("=")));
            if (ValidatorUtils.isNeeded(field, f)){
                //do validation
            }
        }
    }
}
