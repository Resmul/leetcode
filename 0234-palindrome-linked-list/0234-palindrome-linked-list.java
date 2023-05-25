class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode ptr = head;
        List<Integer> num = new ArrayList<>();
        while(ptr != null){
            num.add(ptr.val);
            ptr = ptr.next;
        }
        int end = num.size() - 1;
        for(int i = 0; i < num.size(); i++){
            if(num.get(i) == num.get(end)){
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}