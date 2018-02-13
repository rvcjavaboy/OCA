public class ObjectEqualTest implements Cloneable{
String hello="Hello";

  public boolean equals(String s){

    return hello.equals(s);
  }
public static void main(String[] args)throws Exception {

  ObjectEqualTest o=new ObjectEqualTest();
  ObjectEqualTest o1=new ObjectEqualTest();
  //  o.hello="Hi";
  ObjectEqualTest obj=(ObjectEqualTest)o.clone();
    System.out.println(o.equals(o1));
  //  o=o1;
    System.out.println(o.hello.equals(o1.hello));
    System.out.println(o==o1);
}



}
