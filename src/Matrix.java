import java.util.Random;
public class Matrix {
    int[][]mas;
    int line;
    int column;
    public void set(int line, int column, int c){
        mas[line][column] = c;
    }
    public int get(int line,int column){
        return mas[line][column];
    }
    public Matrix(int line, int column){
        Random random = new Random();
        mas = new int[line][column];
        for(int i=0;i<mas.length;i++){
            for(int j=0;j<mas[i].length;j++){
                set(i,j,random.nextInt(10));
            }
        }
        this.line = line;
        this.column = column;
    }
    public void output(){
        for (int i=0;i<mas.length;i++){
            for(int j=0;j<mas[i].length;j++){
                System.out.print(get(i,j)+" ");
            }
            System.out.println();
        }
    }
    Matrix amount(Matrix mas){
        Matrix matr = new Matrix(mas.line,mas.column);
        for(int i=0;i<mas.line;i++){
            for(int j=0;j<mas.column;j++){
                matr.set(i,j,get(i,j)+mas.get(i,j));
            }
        }
        return matr;
    }
    Matrix mult(int n){
        Matrix matr = new Matrix(line,column);
        for(int i=0;i<mas.length;i++){
            for(int j=0;j<mas[i].length;j++){
                matr.set(i,j,get(i,j)*n);
            }
        }
        return matr;
    }
    Matrix matmultmat(Matrix mas){
        Matrix matr = new Matrix(mas.line,mas.column);
        int q = 0;
        for(int i=0;i<matr.line;i++){
            for(int j=0;j<matr.column;j++){
                if(matr.line<matr.column){
                    for(int p=0;p<matr.line;p++){
                        q = q + get(i,p)*matr.get(p,j);
                    }
                }
                else {
                    for(int p=0;p<matr.column;p++){
                        q = q + (get(i,p)*matr.get(p,j));
                    }
                }
                matr.set(i,j,q);
                q=0;
            }
        }
        return matr;
    }
}

