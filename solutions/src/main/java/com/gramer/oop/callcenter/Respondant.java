package com.gramer.oop.callcenter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Respondant extends Employee {

    public Respondant(String name) {
        super(name);
        this.rank = Rank.RESPONDANT;
    }

    @Override
    public void escalate(Call call) {
    }

}
