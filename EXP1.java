import java.util.Scanner;
//lmaooooooooo
public class EXP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];  // Fixed size
        int size = 0;
        int choice;

        while (true) {
            
            System.out.print("Enter your choice: (1. Create, 2. Display, 3. Insert, 4. Delete, 5. Exit) ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter number of elements: ");
                size = scanner.nextInt();
                System.out.print("Enter elements of the array: ");
                for (int i = 0; i < size; i++) {
                    arr[i] = scanner.nextInt();
                }

            } else if (choice == 2) {
                System.out.println("Array elements:");
                for (int i = 0; i < size; i++) {
                    System.out.println(arr[i]);
                }

            } else if (choice == 3) {
                System.out.print("Enter element to insert: ");
                int elem = scanner.nextInt();
                System.out.print("Enter position (0 to " + size + "): ");
                int pos = scanner.nextInt();

                if (pos >= 0 && pos <= size) {
                    for (int i = size; i > pos; i--) {
                        arr[i] = arr[i - 1];
                    }
                    arr[pos] = elem;
                    size++;
                } else {
                    System.out.println("Invalid position");
                }

            } else if (choice == 4) {
                System.out.print("Enter position to delete (0 to " + (size - 1) + "): ");
                int pos = scanner.nextInt();

                if (pos >= 0 && pos < size) {
                    for (int i = pos; i < size - 1; i++) {
                        arr[i] = arr[i + 1];
                    }
                    size--;
                } else {
                    System.out.println("Invalid position");
                }

            } else if (choice == 5) {
                int pos = scanner.nextInt();
                int element = scanner.nextInt();
                if (pos >= 0 && pos < size) {
                    arr[pos] = element;
                } else {
                    System.out.println("Invalid position");
                }

            } else {
                System.out.println("Invalid choice");
            }
        }

        
    }
}
