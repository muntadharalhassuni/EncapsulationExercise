package com.company;
//in this exercise you will create one class and name it Printer.
public class Printer {
 //this class will have two member variables of type int, tonerlevel and pagesPrinted
    private int tonerLevel;
    //pages printed
    private int pagesPrinted;
//one of type boolean called duplex
    private boolean duplex;
//all three fields will have private access.

 //the constructor will accept wo of these variables tonerlevel and duplex as parameters


    public Printer(int tonerLevel, boolean duplex) {
//as parameters following these rules
//tonerLevel must be greater than -1 but less than or equal to 100
//if it does not meet these conditions than it should be initialized to -1
        if(tonerLevel > -1 && tonerLevel <= 100)
        {
            this.tonerLevel = tonerLevel;
        } else
        {
            this.tonerLevel = -1;
        }
//duplex should be initialized to the value of the parameter
        this.duplex = duplex;
//in addition, pagesPrinted should be initialized to 0
        this.pagesPrinted = 0;
    }
//addToner will accept one parameter tonerAmount of type int
    public int addToner(int tonerAmount)
    {
//tonerAmount should be greater than 0 and less than or equal to 100
        if(tonerAmount > 0 && tonerAmount <= 100)
        {
//if the condition is met
// a second test must be included to test whether tonerLevel plus tonerAmount is greater than 100
//if so the method should return -1.
        if(this.tonerLevel + tonerAmount > 100)
        {
            return -1;
        }
//if not then tonerLevel should have the incoming tonerAmount added to it
// and then new tonerLevel should then be returned by the method
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
        }else
        {
//also, if initial condition test fails, then the method should return -1
            return -1;
        }
    }
//printPages will accept one parameter, pages of type int.

public int printPages(int pages)
{
//a variable called pagesToPrint should be created and initialized to the value of the incoming parameter.
    int pagesToPrint = pages;
//a conditional check should be performed on whether the printer class field, duplex is either true or false

    if(this.duplex)
    {
//if true then a calculation must be performed to determine the number of pages needed to print the job double-sided.

      pagesToPrint = (pages/2) + (pages%2);
        System.out.println("Printing in duplex mode");
    }
//the pagesToPrint value is then added to the class field pagesPrinted,


    this.pagesPrinted += pagesToPrint;

//but the value of pagesToPrint should be returned by the method.
    return pagesToPrint;

}
//getPagesPrinted has no parameters
// and merely returns the value of the member variable pagesPrinted

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
