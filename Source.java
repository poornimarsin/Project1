import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class Source{

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);

        ListIterator<Integer> listIterator = arrayList.listIterator();
        while(listIterator.hasNext()) {
            System.out.print(listIterator.next());
            listIterator.previous();
        }
        List<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(101f);

        iterate(random);
    }
    public static void iterate(List<Float> num) {
        ListIterator<Float> it = num.listIterator(num.size());
        while(it.hasPrevious()) {
            if(it.hasPrevious()) {
                System.out.println(it.previous());
            }
            it.previous();
        }
    }


    public static void iterateAltn(List<Float> num) {
        ListIterator<Float> it = num.listIterator();
        int index = 1;
        float evenNum;
        while(it.hasNext()) {
            evenNum = it.next();
            if (index++%2 == 0) {
                System.out.println(evenNum);
            }
        }
    }
}

/*
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class Source {

    public static void main(String[] args) {
        List<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(101f);

        printList(random);
    }

    public static void printList(List<Float> arr) {
        ListIterator<Float> li = arr.listIterator(arr.size());
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }

    }
}

import java.util.LinkedList;

class Source {

    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<Student>();


        Student s1 = new Student("Sujit", 1);
        Student s2 = new Student("Siddharth", 2);
        Student s3 = new Student("Karanpreet", 3);
        Student s4 = new Student("Hari", 5);
        Student s5 = new Student("Tricha", 4);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        System.out.println(studentList.get(1).getDetails());
    }

    public static void printStudentList(LinkedList<Student> students) {
        for(Student s : students) {
            System.out.println(s.getDetails());
        }
    }
}

class Student {
    private final String name;
    private final int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getDetails() {
        return
                "name = " + this.name + '\n' +
                        "roll number = " + this.rollNumber + '\n';
    }
}


import java.util.LinkedList;

class Source {
    public static void main(String[] args) {
        LinkedList<Float> random = new LinkedList<>();

        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99f);

        System.out.println(random.get(2));
    }
}

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.zip.ZipEntry;

public class Source {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        moveZerosToEnd(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to find move all zeros to the end of the array
    static void moveZerosToEnd(int[] arr) {
        int[] moveZeroToEnd = new int[arr.length];
        int zeroCount = 0;
        int i = 0;

        for (int index = 0; index < arr.length; index ++)
        {
            if (arr[index] == 0) {
                zeroCount++;
            }
            else
            {
             moveZeroToEnd[i++] = arr[index];
            }
        }
        if (zeroCount > 0) {
            for(int index=0; index < zeroCount; index++) {
                moveZeroToEnd[i++] = 0;
            }
        }

        for (int j = 0; j < moveZeroToEnd.length; j++) {
            arr[j] = moveZeroToEnd[j];
        }
    }
}

import java.util.*;

public class Source {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to reverse the array
    static void reverseArray(int[] arr) {
        // Write your code here
        int[] reverseArr = new int[arr.length];
        int index=0;
        for (int i = arr.length - 1; i >=0 ; i--) {
            reverseArr[index++] = arr[i];
        }

        for (int i = 0; i < reverseArr.length;i++){
            arr[i] = reverseArr[i];
        }
    }
}



import java.util.ArrayList;

class Source {

    public static void main(String[] args) {
        ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);

        //Write new statements here
random.remove(3);
random.add(3, 15f);
        printList(random);
    }

    public static void printList(ArrayList<Float> arr) {
        for(Float num : arr) {
            System.out.println(num);
        }
    }
}

import java.util.*;

public class Source {
    public static void main(String args[]) {
        ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);

        System.out.println(random.contains(5.0f));

        ArrayList<String> shape = new ArrayList<String>();
        shape.add("Square");
        shape.add("Triangle");
        shape.add(2, "Circle");
//        shape.add(1, "Rhombus");
        System.out.println(shape.get(2));

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++)
            list.add(s.nextInt());
        reverseArrayList(list);
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");


    }

    // Method to reverse the ArrayList
    static void reverseArrayList(ArrayList<Integer> list) {
        // Write your code here
        ArrayList<Integer> reversedList = new ArrayList<Integer>();

        for (int element :
                list) {
            reversedList.add(0, element);
        }

        for (int i = 0; i < reversedList.size(); i++) {
            list.set(i, reversedList.get(i));
        }
    }
}

/*
import java.util.ArrayList;

class Source {

    public static void main(String[] args) {
        //Create an ArrayList using Generics here
        ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);


        printArray(random);
    }

    public static void printArray(ArrayList<Float> random) {
        //Complete the method declaration here
        for (float element:random
             ) {
            System.out.println(element);
        }
    }
}

import java.util.ArrayList;                  //ArrayList library imported

class Source {
    public static void main(String[] args) {
        ArrayList mix = new ArrayList();
        mix.add("Hari");
        mix.add(2);
        printMixList(mix);
    }

    public static void printMixList(ArrayList elements) {
        for(Object o : elements) {
            System.out.println(o);
        }
    }
    public static void main(String[] args) {
        // int random[ ] = {2, 4, 5, 10};
        //Declare and create an object of the ArrayList class named 'random', in place of the line above
        ArrayList random = new ArrayList();
        //Add the first four elements to this 'random' ArrayList
        random.add(2);
        random.add(4);
        random.add(5);
        random.add(10);

        random.add(99);                    //Command for adding a new element
        printArray(random);
    }

    public static void printArray(ArrayList arr) {   //Change the type of the parameter to ArrayList
        for(Object a : arr) {              //Change the data type of 'a' from 'int' to 'Object'
            int element = (int) a;
            System.out.println(a);
        }
    }

}

import java.util.*;

public class Source {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int k = s.nextInt();
        search(arr, k);
    }

    // Method to search for k in an unsorted array
    static void search(int[] arr, int k) {
        // Write your code
        for (int element:arr
             ) {
            if (element == k) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}

class Source {

    public static void main(String[] args) {
        int random[ ] = {2, 4, 5, 10};
        printArray(random);
    }

    public static void printArray(int[] arr) {

        // Declare printArray method here
        for (int element:arr
             ) {
            System.out.println(element);
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class absdetail{
    //Include a member variable named father
    String father;

    //Include getter and setter methods for this variable
    abstract public String getFather();

    abstract public void setFather(String fatherName);
}

interface year{
    //TODO
    int getYear(int STD);
}

class Student extends absdetail{
    public String name = null;
    public int ANo;
    public int STD;

    public Student(String name, int ANo, int STD) {
        this.name = name;
        this.ANo = ANo;
        this.STD = STD;
    }

    //Define the methods here

    public String getName() {
        return name;
    }

    public int getANo() {
        return ANo;
    }

    public int STD() {
        return STD;
    }


    @Override
    public String getFather() {
        return this.father;
    }

    @Override
    public void setFather(String fatherName) {
        this.father = fatherName;
    }


}

class Report extends Student implements year{

    public int ptage;
    public String pass = null;
    public Report(String name, int ANo, int STD, int ptage, String pass) {
        super(name, ANo, STD);
        this.ptage = ptage;
        this.pass = pass;
    }
    public int getptage() {
        return ptage;
    }
    public String getpass() {
        return pass;
    }

    //implement the method here
    @Override
    public int getYear(int STD) {
        return (ANo);
    }

}

class Bus extends Student {
    public int route;
    public String BG = null;
    public Bus(String name, int ANo, int STD, int route, String BG) {
        super(name, ANo, STD);
        this.BG = BG;
        this.route = route;
    }
    public String getBG() {
        return BG;
    }
    public int getroute() {
        return route;
    }
}

public class Source {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strNums1, strNums2;
        strNums1 = br.readLine().split("\\s");
        strNums2 = br.readLine().split("\\s");
        Report r1 = new Report(strNums1[0], Integer.parseInt(strNums1[1]), Integer.parseInt(strNums1[2]), Integer.parseInt(strNums1[3]),strNums1[4]);
        Report r2 = new Report(strNums2[0], Integer.parseInt(strNums2[1]), Integer.parseInt(strNums2[2]), Integer.parseInt(strNums2[3]),strNums2[4]);
        Bus b1 = new Bus(strNums1[0], Integer.parseInt(strNums1[1]), Integer.parseInt(strNums1[2]), Integer.parseInt(strNums1[5]),strNums1[6]);
        Bus b2 = new Bus(strNums2[0], Integer.parseInt(strNums2[1]), Integer.parseInt(strNums2[2]), Integer.parseInt(strNums2[5]),strNums2[6]);
        //call setFather for all objects here
        b1.setFather(strNums1[7]);
        b2.setFather(strNums2[7]);
        int n = Integer.parseInt(br.readLine());
        if(n==r1.getANo()) {
            System.out.println(r1.getName() +" "+ r1.getptage() + " "+b1.getroute()+ " "+b1.getFather());
            System.out.println("You will graduate in " + r1.getYear(r1.STD)+ " years");
        }
        else if(n==r2.getANo()){
            System.out.println(r2.getName() +" "+ r2.getptage() + " "+b2.getroute()+ " "+b2.getFather());
            System.out.println("You will graduate in " + r2.getYear(r2.STD)+ " years");
        }
        else
            System.out.println("No entry found");
    }
}

abstract class Parent {

    abstract int display(int i);

    int returnValue(int i) {
        return display(++i);
    }
}

class Child extends Parent {
    int display(int i) {
        return ++i;
    }
}

public class Source {
    public static void main(String[] args) {
        Child myObj = new Child();
        System.out.println(myObj.returnValue(1011));
    }
}

public interface Player {
    public String playersName();
    public String playersTeamName();
}

interface first {
    default public void display() {
        System.out.println("This is the display function of method1");
    }
}

interface second {
    default public void display() {
        System.out.println("This is the display function of method2");
    }
}

public class Source implements first, second {
    public static void main(String[] args) {
        Source object = new Source();
        object.display();
    }
}

class Base {
    public void display() {
        System.out.println("This is the display function of the base class.");
    }
}

interface BaseInterface {
    default public void display() {
        System.out.println("This is the display function of the interface class.");
    }
}

public class Source extends Base implements BaseInterface {

    public static void main(String[] args) {

        Source obj = new Source();
        obj.display();
    }
}

class First {
    static void display() {
        System.out.println("ONE");
    }
}

class Second extends First {
    static void display() {
        System.out.println("TWO");
    }
}

public class Source {
    public static void main(String[] args) {
        First obj = new Second();

        obj.display();
    }
}

import java.util.*;

//Write your code here
abstract class Shape {
    abstract void display();
}

class Triangle extends Shape{

    @Override
    void display() {
        System.out.println("The shape is a triangle");
    }
}

class Rectangle extends Shape {

    @Override
    void display() {
        System.out.println("The shape is a rectangle");
    }
}

class Circle extends Shape {

    @Override
    void display() {
        System.out.println("The shape is a circle");
    }
}

public class Source {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Shape obj = new Triangle();
        Shape obj1 = new Rectangle();
        Shape obj2 = new Circle();
        int numberOfSides = in.nextInt();
        switch (numberOfSides){
            case 0:
                obj2.display();
                break;
            case 3:
                obj.display();
                break;
            case 4:
                obj1.display();
                break;
            default:
                System.out.println("Enter a valid number of sides!");
        }
    }
}

import java.util.*;

class Number {
    //Write your code here
    double realPartNumber;
    double imaginaryPart;

    public Number(double realPartNumber, double imaginaryPartNumber) {
        this.realPartNumber = realPartNumber;
        this.imaginaryPart = imaginaryPartNumber;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public double getRealPartNumber() {
        return realPartNumber;
    }

    public void setRealPartNumber(double realPartNumber) {
        this.realPartNumber = realPartNumber;
    }

    public void setImaginaryPart(double imaginaryPartNumber) {
        this.imaginaryPart = imaginaryPartNumber;
    }
}

class Complex extends Number {


    public Complex(double realPartNumber, double imaginaryPartNumber) {
        super(realPartNumber, imaginaryPartNumber);
    }

    //Write your code here
    void checkComplex () {
        if ((imaginaryPart != 0)) {
            System.out.println("The given number is complex");
        }
        else {
            System.out.println("The given number is real");
        }
    }
}

class PurelyImaginary extends Complex {
    public PurelyImaginary(double real, double imaginary) {
        super(real, imaginary);
    }

    //Write your code here
    public void checkPurelyImaginaryNumber() {
        if ((realPartNumber == 0) && (imaginaryPart != 0) ) {
            System.out.println("i" + imaginaryPart);
            System.out.println("The number is purely imaginary");
        }
        else{
            System.out.println(realPartNumber + "+i" + imaginaryPart);
            System.out.println("The number is not purely imaginary");
        }

    }
}

public class Source {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PurelyImaginary num = new PurelyImaginary(in.nextDouble(), in.nextDouble());
        System.out.println(num.getImaginaryPart());
        num.checkComplex();
        num.checkPurelyImaginaryNumber();

    }
}

//Please do not change the class names provided, and edit only the indicated sections.

import java.util.*;

// Do not edit the Quadrilateral class
abstract class Quadrilateral {
    double side1;
    double side2;
    double side3;
    double side4;

    public Quadrilateral(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    protected abstract double getArea();

    protected double getPerimeter() {
        return (side1+side2+side3+side4);
    }
}

// Implement the Parallelogram class
class Parallelogram extends Quadrilateral {
    private double height;
    public Parallelogram(double side1, double side2, double height) {
        super(side1, side2, side1, side2);
        this.height = height;
    }

    protected double getArea(){
        return (side1 * height);
    }


}

// Implement the Rhombus class
class Rhombus extends Quadrilateral{
    private double height;
    public Rhombus(double side, double height) {
        super(side, side, side, side);
        this.height = height;
    }

    protected double getArea(){
        return (side1 * height);
    }

}

// Implement the Rectangle class
class Rectangle extends Quadrilateral{
    public Rectangle(double length, double breadth) {
        super(length, breadth, length, breadth);
        // Implement the Parallelogram class
    }

    protected double getArea(){
        return (side1 * side2);
    }
}

// Implement the Square class
class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side, side, side);
    }

    protected double getArea(){
        return (side2 * side1);
    }
}

// Do not edit the Test class
class Source {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Parallelogram
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double height = scan.nextDouble();
        Parallelogram parallelogram = new Parallelogram(side1, side2, height);
        System.out.println("Parallelogram Perimeter: " + parallelogram.getPerimeter());
        System.out.println("Parallelogram Area: " + parallelogram.getArea());

        //Rhombus
        double side = scan.nextDouble();
        height = scan.nextDouble();
        Rhombus rhombus = new Rhombus(side, height);
        System.out.println("Rhombus Perimeter: " + rhombus.getPerimeter());
        System.out.println("Rhombus Area: " + rhombus.getArea());

        //Rectangle
        double length = scan.nextDouble();
        double breadth = scan.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle Area: " + rectangle.getArea());

        //Square
        side = scan.nextDouble();
        Square square = new Square(side);
        System.out.println("Square Perimeter: " + square.getPerimeter());
        System.out.println("Square Area: " + square.getArea());

        scan.close();
    }
}

// Write your implementation for the SwordFighter interface here
interface SwordFighter {
    public final int maxSwordsWielded = 2;

    public abstract void attack();

    public abstract void escape();

    public abstract void showWeapon();
}

class Knight implements SwordFighter {

    @Override
    public void attack() {
        System.out.println("Knight stops the horse and attacks");
    }

    @Override
    public void escape() {
        System.out.println("Knight climbs the horse and flees");
    }

    @Override
    public void showWeapon() {
System.out.println("Shows Sword");
    }

    // please write the showWeapon() method for the Knight class here.
    // It should print out "Shows Sword" in a new line
}

class Ninja implements SwordFighter {

    @Override
    public void attack() {
        System.out.println("Ninja steps forward and attacks");
    }

    @Override
    public void escape() {
        System.out.println("Ninja gets into forest and flees");
    }

    @Override
    // please write the showWeapon() method for the Ninja class here.
    // It should print out "Shows Katana" in a new line
    public void showWeapon() {
        System.out.println("Shows Katana");
    }
}

public class Source {
    public static void main(String[] args) {
        //Interface variables are implicitly static and final
        System.out.println("Maximum swords that can be wielded: "+ SwordFighter.maxSwordsWielded);

        Knight knight = new Knight();
        Ninja ninja = new Ninja();

        knight.showWeapon();
        ninja.showWeapon();

        knight.attack();
        ninja.attack();

        knight.escape();
        ninja.escape();
    }

}

class Display {
    public Display(int i) {
        System.out.println("ONE");
    }

    public Display() {
        this(1);

        System.out.println("TWO");
    }

    void Display() {
        Display(1);

        System.out.println("THREE");
    }

    void Display(int i) {
        System.out.println("FOUR");
    }
}

public class Source {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.Display();
    }
}

class BalanceAmount  {
    int balance;
    public void setBalance(int amount)  {
        balance=amount;
    }
    public void incrementBalance()  {
        balance+=10;
    }
    public int getCurrentBalance()  {
        return  balance;
    }
}
public class Source {
    public static void main(String[] args) {
        BalanceAmount obj= new BalanceAmount();
        obj.setBalance(20);
        obj.incrementBalance();
        System.out.println(obj.getCurrentBalance());
        obj.balance=1000;
        System.out.println(obj.getCurrentBalance());
    }
}


import java.util.*;

abstract class Homeloan {
    double amount;
    int time;

    public Homeloan(double amount, int time) {
        this.amount = amount;
        this.time = time;
    }

    public Homeloan() {

    }

    //Write your code here
    public abstract double simpleInterest();

    public abstract double getRateOfIntererst();
}

class Bank1 extends Homeloan {

    //Write your code here
    public Bank1(double amount, int time) {
        super();
        this.amount = amount;
        this.time = time;
    }

    public double simpleInterest() {

        //Write your code here
        return this.amount * this.time * getRateOfIntererst()/100;
    }

    @Override
    public double getRateOfIntererst() {
        return 7.2;
    }
}

class Bank2 extends Homeloan {

    //Write your code here
    public Bank2(double amount, int time) {
        super();
        this.amount = amount;
        this.time = time;
    }

    public double simpleInterest() {
        return this.amount * this.time * getRateOfIntererst()/100;
    }
        //Write your code here
        @Override
        public double getRateOfIntererst() {
            return 8.1;
        }


}

class Source {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        int time = in.nextInt();
        Homeloan obj1 = new Bank1(amount, time);
        Homeloan obj2 = new Bank2(amount, time);
        if (obj1.simpleInterest() < obj2.simpleInterest()) {
            System.out.println("File for a loan in Bank1");
            System.out.println(obj1.simpleInterest() + amount);
        } else {
            System.out.println("File for a loan in Bank2");
            System.out.println(obj2.simpleInterest() + amount);
        }
    }

}



abstract class HomeLoan {
    public HomeLoan() {
        System.out.println("House 1");
    }

    abstract void numbers();
}

class Bank1 extends HomeLoan {
    public Bank1() {
        System.out.println("Bank1");
    }

    void numbers() {
        System.out.println("Rate of interest is 7.2");
    }
}

public class Source {
    public static void main(String[] args) {
        HomeLoan obj = new Bank1();
        obj.numbers();
    }
}

import java.util.*;

class SavingAmount {
    //write your code here
    private int saving;

    public void setInitialSaving(int saving) {
        this.saving = saving;
    }

    public int getCurrentSaving() {
        return saving;
    }

    public int incrementSaving(){
        this.saving += 1000;
        return getCurrentSaving();
    }

    public int decrementSaving(){
        this.saving -= 100;
        return getCurrentSaving();
    }

    public void checkSaving(){
        if (this.saving >= 1000){
            System.out.println("Congratulations! You have saved a good amount");
        }
        else if ((this.saving < 1000) && (this.saving >= 0)) {
            System.out.println("Insufficient saving!");
        }
        else {
            System.out.println("You are in debt");
        }
    }
}

public class Source {
    public static void main(String[] args) {

        SavingAmount obj = new SavingAmount();
        Scanner in = new Scanner(System.in);
        obj.setInitialSaving(in.nextInt());
        obj.decrementSaving();
        obj.incrementSaving();
        obj.checkSaving();
        System.out.println("Your current savings are Rs " + obj.getCurrentSaving());
    }
}

class Employee {

    private int empId;
    private String empFirstName;
    private String empSecondName;
    private double empSalary;

    //Write your code here
    public Employee(int empId, String empFirstName, String empSecondName, double empSalary) {
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empSecondName = empSecondName;
        this.empSalary = empSalary;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public String getEmpSecondName() {
        return empSecondName;
    }

    public double getEmployeeAnualIncome(){
        return this.empSalary * 12;
    }
}

public class Source {
    public static void main(String[] args) {

        //Write your code here
        Employee E1 = new Employee(101512031, "Sushil", "Kumar", 45000.58);
        Employee E2 = new Employee(101512032, "Tara", "Sharma",51000.99);

        System.out.println("employee full name " + E1.getEmpFirstName() + " " + E1.getEmpSecondName());
        System.out.println("employee annual package " + E1.getEmployeeAnualIncome());

        System.out.println("employee full name " + E2.getEmpFirstName() + " " + E2.getEmpSecondName());
        System.out.println("employee annual package " + E2.getEmployeeAnualIncome());
    }
}

/*
import java.util.*;

class Cards {
    int value;
    String suit;

    public void setCards(String suit, int r) {
        this.value = r;
        this.suit = suit;
    }

    //Write your code here.

    int getSuitPriority(String suitString) {
        int priority = 0;
        //Write your code here.
        switch (suitString) {
            case "spades":
                priority = 1;
                break;
            case "diamond":
                priority = 2;
                break;
            case "hearts":
                priority = 3;
                break;
            case "clubs":
                priority = 4;
                break;
        }
return priority;
    }


}

class ClassicGame {
    int points1 = 0;
    int points2 = 0;

    public void game(Cards c1, Cards c2) {

        //Write your code here.

        if (c1.value > c2.value) {
            points1 = 1;
        }
        else if (c2.value > c1.value) {
            points2 = 1;
        }
        else
        {
            if (c1.getSuitPriority(c1.suit) > c2.getSuitPriority(c2.suit)) {
                points2 += 1;
            }
            else if(c1.getSuitPriority(c1.suit) < c2.getSuitPriority(c2.suit)) {
                points1 += 1;
            }
            else {
                points1 += 1;
                points2 += 1;
            }
        }
        System.out.println("points of player 1 :" + " " + points1);
        System.out.println("points of player 2 :" + " " + points2);
    }

}

public class Source {

    public static void main(String[] args) {
        //Two objects (cards) of class Cards
        Cards c1 = new Cards();
        Cards c2 = new Cards();
        Scanner in = new Scanner(System.in);
        //Enter the suit of card 1
        String s1 = in.nextLine();
        c1.setCards(s1, in.nextInt());
        in.nextLine();
        //Enter the suit of card 2
        String s2 = in.nextLine();
        c2.setCards(s2, in.nextInt());
        ClassicGame c = new ClassicGame();

        c.game(c1, c2);
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Source{

    // DO NOT CHANGE THIS MAIN METHOD!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLineCoordinates = br.readLine().split(" ");
        int a1 = Integer.parseInt(firstLineCoordinates[0]);
        int b1 = Integer.parseInt(firstLineCoordinates[1]);

        String[] secondLineCoordinates = br.readLine().split(" ");
        int a2 = Integer.parseInt(secondLineCoordinates[0]);
        int b2 = Integer.parseInt(secondLineCoordinates[1]);

        Line firstLine = new Line(a1, b1);
        Line secondLine = new Line(a2, b2);

        int totalSumOfLines = getTotalSumOfLines(firstLine, secondLine);
        System.out.println(totalSumOfLines);

        br.close();
    }

    private static int getTotalSumOfLines(Line firstLine, Line secondLine) {

        // Complete this method

return ((firstLine.getB() - firstLine.getA()) + (secondLine.getB() - secondLine.getA()));
    }

    public static class Line {
        private int a;
        private int b;

        public Line(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }
    }
}


 */

