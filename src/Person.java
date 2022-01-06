public class Person {
    private String name;

    //this is a constructor
//    public Person() {
//
//    }

//    The class should have a constructor that accepts a `String` value and sets
//    the person's name to the passed string.


    public Person (String name) {
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("%s says hello there!", name);
    }


//    Create a `main` method on the class that creates a new `Person` object and
//    tests the above methods.

    public static void main (String[] args) {

//        Person hailey = new Person("Hailey");
//        System.out.println(hailey.getName());
//        hailey.sayHello();
//        hailey.setName("Hailey Hals");
//        hailey.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
        //this is equal... need explanation
//        System.out.println(person1.getName().equals(person2.getName()));
        //        this is not equal because person 1 and person 2 are different objects with the same string name
//        System.out.println(person1 == person2);


//        this is equal because they are assigned the same value and acts as one object
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        //setting person 2 will also result in assigning person1 with the same value since they are equal
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());



    }


}
