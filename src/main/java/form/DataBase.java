package form;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by lkedron on 2016-04-19.
 */
@Component
public class DataBase {


    private static final int TEXT_FIELD = 1;

    public Form getForm(int id) {

        Form f = new Form();
        HashMap<String, Field> fieldsMap = new HashMap<>();
        f.setFieldsMap(fieldsMap);
        List<Field> fields = new ArrayList<>();
        f.setFields(fields);

        Field field = new Field();
        field.setBackendModelName("borrower.imie");
        field.setFieldTypeId(TEXT_FIELD);
        field.setName("Imię");
        field.setViewModel("borrower.name");
        field.setNgShow("true");

        fields.add(field);

        field = new Field();
        field.setBackendModelName("borrower.nazwisko");
        field.setFieldTypeId(TEXT_FIELD);
        field.setName("Nazwisko");
        field.setViewModel("borrower.surname");
        field.setNgShow("true");
        fields.add(field);

        field = new Field();
        field.setBackendModelName("borrower.pesel");
        field.setFieldTypeId(TEXT_FIELD);
        field.setName("Pesel");
        field.setViewModel("borrower.pesel");
        field.setNgShow("borrower.surname != null");

        fields.add(field);

        for (Field fd : fields) {
            f.getFieldsMap().put(fd.getViewModel(), fd);
        }
        return f;
    }
}
