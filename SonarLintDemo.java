import java.util.Random;

public class SonarLintDemo {


    private static final String DB_PASSWORD = "super_secret_password_123";
    private static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=MyProject";

    public void generateUserToken() {
 
        int unusedVariable = 5;

        System.out.println("Đang kết nối tới database: " + DB_URL);
      
        Random random = new Random();
        int securityToken = random.nextInt(999999);
        
        System.out.println("Mã token bảo mật của user là: " + securityToken);
    }
}