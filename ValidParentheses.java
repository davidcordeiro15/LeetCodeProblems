import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            // Adiciona o caractere de abertura à pilha
            if (x == '(' || x == '{' || x == '[') {
                stack.push(x);
            } else {
                // Verifica se a pilha está vazia ou se o caractere não corresponde ao esperado
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                
                if ((x == ')' && top != '(') ||
                    (x == '}' && top != '{') ||
                    (x == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        // Retorna verdadeiro se a pilha estiver vazia
        return stack.isEmpty();
    }
}
