package DogTracker;
import java.io.*;

// By implementing Serializable interface
// we make sure that state of instances of class DogStepTracker
// can be saved in a file.
class DogStepTracker implements Serializable {
    private static final long serialVersionUID = 1L;

    int steps = 500;
    String dogName = "Max";
    String dogBreed = "Black Lab";
    String owner = "Kyle";
    

    // DogStepTracker class constructor
    public DogStepTracker(int steps, String dogName) {
        this.steps = steps;
        this.dogName = dogName;
    }
}

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        int steps = 500;
        String dogName = "Max";
        String dogBreed = "Black Lab";
        String owner = "Kyle";
        DogStepTracker tracker = new DogStepTracker(steps, dogName, dogBreed, owner);

        // Serializing 'tracker'
        FileOutputStream fos = new FileOutputStream("dog_tracker.data");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(tracker);

        // De-serializing 'tracker'
        FileInputStream fis = new FileInputStream("dog_tracker.data");
        ObjectInputStream ois = new ObjectInputStream(fis);
        DogStepTracker deserializedTracker = (DogStepTracker) ois.readObject(); // down-casting object

        System.out.println("Dog Name: " + deserializedTracker.dogName + ", Steps: " + deserializedTracker.steps);

        // closing streams
        oos.close();
        ois.close();
    }
}