class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int a = (int)x/10000;
        int b = (int)x%10000/1000;
        int c = (int)x%1000/100;
        int d = (int)x%100/10;
        int e = (int)x%10;
        
       int result = a+b+c+d+e;
        
        if(x%result != 0){
            answer = false;
        }
        
        
        return answer;
    }
}