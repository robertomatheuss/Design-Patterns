package br.com.ada.designpattern.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PessoaProblem {
    private String nome;
    private String sobrenome;
    private String documento;
    private String apelido;

    public static class PessoaBuilder{
        private String nome;
        private String sobrenome;
        private String documento;
        private String apelido;

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public PessoaBuilder documento(String documento) {
            this.documento = documento;
            return this;
        }

        public PessoaBuilder apelido(String apelido) {
            this.apelido = apelido;
            return this;
        }

        public PessoaProblem build(){
            return new PessoaProblem(this.nome,this.apelido,this.documento,this.apelido);
        }
    }
}
