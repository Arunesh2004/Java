package LinearSearching;

public class SearchInRange {

    public static void main(String[] args) {

        int[] arr = {13 , 67 , 89 , 76 , 35};

        int target = 67;



        System.out.println("It's index is : " + search(arr, target , 1 , 4));

    }

    static int search(int[] arr ,int target ,int start , int end ){

        if(arr.length == 0){
            return -1;
        }

        for (int i = start; i <= end; i++) {

            if(arr[i] == target){

                return i;

            }

        }

        return -1;
    }
}
