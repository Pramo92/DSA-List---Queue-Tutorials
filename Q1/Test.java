package Q1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        int[] number={ 101,102,103,104,105};
        String[] name={"Nimal","Kamala","Sunil","Amal","Nayana"};
        String[] detail={"Product A","Product B","Product C","Product D","Product D"};
        String[] status = {"Processing","Pending","Processing","Pending","Processing"};

        List list = new List(number.length);
        Queue queue = new Queue(number.length);
        for(int i=0;i<number.length;i++){
            Order od = new Order();
            od.number= number[i];
            od.name= name[i];
            od.detail= detail[i];
            od.status= status[i];
            list.InsertLast(od);
            if(status[i]=="Processing"){
                queue.Append(od);
            }
        }

        System.out.println("First order: "+ list.RetrieveList(0).name);

        System.out.println("No of processing orders: "+ queue.queueSize());

        processNextOrder(list, queue);
        System.out.println(printOrderStatus(list));
        cancelOrder(list);
        printOrderStatusAfterCancellation(list);

    }

    static void processNextOrder(List list, Queue queue){
        int num = queue.Serve().number;

        int i=0;
        while (list.RetrieveList(i).number!=num){
            i++;
        }

        Order od =  list.RetrieveList(i);
        od.status="Processed";

    }

    static String printOrderStatus(List list){
        Scanner input = new Scanner(System. in);

        System.out.print("Enter order number: ");
        int no = input.nextInt();

        for(int i=0;i< list.ListSize();i++){
            if(list.RetrieveList(i).number==no){
                String s = list.RetrieveList(i).status;
                return s;
            }
        }
        return "not valid number";
    }

    static void cancelOrder(List list){
        Scanner input = new Scanner(System. in);

        System.out.print("Enter order number: ");
        int no = input.nextInt();

        int i;
        for(i=0;i< list.ListSize();i++){
            if(list.RetrieveList(i).number==no){
                break;
            }
        }
        Order od =  list.RetrieveList(i);
        od.status="Cancel";
    }

    static void printOrderStatusAfterCancellation(List list){
        for(int i=0;i< list.ListSize();i++){
            System.out.println(list.RetrieveList(i).number +" - "+ list.RetrieveList(i).status);
        }
    }
}
