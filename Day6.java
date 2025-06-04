/*Operations in Arrays:
 Create
 input
 output
 update
*/
// public class Day6{
//     public static void main(String[] args) {
//         int mark[] = new int[30];
//         int numbers[] = {1,2,3}; 
//         String fruits[] = {"mango","apple"};
           
//     }
// }
// Passing arrays arguments


public class Day6{
    public static void update(int marks[]){
        for(int i = 0; i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {20,30,20};
        update(marks);

        for(int i = 0; i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
}


