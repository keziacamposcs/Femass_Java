import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
        int j;

        for (int i=0; i<5; i++)
        {
            j = 1+(int) (Math.random()*10);

            for (j=0; j>=5;j++)
            {
                JOptionPane.showMessageDialog(null,"\n: "+j);
            }

        }

    }
    
}
