package Tree;

import Tree.Implementation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Implementation tree = new Implementation();

        boolean response = true;


        do{
            System.out.println("\n1.Create Tree");
            System.out.println("2.Traverse In-Order Traversal");
            System.out.println("3.Traverse Pre-Order Traversal");
            System.out.println("4.Traverse Post-Order Traversal");
            System.out.println("5.Search particular element");
            System.out.println("6.Exit");
            System.out.println("*************************************");
            System.out.println("Choose Appropriate Case");

            int n = scan.nextInt();
           // n = scan.nextInt();
            switch (n)
            {


                case 1 :
                    {
                    System.out.println("Enter the no. of element: ");
                    int n1 = scan.nextInt();
                    for(int i = 0; i < n1; i++){
                        int data = scan.nextInt();
                        tree.insert(data);
                    }
                    break;
                }

                case 2: {
                    System.out.println("Your Result:");
                    tree.traverseInOrder(tree.getRoot());
                    break;
                }


                case 3:{
                    System.out.println("Print Result PreOrder: ");
                    tree.traversePreOrder(tree.getRoot());
                    break;
                }


                case 4:{
                    System.out.println("Print PostOrder: ");
                    tree.traversePostOrder(tree.getRoot());
                    break;
                }

                case 5:{
                    System.out.println("Enter the key element");
                    int ele = scan.nextInt();
                    tree.search(ele);
                    break;
                }

                case 6:{
                    response = false;
                    break;
                }

            }
        }while(response);
    }
}
