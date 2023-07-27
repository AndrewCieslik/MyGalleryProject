import java.util.ArrayList;
import java.util.List;

abstract public class PackageLocker {
    private String code = "default";
    public static List addCode(String newCode){
        List<String> codes = new ArrayList<>();

        if(newCode != null && newCode.matches("^[A-Z]{2}-[0-9]{4}$")) {
            codes.add(newCode);
        } else {
            System.out.println("Code wrong");
        }
        return codes;
    }
}
