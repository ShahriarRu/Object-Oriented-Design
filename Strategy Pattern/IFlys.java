public interface IFlys {
    String fly();
}

class ItFlies implements IFlys {
    public String fly() {
        return "Flying High";
    }
}

class CantFly implements IFlys {
    public String fly() {
        return "I can't fly";
    }
}