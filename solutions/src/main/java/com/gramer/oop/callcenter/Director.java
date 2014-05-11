package com.gramer.oop.callcenter;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Director extends Employee {
    
    public Director(String name) {
        super(name);
        this.rank = Rank.DIRECTOR;
    }

    @Override
    public void escalate(Call call) {
        // exception
    }
    
}
