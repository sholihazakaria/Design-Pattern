/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author Sholiha
 */
public interface Iterator {
    boolean hasNext();
    Object next();
    void remove();
}