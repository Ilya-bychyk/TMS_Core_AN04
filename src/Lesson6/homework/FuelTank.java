package Lesson6.homework;

// бензобак
public class FuelTank {
    private Integer currentAmount;
    private final Integer maxAmount;

    public FuelTank(Integer maxAmount) {
        this.maxAmount = maxAmount;
        this.currentAmount = 0;
    }

    // заправить
    public void fill(int amount) {
        if (currentAmount + amount <= maxAmount) {
            currentAmount += amount;
        } else {
            System.out.println("Бензобак столько не вмещает");
        }
    }

    public Integer getMaxAmount() {
        return maxAmount;
    }

    public Integer getCurrentAmount() {
        return currentAmount;
    }

    public void wasteFuel(int amount) {
        // можно добавить проверки на отрицательные и тд
        currentAmount -= amount;
    }
}