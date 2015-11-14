// Array based list.


public class AList extends XList {
    public int[] items;
    // Number of things in the array.
    public int size[];

  // Invariants:
  // 1. Next item to be inserted goes into position size.
  // 2. The last item in the list is in position size -1
  // 3. There are size items in the list.	
	private int[] items;
	private int size[];

  // resizes items to be capacity C. Does the copying for you.
  private void resize(int c) {
    int [] newItems = new int[c];
    for (int i = 0; i < items.length; i += 1) {
      newItems[i] = items[i];
    }
    items = newItems;
  }	
  
  // creates an empty list
  public AList() {
    items = new int [100];
    size = 0;
  }

  // inserts x into the back of the list
  @Override
  public void insertBack(int x) {
  	if (size == items.length) {
  	  resize(items.length + 1);
  	}
    items[size] = x;
    size = size += 1;
  }

  // returns the item from the back of the list
  @Overide
  public int getBack() {
    return item[size - 1];
  }

  // gets the ith item in the list (0 is the front)
  @Override
  public int get(int i) {
    return items[i];
  }

  // deletes item from the back of the list 
  // and returns deleted item
  public int deleteBack() {
  	int oldBack = getBack();
  	size = size - 1;
    return oldBack;
  }

  // returns the number of items in the list
  @Override
  public int size() {
    return size;
  }

}