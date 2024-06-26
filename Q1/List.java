package Q1;

public class List {
    private int maxSize ;
    private int position;
    private Order[] ListEntry;

    List(int size)
    {
        maxSize = size;
        ListEntry = new Order[maxSize];
        position= -1;
    }

    boolean IsListEmpty()
    {
        return (position==-1);
    }

    boolean IsListFull()
    {
        return (position== maxSize-1);
    }

    int ListSize()
    {
        return (position+1);
    }

    void InsertLast(Order x)
    {
        if (IsListFull())
            System.out.println("Attempt to insert at the end of a full list");
        else
            System.out.println("y");
        ListEntry[++position] = x;
    }

    void InsertList(int p, Order element)
    { int i;
        if (IsListFull())
            System.out.println("Attempt to insert an entry into a full list");
        else if (p < 0 || p > ListSize())
            System.out.println("attempt to insert a position not in the list");
        else
        {
            for( i = ListSize(); i >p; i--)
                ListEntry[i] = ListEntry[i-1];
            ListEntry[p] = element;
            position++;
        }
    }

    Order DeleteList( int p) {
        int i;
        if (IsListEmpty())
            System.out.println("Attempt to delete an entry from an empty list");
        else if (p < 0 || p >= ListSize())
            System.out.println("attempt to delete a position not in the list");
        else {
            Order element = ListEntry[p];
            for( i = p; i < ListSize()-1; i++)
                ListEntry[i] = ListEntry[i+1];
            position--;
            return element;
        }
        return null;
    }

    Order RetrieveList(int p ){
        int i;
        if (IsListEmpty()){
            System.out.println("Attempt to retrieve an entry from an empty list");
            return null;
        }
        else if (p < 0 || p >= ListSize()){
            System.out.println("attempt to retrieve an entry at a position not in the list");
            return null;
        }
        else{
            Order element = ListEntry[p];
            return element;}
    }

    void ReplaceList (int p, Order x){
        int i;
        if (IsListEmpty())
            System.out.println("Attempt to replace an entry of an empty list");
        else if (p < 0 || p >= ListSize())
            System.out.println("attempt to replace an entry at a position not in the list");
        else
            ListEntry[p] = x;
    }

    void TraverselList()
    {
        int i;
        for (i=0; i<position+1; i++)
            System.out.println(ListEntry[i]);
    }


}
