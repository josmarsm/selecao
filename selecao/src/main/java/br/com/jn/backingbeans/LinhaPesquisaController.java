package br.com.jn.backingbeans;

import br.com.jn.model.LinhaPesquisa;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "linhaPesquisaController")
@ViewScoped
public class LinhaPesquisaController extends AbstractController<LinhaPesquisa> {

    public LinhaPesquisaController() {
        // Inform the Abstract parent controller of the concrete LinhaPesquisa Entity
        super(LinhaPesquisa.class);
    }

}
