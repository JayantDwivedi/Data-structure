package array;

public class Implementation implements Array
{
    private int size;
    private int [] array;
    private  int end;


    // Getter and Setter
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public Implementation(int size) {
        this.size = size;
        this.array = new int[this.size];
        this.end = 0;
    }

    @Override
    public boolean isFull() {
        boolean response = false;
        if (end == size)
        {
            response = true;
        }
        return response;
    }

    @Override
    public boolean isEmpty() {
        boolean response = false;
        if (end == 0)
        {
            response = true;
        }
        return response;
    }

    @Override
    public boolean insert(int addElement) {
        boolean response = false;
        if(!isFull())
        {
            array[end] = addElement;
            end++;
            response = true;
        }
        return response;
    }

    @Override
    public void traverse() {
        for(int i = 0; i < end; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    @Override
    public boolean search(int searchElement) {
        boolean response = false;
        for(int j = 0; j < end; j++)
        {
            if(array[j] == searchElement)
            {
                response = true;
                break;
            }
        }
        return response;
    }

    @Override
    public int[] sort() {
        // cloning original array
        int[] response = array.clone();
        for (int i = 0; i < end - 1; i++) {
            for (int j = 0; j < end - i - 1 ; j++) {
                if(response[j] > response[j+1]){
                    int temp = response[j];
                    response[j] = response[j+1];
                    response[j+1] = temp;
                }
            }
        }
        return  response;
    }

    @Override
    public boolean delete(int delElement) {
        boolean response = false;
        int i = 0;
       for(i = 0; i < end; i++)
       {
           if(array[i] ==  delElement)
           {
               break;
           }
       }

       for(int j = i; j < end; j ++)
       {
           array[j] = array[j+1];
       }
       end--;
       return response;

    }
}
