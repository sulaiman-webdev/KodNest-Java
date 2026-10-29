import java. util. Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System. in);
int[] readings = new int[5];

for (int index = 0; index < readings.length; index++) {
readings [ index] = scanner.nextInt();
}
int sum = 0 ;

// Calculate and print the total.
for(int i : readings){
sum = sum + i ;

}
System.out.println("Total: "+ sum);
scanner.close();
}
}