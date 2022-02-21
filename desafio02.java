class Desafio02 {
    
    public static int verificaTamanhoSenha(String senha){
        int aux = 0;
        // Verifica se o campo 'senha' é diferente de nulo
        if(senha != null){
            // Calcula quantos digitos necessários para o tamanho de 'senha' ser 6
            aux = 6-senha.length();    
        }
        
        // Caso a váriavel 'aux' seja maior que '0', significa que o campo senha não contem 6 caracteres.
        if(aux > 0){
            return aux;
        } else {
            return 0;
        }
    }
    
    public static String verificaRequisitosSenha(String senha){
        String aux = "";
        boolean letraMaiuscula = false, letraMinuscula = false, numero = false, caracteresEspeciais = false;
        if(senha != null){
            // Laço que verifica caracter por caracter se contem  digitos, letras em minúsculo, letras em maiúsculo e caractere especial. Caso possua ao menos um, seta a variavel booleana pra 'true'.
            for(int i=0; i<senha.length(); i++){
                char c = senha.charAt(i);
                if ('a' <= c && c <= 'z') {
                    letraMinuscula = true;
                }
                if ('A' <= c && c <= 'Z') {
                    letraMaiuscula = true;
                }
                if('0' <= c && c <= '9') {
                    numero = true;
                }
                if(c == '!' || c == '@' || c == '#' || c == '$' ||
                   c == '%' || c == '^' || c == '&' || c == '*' ||
                   c == '(' || c == ')' || c == '-' || c == '+') {
                    caracteresEspeciais = true;
                }
            }
        }
        
        if(!letraMaiuscula){
            aux += "E obrigatorio conter letras maiusculas";
        }
        if(!letraMinuscula){
            aux += "E obrigatorio conter letras minusculas";
        }
        if(!numero){
            aux += "E obrigatorio conter numeros";
        }
        if(!caracteresEspeciais){
            aux += "E obrigatorio conter caracteres especiais";
        }
        return aux;
    }
    
    public static void main(String[] args) {
        //Variavel 'senha' indica a senha a ser analisada
        String senha = "Ya3";
        //A função 'verificaTamanhoSenha' verifica quantos caracteres o campo 'senha' contem, e, caso necessário, retorna a quantidade de caracteres que falta para o campo 'senha' conter o tamanho minimo obrigatório (igual a 6). Caso o campo senha conter 6 ou mais caracteres, a função retornará o digito 0.
        System.out.println(verificaTamanhoSenha(senha));
        
        // Função extra criada para verificar o restante dos requisitos apontados na questão. Ou seja, verifica se a senha contem digitos, letras em minúsculo, letras em maiúsculo e caractere especial.
        System.out.println(verificaRequisitosSenha(senha));
    }
}