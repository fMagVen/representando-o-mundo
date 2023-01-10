public class App {
    public static void main(String[] args) throws Exception {
        Aulas aula = new Aulas();

        aula.materia.setNome("programação em java");
        aula.setNome("orientação a objetos");

        System.out.println("Olá! Bora ter uma aula de " + aula.getNome() + " da matéria " + aula.materia.getNome());

        Exercicios exercicio = new Exercicios();

        exercicio.materia.setNome("programação em java");
        exercicio.setNome("representando as coisas");

        System.out.println("Agora que tivemos a aula " + aula.getNome() + " da matéria " + aula.materia.getNome());
        System.out.println("É hora de fazer o exercicio " + exercicio.getNome() + " dessa mesma matéria " + exercicio.materia.getNome());

        Provas prova = new Provas();

        prova.materia.setNome("programação em java");
        prova.setNome("primeira prova de java valor 25 pontos");

        System.out.println("Você já fez o exercício " + exercicio.getNome() + " da matéria " + exercicio.materia.getNome());
        System.out.println("Você está preparado! Hora de fazer a prova " + prova.getNome() + " dessa mesma matéria " + exercicio.materia.getNome());

        float min = 0;
        float max = 25;
        float random_float = (float)Math.random() * (max - min + 1) + min;
        prova.setNota(random_float);

        System.out.println("Parabéns! Sua nota na prova " + prova.getNome() + " foi " + prova.getNota());
    }
}
