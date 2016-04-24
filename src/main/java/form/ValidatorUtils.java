package form;

/**
 * Created by lkedron on 2016-04-19.
 */
public class ValidatorUtils {


    public static boolean isNeeded(Field dependentField, Field dependableField) {

        //zaimpelementowac sprawdzanie czy to string czy int czy date

        return   dependableField.getValue() == dependentField.getNgShow().substring(dependentField.getNgShow().indexOf("==")+2);
    }
}
