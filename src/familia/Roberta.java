package familia;

public class Roberta {
    public DNA getDNA() {
        return new DNA("Sorriso Lindo", "Determinação", "Organização");
    }

    public Gestacao gestacao(DNA[] composicaoGenetica) {
        System.out.println("Roberta: Recebi o amor do papai e da mamãe. Iniciando a mágica da vida...");
        return new Gestacao();
    }
    
    public class Gestacao {
        public void esperarMeses(int meses) {
            for (int i = 1; i <= meses; i++) {
                try {
                    System.out.println("Mês " + i + ": O bebê está crescendo... ❤️");
                    Thread.sleep(1000); // 1 segundo por mês para dar emoção
                } catch (InterruptedException e) {
                    System.out.println("Bebê saudável !!! (" + e.getMessage() + ")");
                }
            }
            
        }
    }
}
