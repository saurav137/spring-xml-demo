package com.stackroute.domain;

public class Movie {
private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }
    public  void showActor(){
        System.out.println(actor.getName());
        System.out.println(actor.getAge());
        System.out.println(actor.getGender());
    }

}
