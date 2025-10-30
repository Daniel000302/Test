public class Alogrorith {

    //这章节是算法第一章的内容，用来测试算法
    //求数组中最大元素
    public static double SuZhuMax(double[] a){
        double max = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    //

    public static void main(String[] args) {
        double[] a={1,2,3,4,5,6,7,89};
        double number=SuZhuMax(a);
        System.out.println(number+"你好，算法22");
    }
}
