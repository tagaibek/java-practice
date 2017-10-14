package exams.exam0530;

/**
 * Created by Student on 30.05.2017.
 */
public class Count {

    public void printCount(String[] sts)
    {
        String s = "*";
        for (int i = 0; i<sts.length; i++)
        {
            for (int j =i+1; j<sts.length;j++ )
            {
                if (sts[i]==sts[j])
                {
                    s = s + s;

                }
            }
            System.out.println(sts[i]+"-"+s);
        }
    }
}
