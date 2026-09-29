
package servicequeue;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class ServiceQueue {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        Queue<String> students = new LinkedList<>();

       students.offer(sca.nextLine());
        students.offer(sca.nextLine());
         students.offer(sca.nextLine());
          students.offer(sca.nextLine());
       
        System.out.println("\nService Order:");

        // Serve the first student
        String served = students.poll();
        System.out.println("Serving: " + served);

        // Challenge: add a new student after first student is served
        System.out.print("\nEnter a new student: ");
        String newStudent = sca.nextLine();
        students.add(newStudent);

        // Continue serving until queue is empty
        while (!students.isEmpty()) {
            served = students.poll();
            System.out.println("Serving: " + served);
        }

    }
    
}
