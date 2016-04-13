package selectsort;

public class ArraySel {

    private long[] a; 
    private int nElems;
    public ArraySel(int maxSize) {
	super();
	a= new long[maxSize];
	nElems = 0;
    }
    
    public void insert(long value) {
	a[nElems] = value;
	nElems++;
    }
    
    public void show() {
	for(int j= 0;j<nElems;j++) {
	    System.out.print(a[j]+" ");
	}
	System.out.println(" ");
    }

    public void selectSort() {
	int inner,outer,min;
	for(outer=0;outer<nElems-1;outer++) {
	    min = outer;
	    for(inner=outer+1;inner<nElems;inner++) {
		if(a[inner]<a[min])
		    min=inner;
	    }
	    swap(outer,min);
	}
    }
 
    
    public void swap(int value1,int value2) {
	long temp = a[value1];
	a[value1] = a[value2];
	a[value2] = temp;
    }
}
