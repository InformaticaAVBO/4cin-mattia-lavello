public class App {
    public static void main(String[] args) throws Exception {
        Coppia<String, Persona> p1 = new Coppia<String, Persona>("Lave", new Persona("Mattia", "Lavello"));
        Coppia<String, Persona> p2 = new Coppia<String, Persona>("Franci", new Persona("Francesco", "Colombari"));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Primo: " + p1.getPrimo() + "\nSecondo: " + p1.getSecondo());

        Stack s = new Stack();
        s.push(new Persona("Mattia", "Lavello"));
        s.push(new Persona("Francesco", "Colombari"));
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        /* 
        Vettore<String> x = new Vettore<String>(0, 0); //classe generica
        for (int i=0; i<23; i++)
            x.add("Juve_" + i);
        System.out.println(x);
        
        System.out.println(x.get(3));
        System.out.println(x.get(3).getClass());
        
        Vettore<Persona> elenco = new Vettore<Persona>(10, 5);
        elenco.add(new Persona("Mattia", "Lavello"));
        elenco.add(new Persona("Francesco", "Colombari"));
        System.out.println(elenco);
       */
        
    }
}