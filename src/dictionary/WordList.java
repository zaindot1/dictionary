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
public class WordList {
    WordMeaningNode head;
    WordMeaningNode tail;
    int size;

    public WordList()
    {
        head=null;
        tail=null;
        size=0;
    }

    public void sort()
    {
        String tempw;
        String tempm;

        WordMeaningNode temp;

        for(int i=0;i<size-1;i++)
        {
            temp=head;
            for(int j=0;j<size-1;j++)
            {
                if(temp.getWord().charAt(0)>temp.next.getWord().charAt(0))
                {
                    tempw=temp.getWord();
                    tempm=temp.getMeaning();


                    temp.setWord(temp.next.getWord());
                    temp.setMeaning(temp.next.getMeaning());

                    temp.next.setWord(tempw);
                    temp.next.setMeaning(tempm);
                }
                temp=temp.next;
            }
        }


    }
    public void insert_start(String word,String meaning)
    {
        WordMeaningNode temp=new WordMeaningNode (word,meaning);
        if(head==null)
        {
            head=temp;
            tail=temp;
        }
        else
        {
            temp.next=head;
            head=temp;
        }
        size++;
    }
    public void insert_end(String word,String meaning)
    {
        WordMeaningNode temp=new WordMeaningNode(word,meaning);
        if(head==null)
        {
            head=temp;
            tail=temp;
        }
        else
        {
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    public WordMeaningNode remove(int loc)
    {
        WordMeaningNode current=head;
        WordMeaningNode prev=null;
        WordMeaningNode ret=null;
        // WordMeaningNode next=null;

        if(loc==0) {
            ret=head;
            this.deleteAtStart();
            return ret;
        }
        else if(loc==size) {
            ret=tail;
            this.deleteAtEnd();
            return ret;
        }
        else if(loc>0 && loc<size)
        {
            for(int i=0;i<loc;i++)
            {
                prev=current;
                current=current.next;
                //next=current.next;
            }
            ret=prev.next;
            prev.next=current.next;
        }
        size--;
        return ret;

    }
    public void deleteAtStart()
    {
        head=head.next;
        size--;
    }
    public void deleteAtEnd()
    {
        WordMeaningNode current=head;
        WordMeaningNode prev=null;

        for(;current.next!=null;)
        {
            prev=current;
            current=current.next;
        }
        prev.next=null;
        tail=prev;
        size--;
    }
    public int search(String word)
    {
        int ind=0;
        WordMeaningNode current=head;
        for(;ind<size;ind++)
        {
            if((current.getWord()).equals(word))
                return ind;
            current=current.next;
        }
        return -1;
    }
    public void print()
    {
        WordMeaningNode temp=head;
        for(;temp!=null;temp=temp.next)
        {
            System.out.printf("%%s - %s \n",temp.getWord(),temp.getMeaning());
        }
        System.out.println();
    }

}

