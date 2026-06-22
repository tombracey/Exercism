public class Twofer {
    public String twofer(String name) {
        String address = "";
        if (name != null) {
            address = name;
        } else {
            address = "you";
        }
        return "One for " + address + ", one for me.";
    }
}
