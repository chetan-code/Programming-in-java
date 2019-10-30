/**
 * Creating an interface
 * An interface is a blueprint of a class --> its specify what class must do and not how!
 * Methods in interface are public and abstract by default
 * Variables in interface are public(full access), static(intantiated once) and final(can't change);
 * It help us achieve multiple inheritance/abstraction!
 */

package myInterface;//package name 

public interface anInterface
{
   //final public static int a = 10;
   int a = 10 ; // final public and static by default;
   void display();//methods with no body and are public and abstract by default;
}
