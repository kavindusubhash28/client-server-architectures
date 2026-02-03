
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        UserDataStore dataStore = new UserDataStore();
        List<Thread> threadList = new ArrayList<>();
        Object lock = new Object();
        
        boolean addMore = true;
        
        while (addMore) {
            System.out.println("Enter Name: ");
            String name = scanner.next();
            System.out.println("Enter Age: ");
            int age = scanner.nextInt();
            
            UserProcessor processor = new UserProcessor(name, age, dataStore, lock);
            
            Thread t = new Thread(processor);
            
            threadList.add(t);
            t.start();
            
            System.out.println("Add another? (true/false)");
            addMore = scanner.nextBoolean();
        }
        
        for(Thread t : threadList){
            try{
                t.join();
            }catch (InterruptedException e){
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        
        System.out.println("--All Users in DatStore--");
        System.out.println(dataStore.getAllUsers());
        
        scanner.close();
    }
}
