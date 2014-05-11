package com.gramer.oop.callcenter;

public class Manager extends Employee {

    public Manager(String name) {
        super(name);
        this.rank = Rank.MANAGER;
    }

    @Override
    public void escalate(Call call) {
    }

}
