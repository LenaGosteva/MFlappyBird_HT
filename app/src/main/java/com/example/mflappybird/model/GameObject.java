package com.example.mflappybird.model;

public abstract class GameObject {
    public float x, y;

    public GameObject(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public abstract void update();
}
