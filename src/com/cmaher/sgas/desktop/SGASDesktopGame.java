package com.cmaher.sgas.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.cmaher.sgas.SGASGame;

public class SGASDesktopGame {
    public static void main(String[] args) {
        new LwjglApplication(new SGASGame(), "SGAS", 800, 600, false);
    }
}
