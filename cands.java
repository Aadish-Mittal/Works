class cands{
    public static String countandsay(int n){
        if(n==1){
            return "1";
        }
        else{
            String s=countandsay(n-1);
            char cc=s.charAt(0);
            String ss="";
            int c=1;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)==cc){
                    c=c+1;
                }
                else{
                    ss=ss+Integer.toString(c*10+cc-48);
                    cc=s.charAt(i);
                    c=1;
                }
            }
                ss=ss+Integer.toString(c*10+cc-48);
                return ss;
            
        }
        }
    public static void main(String[] args)
    {
        System.out.println(countandsay(5));
    }
}