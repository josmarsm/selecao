package br.com.jn.backingbean;

import br.com.jn.model.Candidato;
import br.com.jn.model.Candidatos;
import br.com.jn.sessionbean.CandidatosFacade;
import java.util.List;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Named(value = "candidatosController")
@ViewScoped
public class CandidatosController extends AbstractController<Candidatos> {

    public CandidatosController() {
        // Inform the Abstract parent controller of the concrete Candidatos Entity
        super(Candidatos.class);
        
    } 
}
