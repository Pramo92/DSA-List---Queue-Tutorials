package Q1;

public class Test {
    public static void main(String[] args){

        String[] id= {"B001","B002","B003","B004","B005"};
        String[] title = {"Introduction to Programming","History of Science","The Lord of the Rings","Jane Eyre","David Copperfield"};
        int[] copy={5,4,6,7,1};
        int[] burrow = {0,0,0,0,0};
        int[] req = {2,1,4,0,0,};

        List list = new List (id.length);
        Queue queue = new Queue(id.length);

        for(int i=0;i<id.length;i++){
            PatronReq pr = new PatronReq();
            pr.id=id[i];
            pr.title=title[i];
            pr.req=req[i];
            queue.Append(pr);
        }



        addBooks(id,title,copy,burrow,list);

        for( int i=0;i< list.ListSize();i++){
            if(list.RetrieveList(i).title=="Introduction to Programming"){
                System.out.println("No of book copies available in Introduction to Programming is: "+list.RetrieveList(i).copy);
            }
        }
        processNextRequest(list,queue);
        printBookAvailability(list);
        mostBorrowed(queue);

    }

    static void addBooks(String[] id,String[] title,int[] copy,int[] burrow,List list){


        for(int i=0;i<id.length;i++){
            BookDetail bd = new BookDetail();
            bd.id=id[i];
            bd.title=title[i];
            bd.copy=copy[i];
            bd.borrow=burrow[i];

            list.InsertLast(bd);
        }
    }

    static void processNextRequest(List list, Queue queue){
        PatronReq pr = queue.Serve();
        int i =0;
        while(pr.id!=list.RetrieveList(i).id){
            i++;
        }

        BookDetail bd = list.RetrieveList(i);
        bd.copy = bd.copy- pr.req;
        bd.borrow= bd.borrow+ pr.req;

    }

    static void printBookAvailability(List list){
        for(int i = 0;i<list.ListSize();i++){
            System.out.println(list.RetrieveList(i).title+" : "+list.RetrieveList(i).copy);
        }
    }

    static void mostBorrowed(Queue queue){
        PatronReq pr   = queue.Serve();
        int max = pr.req;
        String title = pr.title;
        while (!queue.IsQueueEmpty()){
            PatronReq pr1   = queue.Serve();
            if(max<pr1.req){
                max = pr1.req;
                title = pr1.title;
            }
        }

        System.out.println("Most Burrowed Book is: "+title+" that count: "+max);
    }
}
