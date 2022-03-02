/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
/**
 *
 * @author Zain
 */
public class Dictionary {
    public static void main(String[] args)
    {
        WordList list=new WordList();


        list.insert_start("Cup","a container from which we drink");
        list.insert_start("Library ","a collection of books");
        list.insert_start("School ","a place of learning");
        list.insert_start("School","any group of fish");

        list.print();
    }
}

