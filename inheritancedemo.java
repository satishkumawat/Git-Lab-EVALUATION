 class Book {
  Book()
 {
	
	 System.out.println("constructor of book");
 } 
 Book(int pages)
 {
	
	 System.out.println("parameterized constructor of book");
	 this.pages=pages;
 }
 protected int pages = 1500;

    public void message() {
        System.out.println("Number of pages: " + pages);
    }
	int getpages()
	{
		return pages;
	}
}
class Dictionary extends Book {

    private int definitions = 52500;
private int pages ;
Dictionary()
 {
	super.pages=2000;
	 System.out.println("constructor of Dictionary");
 }
 Dictionary(int pages,int definitions)
 { super(pages);
	 this.definitions=definitions;
	 System.out.println("parameterized constructor of Dictionary");
 }
    public void message() {
        System.out.println("Number of definitions" + definitions);
        System.out.println("Definitions per page: " + (definitions/getpages()));
		super.message();
    }
}

class inheritancedemo
{
public static void main(String args[])
{
Dictionary d=new Dictionary(2000,300000);
d.message();
//d.defMessage();
}
}