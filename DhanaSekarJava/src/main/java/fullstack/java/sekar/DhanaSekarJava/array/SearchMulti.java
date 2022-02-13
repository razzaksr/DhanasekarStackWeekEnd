package fullstack.java.sekar.DhanaSekarJava.array;

import java.util.Arrays;

public class SearchMulti 
{
	public static int[] linear(String[][] data,String user)
	{
		int[] pos={-1,-1};//0>>row 1>>col
		
		for(int row=0;row<data.length;row++)
		{
			for(int col=0;col<data[row].length;col++)
			{
				if(data[row][col].compareToIgnoreCase(user)==0)
				{
					pos[0]=row;pos[1]=col;
					break;
				}
			}
		}
		return pos;
	}
	
	public static int[] binary(String[][] data,int row,int start,int end,String user)
	{
		int[] pos= {-1,-1};
		
		if(start<=end)
		{
			//System.out.println("Searching "+user+" between "+start+" and "+end+" @ "+row);
			int mid=(end+start)/2;
			//System.out.println("Mid is "+data[row][mid]);
			if(data[row][mid].compareToIgnoreCase(user)==0)
			{
				//System.out.println("mid matched");
				pos[0]=row;pos[1]=mid;
				return pos;
			}
			else if(data[row][mid].compareToIgnoreCase(user)<0) 
			{
				//System.out.println("else if matched "+(mid+1)+" "+end);
				return binary(data, row, mid+1, end, user);
			}
			else
			{
				//System.out.println("else matched "+start+" "+mid);
				return binary(data, row, start, mid-1, user);
			}
		}
		else
			return pos;
	}
	
	public static void divide(String[][] data,String user,int current)
	{
		if(current<data.length) 
		{
			int[] res=binary(data, current,0, data[current].length-1, user);
			//System.out.println(Arrays.toString(res)+" after "+current);
			if(res[0]==-1)
				divide(data, user, current+1);
			else
				System.out.println(Arrays.toString(res));
		}
	}
	
	public static void main(String[] args) 
	{
		String[][] mcu= {{"IronMan","Thor","EndGame"},{"CivilWar","Eternals","Avengers"},{"FarFromHome","InfinityWar"}};
		System.out.println(Arrays.toString(SearchMulti.linear(mcu, "endgame")));
		System.out.println(Arrays.toString(SearchMulti.linear(mcu, "civilWAR")));
		System.out.println(Arrays.toString(SearchMulti.linear(mcu, "end")));
		
		Arrays.sort(mcu[0]);Arrays.sort(mcu[1]);Arrays.sort(mcu[2]);
		System.out.println(Arrays.toString(mcu[0])+"\n"+Arrays.toString(mcu[1])+"\n"+Arrays.toString(mcu[2]));
		
		SearchMulti.divide(mcu, "avengers", 0);
		SearchMulti.divide(mcu, "ironman", 0);
		SearchMulti.divide(mcu, "farfromhome", 0);
		SearchMulti.divide(mcu, "thor", 0);
		
	}
}
