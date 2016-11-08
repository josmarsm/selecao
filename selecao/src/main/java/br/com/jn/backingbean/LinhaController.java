package br.com.jn.backingbean;

import br.com.jn.model.Linha;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "linhaController")
@ViewScoped
public class LinhaController extends AbstractController<Linha> {

    public LinhaController() {
        // Inform the Abstract parent controller of the concrete Linha Entity
        super(Linha.class);
    }

}
