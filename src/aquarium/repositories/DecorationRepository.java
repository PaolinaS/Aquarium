package aquarium.repositories;

import aquarium.models.decorations.Decoration;


import java.util.ArrayList;
import java.util.Collection;

public class DecorationRepository implements Repository {
    private Collection<Decoration> decorations;
    public DecorationRepository() {
        decorations = new ArrayList<>();
    }

    @Override
    public void add(Decoration decoration) {
        this.decorations.add(decoration);
    }

    @Override
    public boolean remove(Decoration decoration) {
        return this.decorations.remove(decoration);
    }

    @Override
    public Decoration findByType(String type) {
        return this.decorations.stream()
                .filter(decoration1 -> decoration1.getClass().getSimpleName()
                        .equals(type)).findFirst().orElse(null);
    }
}
