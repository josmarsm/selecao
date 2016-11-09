package br.com.jn.backingbean;

import br.com.jn.model.Userroles;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "userrolesController")
@ViewScoped
public class UserrolesController extends AbstractController<Userroles> {

    public UserrolesController() {
        // Inform the Abstract parent controller of the concrete Userroles Entity
        super(Userroles.class);
    }

}
