import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Chamado {
    private int id;
    private String descricao;
    private boolean solucao;

    public Chamado(int id, String description) {
        this.id = id;
        this.descricao = description;
        this.solucao = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getSolucao() {
        return solucao;
    }

    public void setSolucao(boolean solucao) {
        this.solucao = solucao;
    }

   
}
