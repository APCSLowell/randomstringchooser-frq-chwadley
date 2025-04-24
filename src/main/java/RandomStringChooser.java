import java.util.*;
public class RandomStringChooser {
    private ArrayList<String> a;
    
    public RandomStringChooser(String[] _a) {
        a = new ArrayList<String>();
        for (int i=0;i<_a.length;i++) {
            a.add(_a[i]);
        }
    }

    public String getNext() {
        if (a.size()==0) return new String("NONE");
        int i= (int)(Math.random()*a.size());
        return a.remove(i);
    }
}
