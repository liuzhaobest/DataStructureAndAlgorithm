package berkeleyCS61B;

public class Dog{
    public int size;

    public Dog(int startSize){
        size = startSize;
    }
    public void makeNoise(){
        if(size < 30){
            System.out.println("Bark!");
        }
        else{
            System.out.println("Woof");
        }
    }


    public static Dog maxDog(Dog d1, Dog d2){
        if(d1.size > d2.size)
            return d1;
        return d2;
    }
}