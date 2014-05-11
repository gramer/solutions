package com.gramer.oop.callcenter;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Employee {

    private String name;
    protected Rank rank;
    private boolean free;

    public Employee(Rank rank, String name) {
        super();
        this.rank = rank;
        this.name = name;
    }
    
    public Employee(String name) {
        this.name = name;
    }

    public boolean canHandle(Call call) {
        return rank.ordinal() - call.getRank().ordinal() >= 0;
    }

    public void receive(Call call) {
        free = false;
        call.setAssigner(this);
        // do something
        
        
        free = true;
    }
    
    public abstract void escalate(Call call);
    
   

}
