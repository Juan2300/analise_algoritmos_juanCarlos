import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ContaNomesComDicionario {
    public static void main(String[] args) {
        
        Map<String, Integer> contagem = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("nomes.txt"))) {
            String linha;

            
            while ((linha = reader.readLine()) != null) {
                String nome = linha.trim(); 

                if (nome.isEmpty()) {
                    continue;
                }

                
                contagem.put(nome, contagem.getOrDefault(nome, 0) + 1);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        
        for (Map.Entry<String, Integer> entrada : contagem.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
