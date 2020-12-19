import java.util.Stack;

public class Design {

    public static void main(String[] args) {
        System.out.println("lets create a better design and the system around yourself");

        int arr[]={4,5,2,10,8};
        int ans[]=ngl(arr);

        for(int i: ans)
            System.out.print(i+" ");
    }

    static int [] ngl(int A[])
    {
        Stack<Integer> st=new Stack<>();
        int ngl[]=new int[A.length];
        ngl[0]=-1;
        st.push(0);  // pushing the indexes

        for(int i=1;i<A.length;i++)
        {
            while(!st.isEmpty() && A[st.peek()]<=A[i])
            {
                st.pop();
            }

            if(!st.isEmpty())
            {
                ngl[i]=st.peek();
            }
            else
            {
                ngl[i]=-1;
            }

            st.push(i);


        }
        return ngl;

    }






















    static int [] nsr(int arr[])
    {
        Stack<Integer> st=new Stack<>();
        int nsr[]=new int[arr.length];
        nsr[arr.length-1]=-1;
        st.push(arr.length-1);
//      Start From Right To Left
        for(int i=arr.length-2;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                nsr[i]=st.peek();
            }
            else
            {
                nsr[i]=-1;
            }
            st.push(i);
        }
        return nsr;
    }

}
