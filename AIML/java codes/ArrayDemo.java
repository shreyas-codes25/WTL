public class ArrayDemo{
    public static void main(String[] args) {
        int arr [];

         arr  = new int[8];

        System.out.println("Array before adding data : ");

        display(arr);

        for(int i=0;i<8;i++){
            System.out.println("adding data at index " + i);
            arr[i] = i;
        }
        System.out.println();

        System.out.println("Array after adding data : ");

        display(arr);

        int index =5;
        arr[index] = 10;

        System.out.println("Array after updating data at index " + index + " : " +arr[index]);

        int value=4;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == value){
                System.out.println("Index of " + value + " is " + i);
                break;
            }
        }
    }

    private static void display(int arr []){
        System.out.println("Array : [");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        System.out.println();
    }
}