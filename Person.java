import java.util.ArrayList;
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    //indica el nombre de la persona
    private String name;
    // indica la edad de la persona
    private int age;
    //almacena el padre de la persona
    private Person father;
    //almacena la madre de la persona
    private Person mother;
    //almacena los hijos de la persona
    private ArrayList<Person> children;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name,int age)
    {
        this.name = name;
        this.age  = age;
    }

    /**
     * Metodo que muestra por pantalla la edad y nombre de la persona
     */
    public void showData()
    {
        System.out.println("Nombre : " + name);
        System.out.println("Edad : " + age);
    }
    
    /**
     * Metodo que permite fijar el padre de una persona
     */
    public void setFather(Person father)
    {
        this.father = father;
    }
    
    /**
     * Metodo que permite fijar la madre de una persona
     */
    public void setMother(Person mother)
    {
        this.mother = mother;
    }
}
