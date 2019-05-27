package performance;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static void main(String [] args)
    {
        Score s1=new Score(6);
        Score s2=new Score(7);
        Score s3=new Score(1);
        List<Score> scoreList=new ArrayList<>();

        scoreList.add(s1);
        scoreList.add(s2);
        scoreList.add(s3);
        scoreList.sort((o1, o2) -> ((Score)o1).score>((Score)o2).score ? -1 :((Score)o1).score<((Score)o2).score ? 1:0
        );
        for (Score s :
                scoreList) {
            System.out.println(s);
        }
    }
}

class Score implements Comparator
{
    public int score;
    public Score(int i)
    {
        score=i;
    }

    public int getScore() {

        return score;
    }

    @Override
    public String toString() {
        return "Score:  "+score;
    }
//    score>((Score)o).score ? -1 :score< ((Score)o).score ? 1:0
    @Override
    public int compare(Object o1, Object o2) {
        return ((Score)o1).score>((Score)o2).score ? -1 :((Score)o1).score<((Score)o2).score ? 1:0;
    }
}

