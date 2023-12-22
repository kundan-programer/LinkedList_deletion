import java.util.Scanner;

public class LL_Delete {

  static class node {
    int data;
    node next;

    node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  node head = null;

  // LL is created-----------------------------------------------------
  public void create() {
    int data, n;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.print("Enter data: ");
      data = sc.nextInt();

      node ob = new node(data);

      if (head == null) {
        head = ob;
      }

      else {
        System.out.print("New value insert at index of 1--> begener,2--> end and 3-->at any index: ");
        int m = sc.nextInt();

        switch (m) {
          case 1:
            ob.next = head;
            head = ob;
            break;

          case 2:
            node temp = head;
            while (temp.next != null) {
              temp = temp.next;
            }
            temp.next = ob;
            break;

          case 3:
            node temp1 = head;
            System.out.print("Enter index value ");
            int index = sc.nextInt();
            for (int i = 0; i < (index - 1); i++) {
              temp1 = temp1.next;
            }
            ob.next = temp1.next;
            temp1.next = ob;
            break;
        }
      }

      System.out.print("Want to insert more data press 1: ");
      n = sc.nextInt();
    } while (n == 1);

  }

  // LL is deleted-----------------------------------------
  public void Delete() {
    int data, n, m;
    Scanner sc = new Scanner(System.in);
    do {

      if (head == null) {
        System.out.println("LL is not present");
      }

      else {
        System.out.print("New value delete at index of 1--> begener,2--> end and 3--> at any index: ");
        int p = sc.nextInt();

        switch (p) {
          case 1:
            node temp = head;
            temp = temp.next;
            head = temp;
            break;

          case 2:
            node temp1 = head;
            node ptr = temp1.next;
            while (ptr.next != null) {
              temp1 = ptr;
              ptr = ptr.next;
            }
            temp1.next = null;
            break;

          case 3:
            node temp2 = head;
            node ptr2 = temp2.next;

            System.out.print("Enter index value ");
            int index = sc.nextInt();

            for (int i = 0; i < (index - 1); i++) {
              temp2 = ptr2;
              ptr2 = ptr2.next;
            }
            temp2.next = ptr2.next;
            break;
        }
      }

      System.out.print("Want to Delete more data press 1: ");
      m = sc.nextInt();
    } while (m == 1);

  }

  public void Transfer() {
    node temp = head;
    try {
      if (head == null) {
        System.out.println("LL is not present");
      }

      else {
        while (head != null) {
          System.out.print(temp.data + " ");
          temp = temp.next;
        }
      }
    } catch (Exception e) {
      System.out.println("\n");
    }
  }

  public static void main(String[] args) {

    LL_insert ob1 = new LL_insert();
    ob1.create();
    ob1.Delete();
    ob1.Transfer();
  }
}