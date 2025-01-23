class MyException extends Exception {
    int marks;

    MyException(int m) {
        marks = m;
    }

    @Override
    public String toString() {
        return "MyException: Marks cannot be Negative or greater than 10";
    }
}

class Ex {
    static void test(int m) throws MyException {
        System.out.println("Called test(" + m + ")");
        if (m > 10) {
            throw new MyException(m);
        }
        System.out.println("Normal exit");
    }

    public static void main(String args[]) {
        try {
            test(1);    // Within the limit
            test(20);   // Exceeds the limit, will throw exception
        } catch (MyException e) {
            System.out.println("Caught " + e.toString());
        }
    }
}
