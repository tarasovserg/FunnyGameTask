package com.creamtec.techtalk.game.api;

import java.awt.Point;

import javax.swing.Icon;

public interface Monster {

    Point getPosition();

    int getType();

    Icon getIcon();

}