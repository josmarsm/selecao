package br.com.jn.backingbean;

import br.com.jn.model.ComissaoSelecao;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "comissaoSelecaoController")
@ViewScoped
public class ComissaoSelecaoController extends AbstractController<ComissaoSelecao> {

    public ComissaoSelecaoController() {
        // Inform the Abstract parent controller of the concrete ComissaoSelecao Entity
        super(ComissaoSelecao.class);
    }

}
