package com.cmaher.game.components;

import com.cmaher.game.entity.Entity;

public class RotationalComponent extends Component {

    private PlaceComponent place;
    private float angularVelocity; // degrees/second
    
    
    public RotationalComponent(Entity master, PlaceComponent place, float angularVelocity) {
        super(master);
        this.place = place;
        this.angularVelocity = angularVelocity;
    }

    public void update(float delta) {
        place.setAngle(place.getAngle() + angularVelocity * delta);
    }
}