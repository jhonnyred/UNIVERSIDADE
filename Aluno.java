import java.io.EOFException;
private class Aluno{

    // Atributos
    String nome;
    int ra;
    double notaFinal;
    APROVACAO status;
    
    // CONSTRUTORES
    // Vazio
    public Aluno(){
    }

    // Completo
    public Aluno(String nome, int ra, double presenca, double nota1, double nota2, double nota3, double nota4){
        this.nome = nome;
        this.ra = ra;
        this.presenca = presenca/100;
        this.notaFinal = (nota1*0.15) + (nota2*0.3) + (nota3*0.10) + (nota4*0.45);
    }

    // Duas notas
    private void notas(MODALIDADE modalidade, double presenca, double nota1, double nota2){
        this.notaFinal = (nota1+nota2)/2;
    }

    // Três notas
    public Aluno(String nome, int ra, double presenca, double nota1, double nota2, double nota3){
        this.notaFinal = (nota1+nota2*2+nota3*4) /7; 
    }

    // MÉTODOS
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