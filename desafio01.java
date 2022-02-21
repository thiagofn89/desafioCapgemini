class Desafio01 {
    
	/*
	 * A função 'escada' recebe um inteiro, que indica o tamanho da escada e
	 * retorna uma string em que a base e altura da escada são iguais ao valor de n
	 */
    public static String escada(int n){
        String aux = "";
        
		// O primeiro 'for' é utilizado para delimitar a altura da escada
        for (int i=0; i<n; i++){
			// O segundo 'for' é utilizado para categorizar qual string será utilizado por vez na linha 'i'
            for (int j=0; j<n; j++){
				// Separando os espaços dos asteriscos
                if(j<n-i-1){
                    aux += " ";    
                } else {
                    aux += "*";
                }
            }
            aux += "\n";
        }
        
        return aux;
    }
    
    public static void main(String[] args) {
		// A variável n indica o tamanho da escada
        int n = 6;
		
        System.out.println(escada(n)); 
    }
}