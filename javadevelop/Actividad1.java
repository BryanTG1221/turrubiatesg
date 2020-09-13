public class Actividad1 {
    public static void main(String[] args) {
        int ValorAnterior= 0;
        int ValorSiguiente= 0;
        int ValorProximo = 1;

        do {
            ValorAnterior=ValorSiguiente;
            ValorSiguiente=ValorProximo;
            ValorProximo = ValorAnterior + ValorSiguiente;
            System.out.println(ValorProximo);

        } while (ValorProximo < 100);
        
    }
}
