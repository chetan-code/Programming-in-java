// code sharing throught super concept
//the method of subclass will override the method of super if the name is SAME!
//example of runtime polymorphism
class CodeSharingThroughSuper{
    public static void main(String args []){
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        tiger.speak();
        lion.isRealLion = false;
        lion.speak();
        lion.isRealLion = true;
        lion.speak();
    }
}




class Cat {
    void speak() {
        System.out.println("Meow!");
    }
} 

class Tiger extends Cat {
    void speak() { // <-- method ovveride super method of same name
       System.out.println("ROAAAAAAR");//tu tiger hai roar kar roar
    }
}

class Lion extends Cat {
    static boolean isRealLion;
    void speak() {
        if(isRealLion){
            System.out.println("Im the KING of Jungle!");
        }else{
            //fake lion sala
            super.speak();//it just a pussy cat <-- calling speak() of super class
        }
    }
}
