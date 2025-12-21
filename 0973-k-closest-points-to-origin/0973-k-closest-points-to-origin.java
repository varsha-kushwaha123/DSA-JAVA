class Solution {
    
    class point implements Comparable<point>{
        int x;
        int y;
        int distsq;
     point(int x,int y,int distsq){
        this.x=x;
        this.y=y;
        this.distsq=distsq;
    }
    @Override
    public int compareTo(point p2){
      return this.distsq-p2.distsq;
    }
    }
  public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<point>pq=new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            int distsq=points[i][0]*points[i][0] +points[i][1]*points[i][1];
            pq.add(new point(points[i][0],points[i][1],distsq));
        }
        int arr[][]=new int [k][2];
        for(int i=0;i<k;i++){
            point temp=pq.remove();
            arr[i][0]=temp.x;
            arr[i][1]=temp.y;
           
        }
        return arr;
        
        
    }  
}