package myInterface;//declarationm of the package(AS WE CREATED NEW FOLDER INSIDE WORKIN DIR)

/**
 * HERE WE HAVE a interface in another folder
 * it has lost of constant ...which many class can access by implementing it
 * this explaings usefulness of interfaces
 */


public interface SharedConstants
{
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;//////public static and final by default
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
    //we can have many more vars and method here
}
