public class RefVarToMethod {

          public static void main(String[] args) {
               
           int variable1  = 119;
           System.out.println("variable1 before calling method1 " + variable1);
           method1(variable1);
           System.out.println("variable1 after calling method1 " + variable1);
     
           SimpleObject object = new SimpleObject();
           System.out.println(object); 
           object.setInstVar(1);
           System.out.println(object.getInstVar()); 
     
           // Let's pass a reference variable(= the address of object1) to method
           method2(object); 
           /* While we are in the method, we use the address of obj1 to travel to the object
           * to make a change to the instance variable (instVar).
           *
           * Even though this method ends, obj1 is destroyed, 
           * we’ve already made a change the instance variable in this object.
           * = This method can manipulate the object. 
           */
           System.out.println(object.getInstVar());
        }
     
        public static void method1 (int variable1)
        {
          variable1 += 1;
          System.out.println("variable1 in method1 after changing it " + variable1);
        }
     
        public static void method2 (SimpleObject object)
        {
           System.out.println(object);
           System.out.println(object.getInstVar());
           object.setInstVar(1000);
           System.out.println(object.getInstVar());
        }
}
