package berkeleyCS61B;

public class DogLauncher{
    public static void main(String[] args)
    {
        Dog maya = new Dog(200);
        Dog yapster = new Dog(5);
        Dog.maxDog(maya,yapster).makeNoise();
    }
}