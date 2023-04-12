class Solution {
    public String simplifyPath(String path) 
    {
        Stack<String> stack=new Stack<>();
        final String[] str=path.split("/");
        for(final String i:str)
        {
            if((i.isEmpty()) || (i.equals(".")))
            continue;
            if(i.equals(".."))
            {
            if(!stack.isEmpty())
            stack.pop();
            }
            else
            stack.push(i);
        }
        return "/"+String.join("/",stack);
    }
}
