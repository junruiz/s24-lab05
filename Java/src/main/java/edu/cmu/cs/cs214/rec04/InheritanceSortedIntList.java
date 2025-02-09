package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList {
    private int totalAdded;

    public InheritanceSortedIntList() {
        super();
        this.totalAdded = 0;
    }

    /**
     * Adds the specified int to the list.
     *
     * @param num an integer to be added to the list
     * @return true if the list is changed as a result of the call
     */
    @Override
    public boolean add(int number) {
        totalAdded++; // Increment totalAdded for each attempted insertion
        return super.add(number); // Call the superclass's add method to maintain sorting
    }

    /**
     * Adds all of the elements of the IntegerList to the list.
     * Calls add() on each element of list. Can be overwritten
     * for more specific behavior.
     *
     * @param list IntegerList containing elements to be added to the list
     * @return true if the list changed as a result of the call
     */
    @Override
    public boolean addAll(IntegerList intList) {
        return super.addAll(intList);
    }

    /**
     * Returns the total number of attempted insertions to the list.
     * 
     * @return the total number of attempted insertions
     */
    public int getTotalAdded() {
        return totalAdded;
    }
}