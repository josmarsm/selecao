package br.com.jn.backingbeans;

import br.com.jn.model.TrocasOrientador;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "trocasOrientadorController")
@ViewScoped
public class TrocasOrientadorController extends AbstractController<TrocasOrientador> {

    public TrocasOrientadorController() {
        // Inform the Abstract parent controller of the concrete TrocasOrientador Entity
        super(TrocasOrientador.class);
    }

}
