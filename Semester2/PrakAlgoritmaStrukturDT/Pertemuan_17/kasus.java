package Pertemuan_17;

import Pertemuan_14.Kendaraan;

public class kasus {
    int [] stack;
    int size;
    int top;

    public kasus (int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push (int data) { //menambah
        top++;
        stack [top] = data;
    }

    public int pop() { //mengambil
        int data = stack [top];
        top--;
        return data;
    
    }

    class node {
        Kendaraan data;
        node next; // menympan referensi ke node berikutnya (struktur Linked List)

        public node(Kendaraan data){
            this.data=data;
            this.next=null;
        }
    }
}
