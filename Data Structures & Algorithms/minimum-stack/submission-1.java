class MinStack {

    private final List<Integer> data;
    private final List<Integer> minValues;

    private int top = -1;
    private int minIndex = -1;

    public MinStack() {
        data = new ArrayList<>();
        minValues = new ArrayList<>();
    }
    
    public void push(int val) {
        data.add(val);
        top++;
        
        if(minValues.isEmpty() || minValues.get(minIndex) >= val) {
            minValues.add(val);
            minIndex++;
        }
    }
    
    public void pop() {
        int removedValue = data.removeLast();
        top--;

        if(removedValue == minValues.get(minIndex)) {
            minValues.removeLast();
            minIndex--;
        }
    }
    
    public int top() {
        return data.get(top);
    }
    
    public int getMin() {
        return minValues.get(minIndex);
    }
}
