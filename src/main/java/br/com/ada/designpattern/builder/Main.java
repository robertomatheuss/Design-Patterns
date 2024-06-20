package br.com.ada.designpattern.builder;

public class Main {
    public static void main(String[] args) {
        PessoaProblem pessoa = new PessoaProblem.PessoaBuilder()
                .nome("Lucas")
                .documento("3224354")
                .sobrenome("SobreNome")
                .apelido("Apelido")
                        .build();


        PessoaProblem.builder().nome("Nome").build();
        new PessoaProblem.PessoaProblemBuilder().nome("Nome").build();


        System.out.println(pessoa);
    }
}
