class Solution {
    public List<Integer> getRow(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        
        for(int i=0;i<numRows+1;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0 ; j<=i; j++){
                if(j==0 || j==i)
                    row.add(1);
                else{
                     int a = pascal.get(i-1).get(j);
                    int b= pascal.get(i-1).get(j-1);
                    row.add(a+b);
                }
            }
            pascal.add(row);
        }
        return pascal.get(numRows);
    }
}