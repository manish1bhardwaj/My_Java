// Print the cube of each number from 1 to n.
package Logic_Building;

public class CubeOfNumber {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        int cube = 0;
        while(i<=n){
            cube =i*i*i;
            System.out.println(cube);
            i++;
        }
    }
    
}
