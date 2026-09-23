package chapter1;

public class Constructor1Lesson {
    public static void main(String[] args) {
        
        Chicken c1 = new Chicken();
        Chicken c2 = new Chicken();
        System.out.println(c1.firstName +" "+ c2.lastName);
      
    }
    
}

class Chicken{
    int numEggs = 0;
    String firstName;
    String lastName;
    {
        numEggs = 100; //initialize blocker
    }
    public Chicken(){
        firstName = "Duke";
        lastName = "Nukem";
    }
    
}class Swan{
    int numberEggs;
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1; // writting Object fields
        System.out.println("Swan number of eggs: "+mother.numberEggs); // reading Object fields 
    }
}
class Name{
    String first ="Vilador";
    String last ="Jaypee";
    String full =first+last;
    public static void main(String[] args) {
        Name name1 = new Name();
        System.out.println(name1.full);
        name1.first ="Anton";
        name1.last = "Racal";
        Name name2 = new Name();
        name2.full = name1.first+name1.last;
        System.out.println(name2.full);
    }
}