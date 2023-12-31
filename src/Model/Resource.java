package Model;

import java.io.Serializable;

import Utils.InvalidValueException;

/**
 * The class that stores the resources used for every project
 * @author Group2
 * @version 1.0
 */
public class Resource implements Serializable
{
    private double materialExpenses;
    private double manHours;
    private double expectedTotalHours;
    private double expenses;

    /**
     * The constructor for the "Resource" class
     * @param materialExpenses total number of materials used
     * @param manHours total number of hours worked per person
     * @param expectedTotalHours expected number of hours to be worked per person
     * @param expenses total amount of money necessary
     */
    public Resource(double materialExpenses, double manHours, double expectedTotalHours, double expenses)
    {
        if(materialExpenses < 0) throw new InvalidValueException("material expenses");
        if(manHours < 0) throw new InvalidValueException("man hours");
        if(expectedTotalHours < 0) throw new InvalidValueException("expected total hours");
        if(expenses < 0) throw new InvalidValueException("expenses");
        this.materialExpenses = materialExpenses;
        this.manHours = manHours;
        this.expectedTotalHours = expectedTotalHours;
        this.expenses = expenses;
    }

    /**
     * Setter method for materialExpenses
     * @param materialExpenses new value for materialExpenses
     */
    public void setMaterialExpenses(double materialExpenses) {
        if(materialExpenses < 0) throw new InvalidValueException("material expenses");
        this.materialExpenses = materialExpenses;
    }

    /**
     * Getter method for materialExpenses
     * @return materialExpenses
     */
    public double getMaterialExpenses() {
        return materialExpenses;
    }

    /**
     * Setter method for manHours
     * @param manHours new value for manHours
     */
    public void setManHours(double manHours) {
        if(manHours < 0) throw new InvalidValueException("man hours");
        this.manHours = manHours;
    }

    /**
     * Getter method for manHours
     * @return manHours
     */
    public double getManHours() {
        return manHours;
    }

    /**
     * Setter method for expectedTotalHours
     * @param expectedTotalHours new value for expectedTotalHours
     */
    public void setExpectedTotalHours(double expectedTotalHours) {
        if(expectedTotalHours < 0) throw new InvalidValueException("expected total hours");
        this.expectedTotalHours = expectedTotalHours;
    }

    /**
     * Getter method for expectedTotalHours
     * @return expectedTotalHours
     */
    public double getExpectedTotalHours() {
        return expectedTotalHours;
    }

    /**
     * Setter method for expenses
     * @param expenses new value for expenses
     */
    public void setExpenses(double expenses) {
        if(expenses < 0) throw new InvalidValueException("expenses");
        this.expenses = expenses;
    }

    /**
     * Getter method for expenses
     * @return expenses
     */
    public double getExpenses() {
        return expenses;
    }

    /**
     * Overriding method "equals" for comparing 2 resource objects
     * @param obj object that is compared to this object
     * @return true if the objects equal each other, false otherwise
     */
    public boolean equals(Object obj)
    {
        if(obj == null || obj.getClass() != getClass())
            return false;
        Resource resource = (Resource) obj;
        return materialExpenses == resource.materialExpenses &&
                manHours == resource.manHours &&
                expectedTotalHours == resource.expectedTotalHours &&
                expenses == resource.expenses;
    }

    /**
     * Overriding method "toString" for the resource objects
     * @return the values in the fields of this class as strings
     */
    public String toString()
    {
        return "Material expenses: " + materialExpenses +
                ", Man hours: " + manHours +
                ", Expected total hours: " + expectedTotalHours +
                ", Expenses: " + expenses;
    }
}
