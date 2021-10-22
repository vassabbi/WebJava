package task12.util;

public class ProgrammerBook extends Book{

	private String language;
	private int level;
	
	public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
		super(title, author, price, isbn);
		this.language = language;
		this.level = level;
	}
	
	public String getLanguage(){
        return this.language;
    }
	
	public int getLevel(){
        return this.level;
    }
	
	@Override
    public String toString() {
    	return super.toString() + ", language: " + this.language + ", level: " + this.level;
    }
    
    @Override
    public int hashCode() {
    	return super.hashCode() + this.language.hashCode() + this.level;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if (obj == null || obj.getClass() != this.getClass()) {
    		return false;
    	}
    	ProgrammerBook b = (ProgrammerBook)obj;
    	return (super.equals(obj) && this.language.equals(b.getLanguage()) && 
    			this.level == b.getLevel());
    }

}
