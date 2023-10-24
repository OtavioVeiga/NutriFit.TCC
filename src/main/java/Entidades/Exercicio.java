package Entidades;
   
public class Exercicio {

        private String musculo;
        private String nivel;
        private String nome;

        public Exercicio() {
            
        }

        public Exercicio(String musculo, String nivel, String nome) {
            this.musculo = musculo;
            this.nivel = nivel;
            this.nome = nome;
        }

        public String getMusculo() {
            return musculo;
        }

        public void setMusculo(String musculo) {
            this.musculo = musculo;
        }

        public String getNivel() {
            return nivel;
        }

        public void setNivel(String nivel) {
            this.nivel = nivel;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }
    