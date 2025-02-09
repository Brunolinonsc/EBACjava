public class HelloWord {
    
//    public static void main(String[] args) {
//        System.out.println("Olá " + args[0] + " " + args[1]);
//    }

    public static void main(String[] args) {
        String ambiente = args[0];
        if (ambiente.equals("DEV")){
            System.out.println("Executando em DEV");
        }else if (ambiente.equals("TESTE")){
            System.out.println("Executando em TESTE");
        }else {
            System.out.println(ambiente);
        }
        
    }
}