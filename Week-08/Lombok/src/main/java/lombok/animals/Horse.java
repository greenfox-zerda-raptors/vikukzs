package lombok.animals;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.java.Log;
import lombok.foods.HorseFood;

import java.util.logging.Logger;

/**
 * Created by kicsen on 2016. 12. 12..
 */
@Log
@ToString(callSuper = true)
@EqualsAndHashCode
public class Horse extends AbstractAnimal {

    public Horse(String name, long weightInGram, double happiness) {
        super(name, weightInGram, happiness);
    }

    public void feed(HorseFood food) {
        super.feed(food);
    }

    public void logOwnInfo() {
        log.info(this.toString());
    }

    protected int getMoveHappinessDecrease() {
        return 1;
    }

    public static Horse.HorseBuilder builder() {
        return new Horse.HorseBuilder();
    }


    public static class HorseBuilder {
        private String name;
        private long weightInGram;
        private double happiness;

        HorseBuilder() {
        }

        public Horse.HorseBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Horse.HorseBuilder weightInGram(long weightInGram) {
            this.weightInGram = weightInGram;
            return this;
        }

        public Horse.HorseBuilder happiness(double happiness) {
            this.happiness = happiness;
            return this;
        }

        public Horse build() {
            return new Horse(this.name, this.weightInGram, this.happiness);
        }

    }
}
