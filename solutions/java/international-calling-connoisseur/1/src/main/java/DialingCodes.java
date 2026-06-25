import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DialingCodes {

    private Map<Integer, String> codes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return codes;
    }

    public void setDialingCode(Integer code, String country) {
        codes.put(code, country);
    }

    public String getCountry(Integer code) {
        return codes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!codes.keySet().contains(code) && !codes.values().contains(country)) {
            codes.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        Set<Map.Entry<Integer, String>> entrySet = codes.entrySet();

        for (Map.Entry<Integer, String> entry : entrySet) {
            if (entry.getValue().equals(country)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        codes.remove(findDialingCode(country));
        codes.put(code, country);
    }
}
