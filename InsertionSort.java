public class InsertionSort
{//Start class
    public static void main(String[] args)
    {//Start main
        int[] iArray = {7,5,6,1,3,2,4,8,9};
        int iHold, iTemp;

        for(int i = 0; i < iArray.length; i++)
        {//Start for
            for(int j = i; j < 0; j--)
            {//Start indented for loop
                /**
                 * This if cond will check if they are in order
                 * and if they aren't they will be switched over
                 */
                if (iArray[j] < iArray[j-1])
                {
                    iTemp = iArray[j-1];
                    iArray[j] = iArray[j-1];
                    iArray[j-1] = iTemp;
                }
            }//End indented for loop

        }//End for
    }//End main
}//End class
