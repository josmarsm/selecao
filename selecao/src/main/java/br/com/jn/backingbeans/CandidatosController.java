package br.com.jn.backingbeans;

import br.com.jn.model.Candidatos;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "candidatosController")
@ViewScoped
public class CandidatosController extends AbstractController<Candidatos> {

    public CandidatosController() {
        // Inform the Abstract parent controller of the concrete Candidatos Entity
        super(Candidatos.class);
    }

}
