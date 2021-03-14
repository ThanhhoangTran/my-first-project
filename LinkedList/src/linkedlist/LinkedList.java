
package linkedlist;
import java.util.Scanner;
class LinkedList {
    Scanner s = new Scanner(System.in);
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int new_data){
            data = new_data;
            next = null;
        }
    }
    //in danh sách các node trong Linked List
    void printList(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.print("\n");
    }
    //chèn node mới vào đầu Linked List
    void InsertList(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    //chèn node mới vào sau vi tri node
    void InsAfter(Node prev , int new_data){
        Node new_node = new Node(new_data);
        new_node.next = prev.next;
        prev.next = new_node;
    }
    //chèn node mới vào cuối Linked List
    void appendList(int new_data){
        Node new_node = new Node(new_data);
        //ktr xem mảng có trống hay không
        if(head == null){
            head = new_node;
            return ;
        }
        Node n = head;
        while(n.next !=null){
            n = n.next;
        }
        n.next = new_node;
        return ;
    }
    //tao danh sach node
    void creatList(int x){
        for(int i = 0 ; i<x; i++){
            int num;
            System.out.print("Nhap gia tri cho node: ");
            num = Integer.parseInt(s.nextLine());
            appendList(num);
        }
    }
    //chen vao sau 1 node
    void InsertLink(){
        int r, num;
        System.out.print("Nhap vi tri chen: ");
        r = Integer.parseInt(s.nextLine());
        Node n = head;
        for(int i = 0; i<r-1; i++){
            n = n.next;
        }
        //chen node
        System.out.print("Nhap gia tri can chen: ");
        num = Integer.parseInt(s.nextLine());
        InsAfter(n,num);
    }
    void Menu(){
        int num, key;
        System.out.println("Danh sach lien ket don<Linked List>");
        System.out.print("Tao danh sach voi so Node = ");
        num = Integer.parseInt(s.nextLine());
        creatList(num);
        do{
        int k;
        System.out.println("1. Chen Node moi vao dau Linked List");
        System.out.println("2. Chen Node moi vao cuoi Linked List");
        System.out.println("3. Chen Node moi vao sau 1 Node xac dinh");
        System.out.println("4. In danh sach lien ket don<Linked List>");
        System.out.println("<0>Exit");
        System.out.print("Nhap lua chon<>??? ");
        key = Integer.parseInt(s.nextLine());
        switch(key){
            case 1: 
                System.out.println("1. Chen Node moi vao dau Linked List");
                System.out.print("Nhap gia tri cho Node: ");
                k = Integer.parseInt(s.nextLine());
                InsertList(k);
                break;
            case 2:
                System.out.println("2. Chen Node moi vao cuoi Linked List");
                System.out.print("Nhap gia tri cho Node: ");
                k = Integer.parseInt(s.nextLine());
                appendList(k);
                break;
            case 3:
                System.out.println("3. Chen Node moi vao sau 1 Node xac dinh");
                InsertLink();
                break;
            case 4: 
               System.out.println("4. In danh sach lien ket don<Linked List>");
                printList();
                break;
        }
        }
        while(key!=0);
        return;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.Menu();
    }
}
