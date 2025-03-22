package com.oops.java_composition;

public class HumanBody {
    Heart heart;

    HumanBody(Heart heart) {
        this.heart = heart;
    }

    void showHeartStatus() {
        this.heart.heatbeats();
    }
}