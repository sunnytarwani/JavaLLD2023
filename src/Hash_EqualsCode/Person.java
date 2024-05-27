package Hash_EqualsCode;

import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    public boolean equals(Object obj){
        if(this == obj){
            return  true;
        }

        Person that = (Person) obj;

        return Objects.equals(this.getFirstName() , that.getFirstName()) &&
               Objects.equals(this.getLastName() , that.getLastName()) &&
                this.age == that.age;
    }

    public int hash(){
        return Objects.hash(this.getFirstName() , this.getLastName() , this.getAge());
    }


    public static void main(String[] args) {


        Person p1 = new Person("Suunny" , "Tarwani" , 25);
        Person p2 = new Person("Ketan" , "Tarwani" , 25);
        Person p3 = new Person("Suunny" , "Tarwani" , 25);

        System.out.println("if true, p1 and p2 are equal :" + p1.equals(p2));
        System.out.println("if true, p1 and p3 are equal :" + p1.equals(p3));

        System.out.println("Hash Values " + p1.hash() + "   " +  p2.hash() + "   " +  p3.hash());

    }
}

