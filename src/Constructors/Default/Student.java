package Constructors.Default;

public class Student {
    int id;
    String name;

    public static void main(String[] args) {
        Student st = new Student();
        //displaying values of the object
        /*
         * Output is null because we are not providing the value
         * to the object so it set to it's default values by
         * DEFAULT CONSTRUCTOR
         * */
        st.display();
    }

    void display() {
        System.out.println("ID :" + id + " \n" + "Name: " + name);
    }
}
