package polymorphism;

public class Numbers {
    int answer;
    int sum(int a, int b) {
        return answer=a + b;
    }

    int sum(int a, int b, int c) {
        return answer=sum(a, b) + c;
    }

    int sum(int a, int b, int c, int d) {
        return answer=sum(a, b) + sum(c, d);
    }
    
    @Override
    public String toString() {
        return "Thank you for asking, the sum is: "+this.answer;
    }
}
