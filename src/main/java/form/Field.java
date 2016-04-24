package form;

import lombok.Data;

/**
 * Created by lkedron on 2016-04-19.
 */
@Data
public class Field {
    private String name;
    private String value;
    private String viewModel;
    private String backendModelName;
    private String ngShow;
    private String ngRegexp;
    private String required;
    private int fieldTypeId;

    public boolean validateRegexp() {
        boolean isValid = true;
        if (ngRegexp != null) {
            isValid= value.matches(ngRegexp);
        }
        return isValid;
    }
}
