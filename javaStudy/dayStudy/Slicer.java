package javaStudy.dayStudy;

public interface Slicer {
	
	String[] knife = {"chef","fruit","Chinese"};
	
	public void selectKnife(int selectindex);
	
	public void sliceObject(String object);
	
	public void selectKnife(String object);
}
