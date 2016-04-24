import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lkedron on 2016-04-19.
 */
public class TestJackson {

    @Test
    public void test() throws IOException {

        String map = "{ \"borrower\": { \"firstName\": \"Janusz\", \"secondName\": \"Chwielewski\", \"incomes\": [{\"id\":1, \"incomeNetAmount\":2500, \"company\":{\"name\":\"ZAKŁADY ZŁA\"}}]}}";
        HashMap<String,Object> result =
                new ObjectMapper().readValue(map, HashMap.class);

        Map borrower = (Map) result.get("borrower");
        List incomes = (List) borrower.get("incomes");
        Map income = (Map) incomes.get(0);

        Assert.assertEquals(income.get("incomeNetAmount"), 2500);

    }
}
