package kmeansimg;

public class Test {
	
	public static void main(String[] args){
		ImageCluster ic=new ImageCluster();
		ic.kmeans("/Users/mac/Desktop/xhr.jpeg",4,10);
	}
}