import com.pwd.util.PasswordUtil;

public class PwdTestMain {
    public static void main(String[] args){
        System.out.println("Hiiii");
        PasswordUtil obj = new PasswordUtil();
        System.out.println(obj.encode("reshma"));
    }
}
