class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i<s.length();i++)
        {
            char crr = s.charAt(i);
            if(crr=='{' || crr =='(' || crr =='[')
                st.push(crr);
            if(crr=='}'||crr==')' || crr == ']')
            {
                if(st.size()==0)
                    return false;
                if(inverse(st.peek())!=crr)
                    return false;
                st.pop();
            }
        }
        return st.size()==0;
    }

    public char inverse(char c)
    {
        if(c=='[')
            return ']';
        if(c==']')
            return '[';
        if(c=='(')
            return ')';
        if(c==')')
            return '(';
        if(c=='{')
            return '}';
        if(c=='}')
            return '{';
        return '.';
    }
}
