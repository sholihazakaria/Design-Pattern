/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wes150033.lab4a.part2;

import java.sql.Timestamp;

/**
 *
 * @author Sholiha
 */
public class ConsoleLogger implements Logger{
    private String msg;
    Timestamp ts;

    @Override
    public void log(String msg) {
        ts = new Timestamp(System.currentTimeMillis());
        this.msg = msg;
        System.out.println(ts + ": "+msg);
    }
}
