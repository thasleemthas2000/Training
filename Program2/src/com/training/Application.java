package com.training;
public class Application
{
   public static void main(String[] args) 
   {  
          
        int [] array = new int [] {1,5,2,1,2,6,7,1};  
        
        int [] val = new int [array.length];  
        int visited = -1;  
        for(int i = 0; i < array.length; i++)
        {  
            int count = 1;  
            for(int j = i+1; j < array.length; j++)
            {  
                if(array[i] == array[j])
	        {  
                   count++;  
                   val[j] = visited;   
                     
                }  
             }  
             if(val[i] != visited)  
             {
                  val[i] = count;  
             }
         }  
           
           for(int i = 0; i < val.length; i++)
           {  
               if(val[i] != visited)  
               {
                   System.out.println("Numbers value:  " + array[i] + "    Occurance" + val[i]);  
               }
           }
   }
}





