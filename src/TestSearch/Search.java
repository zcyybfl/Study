package TestSearch;

public class Search {
    int zbSearch(int a[],int b){
        int begin=0;
        int end=a.length;
        int num=(begin+end)/2;
        while(begin<end){
            if(a[num]==b)
                return num+1;
            if(a[num]<b){
                begin=num+1;
                num=(begin+end)/2;
            }
            if(a[num]>b){
                end=num-1;
                num=(begin+end)/2;
            }
        }
        return num+1;
    }

}
