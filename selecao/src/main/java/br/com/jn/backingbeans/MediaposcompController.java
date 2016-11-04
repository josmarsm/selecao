package br.com.jn.backingbeans;

import br.com.jn.model.Mediaposcomp;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "mediaposcompController")
@ViewScoped
public class MediaposcompController extends AbstractController<Mediaposcomp> {

    public MediaposcompController() {
        // Inform the Abstract parent controller of the concrete Mediaposcomp Entity
        super(Mediaposcomp.class);
    }

}
