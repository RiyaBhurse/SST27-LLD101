import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();
        UserProfile p = svc.createMinimal("u1", "a@b.com");
        System.out.println("Before: " + p.getEmail());
        // This line will now cause a compilation error, demonstrating the immutability.
        // p.setEmail("evil@example.com"); 
        System.out.println("After:  " + p.getEmail());
        System.out.println("=> The setter is gone, and the object is now immutable.");
    }
}