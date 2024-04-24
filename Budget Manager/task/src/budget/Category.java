package budget;

public enum Category {
    FOOD, CLOTHES, ENTERTAINMENT, OTHER;

    @Override
    public String toString() {
        String name = name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }
}
