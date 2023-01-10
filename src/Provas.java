public class Provas {
    private String nome;
    Materias materia = new Materias();
    private float nota;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNota(float nota){
        this.nota = nota;
    }

    public float getNota(){
        return this.nota;
    }
}
