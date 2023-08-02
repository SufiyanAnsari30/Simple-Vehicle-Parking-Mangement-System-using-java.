import java.util.Scanner;
public class parkingMgnt
{
   public static void main(String args[])
{
      
 Scanner sc=new Scanner(System.in);
 int menu;
int amount=0,count=0;
int b=0,by=0,s=0,c=0;
while(true)
{
Sys.out.println("      !!!!!!!!WELCOME TO SUFIAN PARKING SYSTEM!!!!!!!!");
System.out.println("CHARGES FOR PARKING:-");
System.out.println("1}Bike->150rs");
System.out.println("2}Bicycle->50rs");
System.out.println("3}Scooty->100rs");
System.out.println("4}Car->300rs");
System.out.println("***********************************");
System.out.println("Press 1 for Bike");
System.out.println("Press 2 for Bicycle");
System.out.println("Press 3 for Scooty");
System.out.println("Press 4 for Car");
System.out.println("Press 5 for seeing entered records");
System.out.println("Press 6 for Deleting all records");
System.out.println("***********************************");
menu=sc.nextInt();
if(menu==1)
{
	if(count<=50)
	{
	b++;
   amount=amount+150;
   count=count+1;
	}
	else
	{
      System.out.println("Parking area is full!!!!!");
	}
}
else if(menu==2)
{
	if(count<=50)
	{
	by++;
   amount=amount+50;
   count=count+1;
	}
	else
	{
      System.out.println("Parking area is full!!!!!");
	}
}
else if(menu==3)
{
	if(count<=50)
	{
	s++;
   amount=amount+100;
   count=count+1;
	}
	else
	{
      System.out.println("Parking area is full!!!!!");
	}
}
else if(menu==4)
{
	if(count<=50)
	{
	c++;
   amount=amount+300;
   count=count+1;
	}
	else
	{
      System.out.println("Parking area is full!!!!!");
	}
}
else if(menu==5)
{
System.out.println("............................................................");
System.out.println("............................................................");
System.out.println("Total Amount="+amount);
System.out.println("total number of vehicles parked="+count);
System.out.println("total number of bike parked="+b);
System.out.println("total number of bicycle parked="+by);
System.out.println("total number of scooty parked="+s);
System.out.println("total number of car parked="+c);
System.out.println("............................................................");
System.out.println("............................................................");
}
else if(menu==6)
{
  amount=0;
  count=0;  
  b=0;
  by=0;
  s=0;
 System.out.println("!!!All record is been deleted!!!");
}
}
}
}
