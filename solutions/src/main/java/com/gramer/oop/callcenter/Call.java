package com.gramer.oop.callcenter;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Call {
    
    private Rank rank;
    
    public Call(Rank rank) {
        super();
        this.rank = rank;
    }

    private Employee assigner;
    
}
