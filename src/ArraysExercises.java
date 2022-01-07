
import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        //correct way to run numbers array
//        System.out.println(Arrays.toString(numbers));

//        Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

        Person[] peopleArray = {new Person("Hailey"), new Person("Harley"), new Person("Navi")};
        for (Person person : peopleArray) {
            System.out.println(person.getName());
        }


//        passed person object at the end of the array.

        System.out.println();
        peopleArray = addPerson(peopleArray,new Person("Bear"));
        for (Person person : peopleArray) {
            System.out.println(person.getName());
        }


    }

//    Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

        public static Person[] addPerson(Person[] peopleArray, Person toAdd) {
            Person[] copyPeopleArray = Arrays.copyOf(peopleArray, peopleArray.length+1);
            copyPeopleArray[copyPeopleArray.length-1] = toAdd;
            return copyPeopleArray;
        }


}
