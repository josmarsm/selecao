package br.com.jn.backingbean;

import br.com.jn.model.Orientador;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "orientadorController")
@ViewScoped
public class OrientadorController extends AbstractController<Orientador> {

    public OrientadorController() {
        // Inform the Abstract parent controller of the concrete Orientador Entity
        super(Orientador.class);
    }

}
