package sistema;

import java.util.Scanner;
import excessao.UsuarioNaoEncontradoException;
import excessao.SenhaIncorretaException;

public class LoginSystem {
    // Credenciais válidas para o exemplo
    private static final String USUARIO_VALIDO = "admin";
    private static final String SENHA_VALIDA = "12345";
    
    // Método de login que lança exceções personalizadas
    public static void login(String usuario, String senha)
            throws UsuarioNaoEncontradoException, SenhaIncorretaException {
        
        if (!usuario.equals(USUARIO_VALIDO)) {
            throw new UsuarioNaoEncontradoException("Usuário não encontrado: " + usuario);
        }
        
        if (!senha.equals(SENHA_VALIDA)) {
            throw new SenhaIncorretaException("Senha incorreta para o usuário: " + usuario);
        }
        
        System.out.println("Login realizado com sucesso!");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite o nome do usuário: ");
            String usuario = sc.nextLine();
            
            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();
            
            login(usuario, senha);
        } catch (UsuarioNaoEncontradoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (SenhaIncorretaException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
