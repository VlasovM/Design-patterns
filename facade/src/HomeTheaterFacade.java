import parts.Projector;
import parts.Screen;

public class HomeTheaterFacade {

    private final Screen screen;
    private final Projector projector;

    public HomeTheaterFacade(Screen screen, Projector projector) {
        this.screen = screen;
        this.projector = projector;
    }

    public void watchMovie() {
        screen.down();
        projector.on();
    }

    public void endMovie() {
        projector.off();
        screen.up();
    }

}
