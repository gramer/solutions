package com.gramer.oop.callcenter;

import java.util.Queue;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;

import lombok.Setter;

public class CallHandler {

    private Queue<Call> calls;

    // treeset ordered by rank
    @Setter
    private Set<Employee> employees;

    public CallHandler() {
        calls = new SynchronousQueue<Call>();
    }

    private Employee findHandler(Call call) {
        for (Employee emp : employees) {
            if (emp.isFree() && emp.canHandle(call)) {
                return emp;
            }
            
        }
        return null;
    }

    public boolean dispatchCall(Call call) {
        Employee handler = findHandler(call);
        if (handler == null) {
            calls.add(call);
            return false;
        }
        
        handler.receive(call);
        return true;
    }
    
    

}
