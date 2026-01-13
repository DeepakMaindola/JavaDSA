class Solution {
    static ArrayList<Integer> getTable(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(n * i);
        }

        return list;
    }
}

//problem name :Multiplication Table
//Problem link: https://www.geeksforgeeks.org/problems/print-table0303/1