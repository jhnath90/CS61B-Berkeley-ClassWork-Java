public class Dog {
	public int size;

	// This is a constructor. It explains how to
	// construct dogs. In this case each dog must be
	// created with an integer, and it is used as the 
	// size.
	// def_init_(self, startSize):

	public Dog(int startSize) {
	  size = startSize;
	}

	// Why did static go away? Be patient

	 public void makeNoise() {
	   if (size < 10) {
	     System.out.println("horrific yapping");
	   } else if (size < 30) {
	   	 System.out.println("bark.");
	   } else {
         System.out.println("woof woof"); 
       }
    }

    public static Dog maxDog(Dog d1, Dog d2) {
      if (d1.size > d2.size)
      	return d1;
      return d2;
    }
}
 