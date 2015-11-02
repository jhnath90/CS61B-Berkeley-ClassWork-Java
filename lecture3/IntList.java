// Defines a recursive list of integers

public class IntList {
  public int head;
  public IntList tail;

  public IntList(int h, IntList t) {
    head = h;
    tail = t;
  }

// Returns the sie of the int list
public int size() {
  if (tail == null)
  	  return 1;
  	int personInFrontOfMeSize  = tail.size();
  	return personInFrontOfMeSize + 1;
}

// Interative methods are often uglier.
public int iterativeSize() {
  IntList p = this;
  int size = 0;
  while (p != null) {
    size = size + 1;
    p = p.tail;
  }
  return size;
}

// Size
public int get(int i) {
  if (i == 0) {
  	return this.head;
  }
  return this.tail.get(i - 1);
}  

 public static void main(String[] args) {
    IntList L = new IntList(10, null);
    L.tail = new IntList(15, null);
    System.out.println(L.head);
    System.out.println(L.tail.head);
    System.out.println(L.size());
    System.out.println(L.iterativeSize());
    System.out.println(L.get(0));
  }
}