class Solution {
    public int evalRPN(String[] tokens) {

        Stack<String> stack = new Stack<>();
        int a =0;
        int b =0;
        int res = 0;
        for(int i=0; i<tokens.length; i++){
            
            if(tokens[i].equals("+")){
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                res = b + a;
                stack.push(String.valueOf(res));
            }else if(tokens[i].equals("-")){
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                res = b - a;
                stack.push(String.valueOf(res));
            }else if(tokens[i].equals("*")){
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                res = b * a;
                stack.push(String.valueOf(res));
            }else if (tokens[i].equals("/")){
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                res = b / a;
                stack.push(String.valueOf(res));
            }else stack.push(tokens[i]);
        }
        res = Integer.parseInt(stack.pop());
        return res;
    }
}
