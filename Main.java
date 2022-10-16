
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] aStrings)
    {
        String[][] chr={{"5","3",".",".","7",".",".",".","."}
        ,{"6",".",".","1","9","5",".",".","."}
        ,{".","9","8",".",".",".",".","6","."}
        ,{"8",".",".",".","6",".",".",".","3"}
        ,{"4",".",".","8",".","3",".",".","1"}
        ,{"7",".",".",".","2",".",".",".","6"}
        ,{".","6",".",".",".",".","2","8","."}
        ,{".",".",".","4","1","9",".",".","5"}
        ,{".",".",".",".","8",".",".","7","9"}};
        
                Set<String> row=new HashSet<>();
                Set<String> col=new HashSet<>();
                Set<String> box=new HashSet<>();
                for(int i=0;i<9;i++)
                {
                    for(int j=0;j<9;j++)
                    {
                        if(chr[i][j]!=".")
                        {
                        if(!row.add(chr[i][j]+""+i) || !col.add(chr[i][j]+""+j)|| !box.add(chr[i][j]+""+i/3+""+j/3))
                        {
                            System.out.println("False");
                        }
                    }
                    }
                }
                         
            
        }
        }
    
    
