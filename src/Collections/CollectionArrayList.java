package Collections;
import java.util.*;
public class CollectionArrayList {
    public static void main(String[] args) {
       
       //ArrayList
        List<Integer> list1 = new ArrayList<>();
        
        for(int i = 1 ;i<10;i++){
             list1.add(i);
             //list add element in the list
        }
        System.out.println(list1);
        list1.forEach((item)->{
            System.out.print(2*item+" ");
        });//Lambda function expression(inline function which take one consumer type argument and return no result)
        System.out.println();
        System.out.println(list1.size());
        System.out.println(list1.isEmpty());

        //this is used to check the list is empty or not,give boolean output.
        System.out.println(list1.contains(3));
        //this is used to check the list contains the element or not,give boolean output.
        System.out.println(list1.indexOf(3));
        //this is used to get the index of the element in the list.
        System.out.println(list1.lastIndexOf(3));
        //this is used to get the last index of the element in the list.\
        System.out.println(list1.get(5));
        //get(int index) will give use the object at that index
        System.out.println(list1.set(3,10));
        //set(int index,object) will set the object at that index
        System.out.println(list1);
        //now you will see the change in index of the list after using set statement
        System.out.println(list1.remove(8));
        //list.remove(int index) will remove the object at that index
        System.out.println(list1);
        //now you will see the change in index of the list after using remove statement

        
    }
}
//Vector is similar to Arraylist but there are few differences
//Arraylist is asynchronised whereas vector is synchronised means in vectors ,only one thread can access at a time whereas Arraylist is multi-thread that means multiple threads can access at a time.
//Arraylist is faster than Vectors.