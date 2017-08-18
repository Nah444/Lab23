/**
 * Created by Grand Circus Student on 7/20/2017.
 */
public class Student {
    //object: a bundle of data and behaviors

    // THIS IS OUR TEMPLATE (OBJECT)
    //data: instance variables (fields)
    //THESE EXIST OUTSIDE OF METHODS -- HOLD DATA
    //the entire lifetime of the class

   //as a general rule, instance variables are private
    private String firstName;
    private String lastName;
    private String bootcamp;
    int id;
    private double grade;

    //behaviors/methods
    //as a general rule, public

    //constructor : public method that creates the instance
    //what's called when the new keyboard is used with the class
    //1 visibility modifier; usually public
    //2 never static
    //3 NO RETURN TYPE
    //4 name = name of class (capitalize the same)
    //5 arguments vary
    //          might take 1 argument for each instance variable
    //          might take no arguments and set everything to default values


    //no arguments constructor
    public Student () {
        firstName = "";
        lastName = "";
        bootcamp = "";
        id = 42;
        grade = 1.0;

        public Student ()
            lastName = "";
            lastName = "";
            bootcamp = "";
            id = 42;
            grade = 1.0;


    //all argument constructor


    //getters (accessors) provide puble view access to private instance variables
    //1 visibility instance variables
    //2 never static (opposite of instance)
    //3 return type is usually the data type of the instance
    //4 name is usually get + instance var name
    //5 usually no arguments
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBootcamp() {
        return bootcamp;
    }

    public int getID() {
        return id;
    }

    public double getGrade() {
        return grade;
    }
    public String
    //setters (mutators) provide public write access to private instance variables
    //1 visibilty modifier: public
    //2 never static (static is the opposite of instance variable
    //3 return type is usually void
    //4 name is usually set + instance var name
    //5arguments: one arguemtn, the same data type as the private instance variable
    //I need to capture the value from the argument which is going out of scope soon. I store it in the instance variable,
    //which holds state (it holds the info long-term)
    public void setFirstName(String fn) {
        firstName = fn;
    }
    public void setBootcamp(String Bootcamp) {

    }
    //firstname, lastname
    //bootcamp
    //ID number
    //percentage grade
}
