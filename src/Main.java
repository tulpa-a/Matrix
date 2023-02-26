public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3,3);
        Matrix matrix2 = new Matrix(3,3);
        System.out.println("Первая матрица: ");
        matrix1.output();
        System.out.println();
        System.out.println("Вторая матрица: ");
        matrix2.output();
        System.out.println();
        System.out.println("Сложение матриц: ");
        Matrix matrix3 = new Matrix(3,3);
        matrix3 = matrix1.amount(matrix2);
        matrix3.output();
        System.out.println();
        System.out.println("Умножение первой матрицы на 2: ");
        Matrix matrix4 = new Matrix(3,3);
        matrix4 = matrix1.mult(2);
        matrix4.output();
        System.out.println();
        System.out.println("Перемножение матриц : ");
        Matrix matrix5 = new Matrix(3,3);
        matrix5 = matrix1.matmultmat(matrix2);
        matrix5.output();
    }
}
