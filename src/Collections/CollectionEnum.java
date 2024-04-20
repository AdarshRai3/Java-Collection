package Collections;

public class CollectionEnum  {
    enum Week implements A{
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday;

        Week(){
            System.out.println("Construntor called for this"+this);
        }
        //when we call the Week() method then , this inside it should ponly run for Monday bbut that is not the case it runs for all day that are present
        //this is not public&protected(enum cannot have children) 
        //why canno create new object
        //that is not the enum concept
        public void hello(){
            System.out.println("Hello");
        }
   };
    public static void main(String[] args) {
        Week week = Week.Monday;
        // for(Week day: Week.values()){
        //     System.out.println(day);
        // }this is how we can iterate through enum
        System.out.println(week);
        System.out.println(week.ordinal());
        //week.ordinal method will give us the index/position of enum declaration
        week.hello();
        //now we can caled hello()  method in psvm from enum Week by overriding hello() method in enum by implementing A interface.
    }
}
//Enum are group of variable that cannot be changed.
//Examples Enum can be week and month there are constant values for that. there will be only 7 days in week and 12 month which have constant names