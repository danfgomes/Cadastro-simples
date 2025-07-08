public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String senha = "java23";

    public boolean acesso = false;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    void validarAcesso(){
        boolean nomeValido = nome != null && nome.matches("^[A-Za-zÀ-ÿ ]+$");

        boolean cpfValido = cpf != null && cpf.matches("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");

        boolean emailValido = email != null && email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

        boolean senhaValida = senha != null && senha.equals(senha);

        if (nomeValido && cpfValido && emailValido && senhaValida) {
            acesso = true;
            System.out.println("✅ Dados válidos. Cadastro aprovado!");
    } else {
            acesso = false;
            System.out.println("❌ Dados inválidos. Verifique os seguintes campos:");
            if (!nomeValido) System.out.println("- Nome inválido (apenas letras e espaços são permitidos).");
            if (!cpfValido) System.out.println("- CPF inválido (use o formato 000.000.000-00).");
            if (!emailValido) System.out.println("- E-mail inválido (ex: exemplo@email.com).");
            if (!senhaValida) System.out.println("- Senha fraca (mínimo 8 caracteres, com letra, número e símbolo).");
        }
}
}
