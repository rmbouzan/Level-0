import javax.swing.JOptionPane;


public class VotingBooth {
public static void main(String[] args) {
String answer = JOptionPane.showInputDialog("How old are you?");
int age = Integer.parseInt(answer);
if(age >= 18){
	JOptionPane.showMessageDialog(null, "Go vote for our country!");
}
else{
	int answer2 = age=18-age;
	JOptionPane.showMessageDialog(null, "Wait "+age+" years until you can vote");
}
}
}
