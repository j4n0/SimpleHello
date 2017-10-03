
package com.example.logger;

public class HelloLogger {
    private Boolean isEnabled = true;
    public void debug(String message){
        _debug(message);
    }
    private void _debug(String message){
        System.out.print(message);
    }
    public HelloLogger(){}
}
