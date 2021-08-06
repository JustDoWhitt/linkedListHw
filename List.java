public interface List<T>{

    public void add(T item); //adds an item to the end of a list
    public boolean remove(T item); //removes a specified item from the list, returns true if successful, false if not
    public int size(); //returns the size of the list
    public boolean isEmpty(); // tells you if the list is empty, returns true if empty, false if not

}