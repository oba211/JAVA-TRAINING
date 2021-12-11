
/*import java.util.Scanner;

public class Array {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);


        int n;
        n=sc.nextInt();
        
        //intialisation of array
        int array[]=new int[n];

        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print(array[i]+ " ");
        }

    }
    
}
*/

/*


public class Array{

    public static void main(String args[]){
        int array[]={23,65,35,56};

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }

}

*/

/*
public class Array{

    public static void main(String args[]){
        int array[]={23,65,35,56};

        for(int i:array){
            System.out.println(i);
        }

    }

}
*/

class Array{

    static void print(int array[]){
      
    for(int i=0;i<array.length;i++){

        System.out.println(array[i]);
    }

}




public static void main(String args[]){
    int array[]={12,12,12,12};
    print(array);

}
}