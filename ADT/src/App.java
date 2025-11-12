public class App {
    public static void main(String[] args) throws Exception {
        Vettore<String> x = new Vettore<String>(0, 0); //classe generica
        for (int i=0; i<23; i++)
            x.add("Juve_" + i);
        System.out.println(x);
        
        System.out.println(x.get(3));
        System.out.println(x.get(3).getClass());

        Vettore<Persona> elenco = new Vettore<Persona>(10, 5);
    }
}