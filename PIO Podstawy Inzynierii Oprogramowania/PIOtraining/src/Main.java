public class Main {
    public static void main(String[] args) {
    String code="LL-0981";
    checkCode(code);
    Package.addCode(code);
    }
    public static void checkCode(String newCode){
        if(newCode != null && newCode.matches("^[A-Z]{2}-[0-9]{4}$")) {
            System.out.println("Code accepted");
        } else {
            System.out.println("Code wrong");
        }
    }
}

