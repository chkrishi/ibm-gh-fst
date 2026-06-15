package Activity5;

abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

class MyBook extends Book {

    @Override
    void setTitle(String s) {
        this.title = s;
    }
}
//Activity 5
//In this activity we use the Abstract Class to show implementation of Abstraction.
//
//For this activitiy:
//
//Create an abstract class Book that has:
//title of type String
//an abstract method setTitle() that takes one String argument.
//a concrete method getTitle() that returns the value of title.
//Create another class that extends the abstract class called MyBook.
//MyBook defines the setTitle() method to assign the value of title as the argument.