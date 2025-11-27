class BaseClass {
    public void display() {
        System.out.println("This is method of Base class");
        System.out.println("-----------------------------------");
    }

    public void welcome() {
        System.out.println("Welcome to my page");
        System.out.println("-----------------------------------");
    }
}

/*---- Derived class ---- */
class DerivedClass extends BaseClass {
    public void greeting() {
        System.out.println("Good Morning");
        System.out.println("-----------------------------------");
    }

    // overrided method
    public void display() {
        System.out.println("This is the method of Derived class");
        System.out.println("-----------------------------------");
    }
}

/*---- Initial class ----*/
class MethodOverridingExample {
    public static void main(String[] args) {
        /* ----- Object of BaseClass ---- */
        System.out.println("------ Object of Base class ------");
        BaseClass obj1 = new BaseClass();
        obj1.welcome();
        obj1.display();
        // obj1.greeting();
        /*
         * It is not possible as method of derived class cannot be accessed by baseclass
         */

        /*------ Object of Derived class ---- */
        DerivedClass obj2 = new DerivedClass();
        System.out.println("------ Object of Derived Class -----");
        obj2.welcome();
        obj2.display();
        obj2.greeting();
        /*-------------------------------------------------------------- */
        /*---- Object of Derived class from the reference of base class ----- */
        BaseClass obj3 = new DerivedClass();
        System.out.println("----- Object of Derived class from the reference of Basec class");
        obj3.welcome();
        obj3.display();
        // obj3.greeting();

    }
}