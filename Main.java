public class Main{
    public static void main(String[] args){
        // Instânciando os objetos
        Aluno a1 = new Aluno("Roberto", 568754);
        Aluno a2 = new Aluno("Isabela", 546788);
        Aluno a3 = new Aluno("Ariel", 456842);
        Aluno a4 = new Aluno("Regina", 875465);
        Aluno a5 = new Aluno("Marcos", 567894);

        // 2 notas
        a1.disciplina(MODALIDADE.EAD, 75, 5.4, 7.4);

        // 3 notas
        a2.disciplina(MODALIDADE.PRESENCIAL, 87, 10, 9.5, 5.7);

        // Todas as notas
        a3.disciplina(MODALIDADE.EAD, 0, 7.4, 8.7, 10, 7.5);

        // Reprovado por presença
        a4.disciplina(MODALIDADE.PRESENCIAL, 50, 7.5, 8.9);

        // Reprovado por nota
        a5.disciplina(MODALIDADE.PRESENCIAL, 100, 4.5, 3);

        //SAÍDA
        System.out.println(a1.ficha());
        System.out.println(a2.ficha());
        System.out.println(a3.ficha());
        System.out.println(a4.ficha());
        System.out.println(a5.ficha());
    }
}