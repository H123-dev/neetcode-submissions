class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==1)
            return Integer.parseInt(tokens[0]);
        int result = -1;
        Stack<Integer> s = new Stack<>();
        for(int i = 0 ; i<tokens.length-1;i++)
        {
            String next = tokens[i+1];
            String crr = tokens[i];
            switch (next){
                case "+" -> {
                    int p = 0;
                    if(!s.empty())
                        p = s.pop();
                    if(Set.of("+", "-", "*", "/").contains(crr))
                    {
                        result = p + result;
                    }
                    else
                        result+= Integer.parseInt(crr);
                }
                case "-" -> {
                    int p = 0;
                    if(!s.empty())
                        p = s.pop();
                    if(Set.of("+", "-", "*", "/").contains(crr))
                    {
                        result = p - result;
                    }
                    else
                        result-= Integer.parseInt(crr);
                }
                case "*" -> {
                    int p = 0;
                    if(!s.empty())
                        p = s.pop();
                    if(Set.of("+", "-", "*", "/").contains(crr))
                    {
                        result = p * result;
                    }
                    else
                        result*= Integer.parseInt(crr);
                }
                case "/" -> {
                    int p = 0;
                    if(!s.empty())
                        p = s.pop();
                    if(Set.of("+", "-", "*", "/").contains(crr))
                    {
                        result = p / result;
                    }
                    else
                        result = result / Integer.parseInt(crr);
                }
                default -> {
                    if(Set.of("+", "-", "*", "/").contains(crr))
                    {
                        s.push(result);
                    }
                    else
                    {
                        result = Integer.parseInt(crr);
                        s.push(Integer.parseInt(crr));
                    }
                }
            }
        }
        return result;
    }
}