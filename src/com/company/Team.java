package com.company;

import java.util.ArrayList;

public class Team<T extends TeamPlayer> implements Comparable<Team<T>>{

    private String name;
    int played = 0;
    int won = 0;
    int tied = 0;

    ArrayList<T> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addPlayers(T player){
        if(players.contains(player)){
            System.out.println("player is already added");
            return false;
        }else {
            System.out.println("Adding a new member in team");
            players.add(player);
            return true;
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if(this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
