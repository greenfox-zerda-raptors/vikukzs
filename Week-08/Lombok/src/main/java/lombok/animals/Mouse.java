package lombok.animals;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.java.Log;
import lombok.foods.Food;

import java.util.logging.Logger;

/**
 * Created by kicsen on 2016. 12. 12..
 */
@Log
@EqualsAndHashCode
@ToString(callSuper = true)
public class Mouse extends AbstractAnimal {

    public Mouse(String name, long weightInGram, double happiness) {
        super(name, weightInGram, happiness);
    }

    public void feed(Food food) {
        super.feed(food);
    }

    public void logOwnInfo() {
        log.info(this.toString());
    }

    protected int getMoveHappinessDecrease() {
        return 3;
    }

    public static Mouse.MouseBuilder builder() {
        return new Mouse.MouseBuilder();
    }

    public static class MouseBuilder {
        private String name;
        private long weightInGram;
        private double happiness;

        MouseBuilder() {
        }

        public Mouse.MouseBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Mouse.MouseBuilder weightInGram(long weightInGram) {
            this.weightInGram = weightInGram;
            return this;
        }

        public Mouse.MouseBuilder happiness(double happiness) {
            this.happiness = happiness;
            return this;
        }

        public Mouse build() {
            return new Mouse(this.name, this.weightInGram, this.happiness);
        }

    }
}
