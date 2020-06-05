package controle;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import negocio.OperacoesNegocio;

/**
 *
 * @author Renata
 */
@ManagedBean(name = "controle")
@RequestScoped
public class CalculadoraControle {

    private OperacoesNegocio negocio;

    @PostConstruct
    private void init() {
        if (negocio == null) {
            negocio = new OperacoesNegocio();
        }
    }

    public void somar() {
        negocio.somar();
    }

    public void subtrair() {
        negocio.subtrair();
    }

    public void multiplicar() {
        negocio.multiplicar();
    }

    public void dividir() {
        negocio.dividir();
    }

    public OperacoesNegocio getNegocio() {
        return negocio;
    }

    public void setNegocio(OperacoesNegocio negocio) {
        this.negocio = negocio;
    }

}
