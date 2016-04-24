package form;

/**
 * Created by lkedron on 2016-04-20.
 */
public class ObjectsFactory {


    //jezeli id to szukamy po id, jezeli creditId to szukamy po creditId i zwracamy pierwsza, borrowerId tak samo...
    public Object getObj(String path, Integer id, Integer creditId, Integer borrowerId) {

        switch(path) {
            case "BorrowerIncomeEntity":
                //return new BorrowerIncomeDao().getById(id);

        }
        return null;
    }



}
