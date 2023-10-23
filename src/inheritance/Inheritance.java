package inheritance;

public class Inheritance {
    public static void main(String[] args) {
       
    }
}



class Box {
    int h;
    int w;
    int l;

    Box(int h, int w, int l) {
        this.h = h;
        this.w = w;
        this.l = l;
    }

    Box(Box other) {
        // super(other);
    }
    
}


class BoxWeight extends Box {
    int weight;

    BoxWeight(int h, int w, int l, int weight) {
        super(h, w, l);
        this.weight = weight;
    }

    BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }
}

class Square extends BoxWeight  {
    int cost;
    boolean isPossible() {
        return h == w && w == l;
    }

    Square(int side ,int weight,int cost) {
        super(side, side, side, weight);
        this.cost = cost;
    }

    Square(Square other) {
        super(other);
        this.cost = other.cost;
    }
    
    
}
