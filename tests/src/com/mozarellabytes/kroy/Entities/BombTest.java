package com.mozarellabytes.kroy.Entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BombTest {

    @Test
    void checkHit() {
        Fortress testFortress = new Fortress(1,1,Revs);
        FireStation testTarget = new FireStation(1,1);
        Bomb testBomb = new Bomb(testFortress, testTarget, true, 5);
        testBomb.targetPosition() = testBomb.truckPosition();
        assertTrue(testBomb.checkHit());
    }

    @Test
    void hasReachedTargetTile() {
        Fortress testFortress = new Fortress(1,1,Revs);
        FireStation testTarget = new FireStation(1,1);
        Bomb testBomb = new Bomb(testFortress, testTarget, true, 5);
        testBomb.currentPosition().x = testBomb.targetPosition().x;
        testBomb.currentPosition().y = testBomb.targetPosition().y;
        assertTrue(testBomb.hasReachedTargetTile());
    }

    @Test
    void updatePosition() {

    }

    @Test
    void damageTruck() {
    }

    @Test
    void drawBomb() {
    }
}