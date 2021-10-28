package class_02;

public class Level_1 {
    public static void main(String[] args) {
        Scanner input = new
                Scanner(System.in);
        n = input.nextint();
        while(n<5){
            System.out.println("n的值不能小于5，请重新输入！");
            n = input.nextint();
        }
        //i相当于控制的行数
        for(int i = 0;i < n+1;i++){
            for(int j = -4;j < 12*n/5+5;j++){
                System.out.print(checklslnBoundary(i,j)?"*":"");//三目运算符
                System.out.println();

            }
        }
        private static boolean checklslnBoundary(int i,int j){
            if(j>6*n/5){
                return checklslnHalfBoundary(i,6*n/5-j);
            }
        }
        private static boolean judgeOne(int x,int y){
            if(y>0){
                return y <=x&&y >=3*x-2*n;
            }
            return false;
        }
        private static boolean judge Two(int x,int y){
            if(y >=0 && x >=4*n/15){
                return y <=-3*x+2*n;
            }
        }
        return false;
    }
}
