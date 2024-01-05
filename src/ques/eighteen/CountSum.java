package ques.eighteen;

public record CountSum(Long count, Integer sum) {

    @Override
    public String toString() {
        return "CountSum{count: " + count + ", sum: " + sum + "}";
    }
}
