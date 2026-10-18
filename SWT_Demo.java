import java.util.Random;

public class SonarLintDemo {

    // Lỗi 1 (Vulnerability / Security Hotspot): Hardcode mật khẩu cơ sở dữ liệu
    private static final String DB_PASSWORD = "super_secret_password_123";
    private static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=MyProject";

    public void generateUserToken() {
        // Lỗi 2 (Code Smell): Khai báo biến nhưng không bao giờ sử dụng tới
        int unusedVariable = 5;

        System.out.println("Đang kết nối tới database: " + DB_URL);
        
        // Lỗi 3 (Security Hotspot): Sử dụng hàm Random yếu để tạo mã bảo mật (Token)
        // SonarLint sẽ khuyên dùng SecureRandom thay thế
        Random random = new Random();
        int securityToken = random.nextInt(999999);
        
        System.out.println("Mã token bảo mật của user là: " + securityToken);
    }
}