public class Ex4corrigido {
    public static void main(String[] args) {
        
        String frase = JOptionPane.showInputDialog("Informe a frase a ser invertida");
            
        //Invertendo dígito a dígito da frase 
        for(int i=frase.length()-1; i>=0; i--){
            if(!" ".equals(String.valueOf(frase.charAt(i)))){
                System.out.print(frase.charAt(i));
            }
        }
        System.out.println();
        
        //Invertendo a ordem das palavras da frase
        for(int i=frase.split(" ").length-1; i>=0; i--){
            System.out.print(frase.split(" ")[i]);
        }
        System.out.println();
        
        
    }
}
