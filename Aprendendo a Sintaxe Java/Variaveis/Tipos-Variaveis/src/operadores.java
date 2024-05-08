public class operadores {
    public static void main(String[] args) {
        
        String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto);

        //x repeticao 

        int numero =5;
        numero++;
        System.out.println(numero);

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        int a,b;
        a = 6;
        b = 6;

        String resultado = a==b ? "Verdadeiro" : "Falso"; //if ternario 
        System.out.println(resultado);

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }
        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeiras");
        }
    }
}
