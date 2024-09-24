public class Aluno{

    // Atributos
    private String nome;
    private int ra;
    private double notaFinal;
    private APROVACAO status;
    
    // CONSTURTORES
    // Construtor vazio
    public Aluno(){
    }

    // Construtor padrão
    public Aluno(String nome, int ra){
        this.nome = nome;
        this.ra = ra;
    }

    // MÉTODOS
    // Aprovação
    private APROVACAO aprovacao(MODALIDADE modalidade, double presenca){
        APROVACAO aprovacao = null;
        if(modalidade == modalidade.PRESENCIAL && presenca < 75){
            return aprovacao.REPROVADO;

        }else if(modalidade == modalidade.PRESENCIAL && this.notaFinal < 5){
            return aprovacao.REPROVADO;

        }else{
            return aprovacao.APROVADO;
        }
    }
    // Duas notas
    public void disciplina(MODALIDADE modalidade, double presenca, double nota1, double nota2){
        APROVACAO status = null;
        this.notaFinal = (nota1+nota2)/2;

        status = aprovacao(modalidade, presenca);
    }

    // Três notas
    public void disciplina(MODALIDADE modalidade, double presenca, double nota1, double nota2, double nota3){
        APROVACAO status = null;
        this.notaFinal = (nota1+nota2*2+nota3*4) /7;

        status = aprovacao(modalidade, presenca);
    }

    // Todas as notas
    public void disciplina(MODALIDADE modalidade, double presenca, double nota1, double nota2, double nota3, double nota4){
        APROVACAO status = null;
        this.notaFinal = (nota1*0.15) + (nota2*0.3) + (nota3*0.10) + (nota4*0.45);

        status = aprovacao(modalidade, presenca);
    }

    // Função ficha
    public String ficha(){
        String ficha = "\nNome: "+ nome +"\nRA: "+ String.valueOf(ra) +"\nNota Final: "+ String.valueOf(notaFinal);
        return ficha; 
    }

    // GETTERS
    // Getter nome
    public String getNome() {
        return nome;
    }

    // Getter ra
    public int getRa() {
        return ra;
    }
    
    // Getter notaFinal
    public double getNotalFinal() {
        return notaFinal;
    }
    
    // Getter status
    public APROVACAO getStatus() {
        return status;
    }

    // SETTER
    // Setter nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Setter ra
    public void setRa(int ra) {
        this.ra = ra;
    }
    
    // Setter notaFinal
    public void setNotalFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    // Setter status
    public void setStatus(APROVACAO status) {
        this.status = status;
    }
}

enum APROVACAO{
    APROVADO, REPROVADO;
}

enum MODALIDADE{
    EAD, PRESENCIAL;
}