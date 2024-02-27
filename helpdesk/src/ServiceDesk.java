
import java.util.ArrayList;
import java.util.List;

public class ServiceDesk {
    private List<Chamado> chamados;
    private int proximoChamadoID;

    public ServiceDesk() {
        this.chamados = new ArrayList<>();
        this.proximoChamadoID = 1;
    }

    public void abrirChamado(String descricao) {
        Chamado chamado = new Chamado(proximoChamadoID++, descricao);
        chamados.add(chamado);
        System.out.println("Chamado criado com sucesso. ID do chamado: " + chamado.getId());
    }

    public void resolverChamado(int chamadoId) {
        for (Chamado c : chamados) {
            if (c.getId() == chamadoId) {
                c.setSolucao(true);
                System.out.println("Chamado resolvido com sucesso. ID do chamado: " + c.getId());
                return;
            }
        }
        System.out.println("Chamado nao encontrado com ID: " + chamadoId);
    }


    public void chamadosEmAberto() {
        System.out.println("Chamados em aberto:");
        for (Chamado c : chamados) {
            if (!c.getSolucao()) {
                System.out.println("ID: " + c.getId() + ", Descricao: " + c.getDescricao());
            }
        }
    }
}