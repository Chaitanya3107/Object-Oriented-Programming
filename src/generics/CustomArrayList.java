package generics;

import java.util.ArrayList;

public class CustomArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.get(0);
        list.remove(0);
        list.add(60);
        list.size();
        list.isEmpty();
    }
}
