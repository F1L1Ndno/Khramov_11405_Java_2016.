public class AlgebraicClass implements AlgebraicInterface {
    @Override
    public void add(int x, int y) {
        System.out.print(x + y);
    }

    @Override
    public void sub(int x, int y) {
        System.out.print(x - y);
    }

    @Override
    public void mult(int x, int y) {
        System.out.print(x * y);
    }

    @Override
    public void div(int x, int y) {
        System.out.print(x / y);
    }

    @Override
    public void deg(int x, int y) {
        System.out.print(x % y);
    }
}
