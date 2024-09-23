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
    // Duas notas
    public void disciplina(MODALIDADE modalidade, double presenca, double nota1, double nota2){
        APROVACAO status = null;
        this.notaFinal = (nota1+nota2)/2;

        if(modalidade == modalidade.PRESENCIAL && presenca < 75){
            status = status.REPROVADO;

        }else if(modalidade == modalidade.PRESENCIAL && this.notaFinal < 5){
            status = status.REPROVADO;

        }else{
            status = status.APROVADO;
        }
    }

    // Três notas
    public void disciplina(MODALIDADE modalidade, double presenca, double nota1, double nota2, double nota3){
        APROVACAO status = null;
        this.notaFinal = (nota1+nota2*2+nota3*4) /7;

        if(modalidade == modalidade.PRESENCIAL && presenca < 75){
            status = status.REPROVADO;

        }else if(modalidade == modalidade.PRESENCIAL && this.notaFinal < 5){
            status = status.REPROVADO;

        }else{
            status = status.APROVADO;
        } 
    }

    // Todas as notas
    public void disciplina(MODALIDADE modalidade, double presenca, double nota1, double nota2, double nota3, double nota4){
        APROVACAO status = null;
        this.notaFinal = (nota1*0.15) + (nota2*0.3) + (nota3*0.10) + (nota4*0.45);

        if(modalidade == modalidade.PRESENCIAL && presenca < 75){
            status = status.REPROVADO;

        }else if(modalidade == modalidade.PRESENCIAL && this.notaFinal < 5){
            status = status.REPROVADO;

        }else{
            status = status.APROVADO;
        }
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