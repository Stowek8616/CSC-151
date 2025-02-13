import javax.swing.JOptionPane;

public class NumberProcessor {

    public static void main(String[] args) {

        NumberProcessor processor = new NumberProcessor();
        
        Integer num1 = processor.getInteger();
    }
    
    public Integer getInteger() {
        Integer answer = -1;
        while (answer == -1) {
            String userInput = JOptionPane.showInputDialog("Enter an integer:");

            answer = this.process(userInput); // use ourselves (this)

            if (answer == -1) {
                JOptionPane.showMessageDialog(null,"That's not an Integer, please try again.");
            }
            else {
                // Debug message
                JOptionPane.showMessageDialog(null, "You entered: " + answer);
            }
        }
        return answer;  
    }
    
    public Integer process(String input) {
 
        Integer number = -1; 

        try {
            number = Integer.parseInt(input);
        }
        catch (NumberFormatException e) {
            System.err.println(input + " is not an Integer!");
        }
        return number;        
    }
}