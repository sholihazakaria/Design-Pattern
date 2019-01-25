/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wes150033.lab4a.part1;

/**
 *
 * @author Sholiha
 */
public class ConsoleLogger implements Logger{
    private String msg;

    @Override
    public void log(String msg) {
        this.msg = msg;
        System.out.println(msg);
    }
    
}
